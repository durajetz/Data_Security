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

    public void writeFile(String text, String filename) throws Exception {
        try (PrintWriter writer = new PrintWriter(filename)) {
            writer.write(text);
        }
    }

    public void saveFile(String argumenti) throws Exception{
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
}
