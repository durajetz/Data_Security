import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.nio.file.*;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.SecureRandom;
import java.util.Base64;

public class Loginsystem {

    static final String pa = System.getProperty("user.home") + "\\" + "Desktop" + "\\";
    static final int iterations = 20*1000;
    static final int saltLen = 32;
    static final int desiredKeyLen = 256;

    public static void writeFile1(String path, String stringu) throws Exception {
        File file = new File(pa + path);
        FileWriter writer = new FileWriter(file, true);
        writer.write(stringu + "\n");
        writer.flush();
        writer.close();
    }

    public static String getSaltedHash(String password) throws Exception {
        byte[] salt = SecureRandom.getInstance("SHA1PRNG").generateSeed(saltLen);
        return Base64.getEncoder().encodeToString(salt) + "$" + hash(password, salt);
    }

    public static boolean check(String password, String stored) throws Exception{
        String[] saltAndHash = stored.split("\\$");
        String hashOfInput = hash(password, Base64.getDecoder().decode(saltAndHash[0]));
        return hashOfInput.equals(saltAndHash[1]);
    }

    public static String hash(String password, byte[] salt) throws Exception {
        if (password == null || password.length() == 0)
            throw new IllegalArgumentException("Empty passwords are not supported.");
        SecretKeyFactory f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        SecretKey key = f.generateSecret(new PBEKeySpec(
                password.toCharArray(), salt, iterations, desiredKeyLen));
        return Base64.getEncoder().encodeToString(key.getEncoded());
    }

    public static void ruajpw(String argumenti) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Jepni passwordin: ");
        String passi = input.nextLine();

        Pattern fileExtnPtrn = Pattern.compile("^(?=\\D*\\d)(?=[^a-z]*[a-z])[\\w~@#$%^&*+=`|{}:;!.?\\\"()\\[\\]-]{6,}$");

        Matcher mtch = fileExtnPtrn.matcher(passi);

        if (!mtch.matches()) {
            System.out.println("Gabim: Fjalkalimi se paku duhet te permbaj " + "(6karaktere)" + "(1numer)" + "[simbol]");
            System.exit(1);
        }

        System.out.print("Perseritni passwordin: ");
        String passi1 = input.nextLine();

        if (!passi.equals(passi1)) {
            System.out.println("Gabim: Fjalkalimet nuk perputhen.");
            System.exit(1);
        }

        input.close();
        String hashi = getSaltedHash(passi);

        String komplet = argumenti + " " + hashi;

        writeFile1("database.txt", komplet);
    }

    public static void deletepw(String argumenti) throws Exception {
        File inputFile = new File(pa + "database.txt");
        File tempFile = new File(pa + "tempfile.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;

        while((currentLine = reader.readLine()) != null) {
            boolean bool = currentLine.split(" ")[0].equals(argumenti);
            if(bool) continue;
            writer.write(currentLine + System.getProperty("line.separator"));
        }
        writer.close();
        reader.close();
        inputFile.delete();
        boolean successful = tempFile.renameTo(inputFile);
    }

    public static void checkpw(String argumenti) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Jepni fjalkalimin: ");
        String passi = input.nextLine();

        String content = Key.readFile(pa + "database.txt");

        if(!content.contains(argumenti)){
            System.out.println("Gabim: Shfrytezuesi ose fjalekalimi i gabuar.");
            System.exit(1);
        }

        try {
            String line = "";
            BufferedReader br = new BufferedReader(new FileReader(pa + "database.txt"));
            while ((line = br.readLine()) != null) {
                boolean bool = line.split(" ")[0].equals(argumenti);

                if (bool) {
                    boolean paswordi = check(passi, line.split("\\s+|\n")[1]);
                    if (paswordi) {
                        System.out.println(JWT.krijojwt(argumenti));
                    } else {
                        System.out.println("Gabim: Shfrytezuesi ose fjalekalimi i gabuar.");
                        System.exit(1);
                    }
                    break;
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Gabim: celesi '" + argumenti + "' nuk ekziston.");
        }
    }

}