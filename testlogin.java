import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.nio.file.*;


public class ds {

    static final String pa = System.getProperty("user.home") + "\\" + "Desktop" + "\\";


    public static void main(String[] args) throws Exception {
        ruajpw(args[0]);
//        checkpw(args[0]);
//        deletepw(args[0]);
    }

    public static void writeFile1(String path, String stringu) throws Exception {
        File file = new File(pa + path);
        FileWriter writer = new FileWriter(file, true);
        writer.write(stringu + "\n");
        writer.flush();
        writer.close();
    }

    public static void ruajpw(String argumenti) throws Exception {
        Password pas = new Password();
        Scanner input = new Scanner(System.in);

        System.out.print("Jepni fjalkalimin: ");
        String passi = input.nextLine();

        Pattern fileExtnPtrn = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[@#$%^&+=_.!&-])(?=\\S+$).{6,}");
        Matcher mtch = fileExtnPtrn.matcher(passi);

        if (!mtch.matches()) {
            System.out.println("\nGabim: Fjalkalimi se paku duhet te permbaj " + "\n/ 6 karaktere" + "/ Nje numer" + " / Nje simbol");
            System.exit(1);
        }

        System.out.print("Perserit fjalkalimin: ");
        String passi1 = input.nextLine();

        if (!passi.equals(passi1)) {
            System.out.println("Gabim: Fjalekalimet nuk perputhen.");
            System.exit(1);
        }

        input.close();
        String hashi = pas.getSaltedHash(passi);

        String komplet = argumenti + " " + hashi;

        writeFile1("database.txt", komplet);
    }

    public static void deletepw(String s) throws Exception {
        File inputFile = new File(pa + "database.txt");
        File tempFile = new File(pa + "tempfile.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;

        while((currentLine = reader.readLine()) != null) {
            boolean bool = currentLine.split(" ")[0].equals(s);
            if(bool) continue;
            writer.write(currentLine + System.getProperty("line.separator"));
        }
        writer.close();
        reader.close();
        inputFile.delete();
        boolean successful = tempFile.renameTo(inputFile);
    }

    public static void checkpw(String argumenti) throws Exception {
        Password pas = new Password();
        Scanner input = new Scanner(System.in);
        System.out.print("Jepni fjalkalimin: ");
        String passi = input.nextLine();

        try {
            String line = "";
            BufferedReader br = new BufferedReader(new FileReader(pa + "database.txt"));
            while ((line = br.readLine()) != null) {
                boolean bool = line.split(" ")[0].equals(argumenti);

                if (bool) {
                    boolean paswordi = pas.check(passi, line.split("\\s+|\n")[1]);
                    if (paswordi == true) {
                        System.out.println("Passwordi korrekt");
                    } else {
                        System.out.println("inkorrekt");
                    }
                    break;
                }

            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Gabim: Fajlli '" + argumenti + "'" + " nuk ekziston.");
        } catch (Exception e) {
            System.err.println("Gabim: fajlli '" + argumenti + "' nuk ekziston.");
        }

    }
}