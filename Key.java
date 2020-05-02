import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.*;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import java.util.Base64;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Key {
    static final String pa = System.getProperty("user.home") + "\\" + "Desktop" + "\\" + "keys" + "\\";
    static final String NL = System.getProperty("line.separator");

    public String getPrivateKeyAsXml(PrivateKey privateKey) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        RSAPrivateCrtKeySpec spec = keyFactory.getKeySpec(privateKey, RSAPrivateCrtKeySpec.class);
        StringBuilder sb = new StringBuilder();

        sb.append("<RSAKeyValue>" + NL);
        sb.append(getElement("Modulus", spec.getModulus()));
        sb.append(getElement("Exponent", spec.getPublicExponent()));
        sb.append(getElement("P", spec.getPrimeP()));
        sb.append(getElement("Q", spec.getPrimeQ()));
        sb.append(getElement("DP", spec.getPrimeExponentP()));
        sb.append(getElement("DQ", spec.getPrimeExponentQ()));
        sb.append(getElement("InverseQ", spec.getCrtCoefficient()));
        sb.append(getElement("D", spec.getPrivateExponent()));
        sb.append("</RSAKeyValue>");

        return sb.toString();
    }

    public String getPublicKeyAsXml(PublicKey publicKey) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        RSAPublicKeySpec spec = keyFactory.getKeySpec(publicKey, RSAPublicKeySpec.class);
        StringBuilder sb = new StringBuilder();

        sb.append("<RSAKeyValue>" + NL);
        sb.append(getElement("Modulus", spec.getModulus()));
        sb.append(getElement("Exponent", spec.getPublicExponent()));
        sb.append("</RSAKeyValue>");

        return sb.toString();
    }

    public String getElement(String name, BigInteger bigInt) throws Exception {
        byte[] bytesFromBigInt = getBytesFromBigInt(bigInt);
        String elementContent = getBase64(bytesFromBigInt);
        return String.format("  <%s>%s</%s>%s", name, elementContent, name, NL);
    }

    public byte[] getBytesFromBigInt(BigInteger bigInt) {
        byte[] bytes = bigInt.toByteArray();
        int length = bytes.length;

        if (length % 2 != 0 && bytes[0] == 0) {
            bytes = Arrays.copyOfRange(bytes, 1, length);
        }
        return bytes;
    }

    public String getBase64(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes);
    }

    public KeyPair generateKey() throws NoSuchAlgorithmException {
        KeyPairGenerator kg = KeyPairGenerator.getInstance("RSA");
        kg.initialize(1024);
        KeyPair keyPair = kg.generateKeyPair();
        return keyPair;
    }

    public void writeFile(String content, String path) throws Exception {
        try {
            PrintWriter writer = new PrintWriter(path);
            writer.write(content);
            writer.close();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

    public String readFile(String path) throws Exception {
        String content = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
        return content;
    }

    public void saveFile(String argumenti) throws Exception {
        KeyPair keyPair = generateKey();

        PrivateKey privateKey = keyPair.getPrivate();
        PublicKey publicKey = keyPair.getPublic();

        String privateKeyAsXml = getPrivateKeyAsXml(privateKey);
        String publicKeyAsXml = getPublicKeyAsXml(publicKey);

        String s = pa.replaceAll("/", "\\/");
        Path path = Paths.get(pa + argumenti + ".xml");
        File file = new File(pa);
        boolean bool = file.mkdir();
        if (!Files.exists(path) || bool) {
            writeFile(privateKeyAsXml, s + argumenti + ".xml");
            writeFile(publicKeyAsXml, s + argumenti + ".pub.xml");
            System.out.println("Eshte krijuar celesi privat 'keys/" + argumenti + ".xml'\n" +
                    "Eshte krijuar celesi publik 'keys/" + argumenti + ".pub.xml'");
        } else System.out.println("Gabim: Celesi '" + argumenti + "' ekziston paraprakisht.");
    }

    public void deleteFile(String argumenti) {
        File folder = new File(pa);
        Path path = Paths.get(pa + argumenti + ".xml");
        Path path1 = Paths.get(pa + argumenti + ".pub.xml");

        if (Files.exists(path) || Files.exists(path1)) {
            for (File file : folder.listFiles()) {
                if (file.getName().equals(argumenti + ".pub.xml")) {
                    file.delete();
                    System.out.println("Eshte larguar celesi public 'keys/" + file.getName() + "'");
                } else if (file.getName().equals(argumenti + ".xml")) {
                    file.delete();
                    System.out.println("Eshte larguar celesi privat 'keys/" + file.getName() + "'");
                }
            }
        } else System.out.println("Gabim: Celesi '" + argumenti + "' nuk ekziston.");
    }

    public void exportFile(String argumenti, String ext, String celesi) throws Exception {
        File f = new File(pa + argumenti + ext);
        if (!f.exists()) {
            System.out.println("Gabim: Celesi " + celesi + " '" + argumenti + "'" + " nuk ekziston.");
            return;
        }
        System.out.println(readFile(pa + argumenti + ext));
    }

    public void copyFile(String argumenti, String ext, String argumenti1, String celesi) throws Exception {
        try {
            String file = readFile(pa + argumenti + ext);
            writeFile(file, pa1 + argumenti1);
            System.out.println("Celesi " + celesi + " u ruajt ne fajllin '" + argumenti1 + "'.");
        } catch (Exception e) {
            System.err.println("Gabim: Celesi " + celesi + " '" + argumenti + "'" + " nuk ekziston.");
        }
    }

    public void importKey(String argumenti, String argumenti1) throws Exception {
        File f = new File(pa + argumenti1 + ".xml");
        File f1 = new File(pa + argumenti1 + ".pub.xml");

        if (f.exists() || f1.exists()) {
            System.out.println("Gabim: Celesi '" + argumenti1 + "' ekziston paraprakisht.");
            return;
        } else if (argumenti.startsWith("http://") || argumenti.startsWith("https://")) {
            getRequest(argumenti, argumenti1);
            return;
        } else if (!argumenti.endsWith(".xml")) {
            System.out.println("Gabim: Fajlli i dhene nuk eshte celes valid.");
            return;
        }

        try {
            findKey(readFile(pa1 + argumenti), argumenti, argumenti1);
        } catch (Exception e) {
            System.err.println("Gabim: fajlli '" + argumenti + "' nuk ekziston.");
        }
    }

    public void findKey(String content, String argumenti, String argumenti1) throws Exception {
        KeyPair keyPair = generateKey();
        PublicKey publicKey = keyPair.getPublic();
        String searchword = "<P>";
        boolean isPrivate = content.contains(searchword);
        String extension = isPrivate ? ".xml" : ".pub.xml";
        if (!isPrivate) {
            writeFile(content, pa + argumenti1 + extension);
            System.out.println("Celesi publik u ruajt ne fajllin 'keys/" + argumenti1 + ".pub.xml'.");
        } else {
            writeFile(content, pa + argumenti1 + extension);
            writeFile(getPublicKeyAsXml(publicKey), s + argumenti1 + ".pub.xml");
            System.out.println("Celesi privat u ruajt ne fajllin 'keys/" + argumenti1 + ".pub.xml'.\n" +
                    "Celesi publik u ruajt ne fajllin 'keys/" + argumenti1 + ".pub.xml'.");
        }
    }

    public void getRequest(String argumenti, String argumenti1) throws Exception {
        try {
            URL urlObj = new URL(argumenti);
            HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();
            con.setRequestMethod("GET");
            InputStream is = con.getInputStream();
            String content = new BufferedReader(new InputStreamReader(is)).lines().collect(Collectors.joining("\n"));
            findKey(content, argumenti, argumenti1);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
    
    public SecretKey generateDesKey() throws NoSuchAlgorithmException {
        SecretKey secKey = null;
        try {
            KeyGenerator generator = KeyGenerator.getInstance("DES");
            generator.init(56);
            secKey = generator.generateKey();
        } catch (Exception e) {
            System.err.println("Error: " + e);
            //e.printStackTrace();
        }
        return secKey;
    }

    public PublicKey returnPublicKey(String argumenti) throws Exception {
        SAXBuilder builder = new SAXBuilder();
        File xmlProductFile = new File(pa + argumenti + ".pub.xml");
        Document document = builder.build(xmlProductFile);
        Element root = document.getRootElement();

        Element modulusElem = root.getChild("Modulus");
        Element exponentElem = root.getChild("Exponent");

        byte[] modBytes = Base64.getDecoder().decode(modulusElem.getText().trim());
        byte[] expBytes = Base64.getDecoder().decode(exponentElem.getText().trim());

        BigInteger modules = new BigInteger(1, modBytes);
        BigInteger exponent = new BigInteger(1, expBytes);


        KeyFactory factory = KeyFactory.getInstance("RSA");
        RSAPublicKeySpec pubSpec = new RSAPublicKeySpec(modules, exponent);
        PublicKey pubKey = factory.generatePublic(pubSpec);

        return pubKey;
    }

    public PrivateKey returnPrivateKey(String argumenti) throws Exception {
        SAXBuilder builder = new SAXBuilder();
        File xmlPrivateFile = new File(pa + argumenti + ".xml");
        Document document = builder.build(xmlPrivateFile);
        Element root = document.getRootElement();

        Element modulusElem = root.getChild("Modulus");
        Element dElem = root.getChild("D");

        byte[] modBytes = Base64.getDecoder().decode(modulusElem.getText().trim());
        byte[] dBytes = Base64.getDecoder().decode(dElem.getText().trim());

        BigInteger modules = new BigInteger(1, modBytes);
        BigInteger d = new BigInteger(1, dBytes);

        KeyFactory factory = KeyFactory.getInstance("RSA");

        RSAPrivateKeySpec privSpec = new RSAPrivateKeySpec(modules, d);
        PrivateKey privKey = factory.generatePrivate(privSpec);

        return privKey;
    }
}

