import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class ds {

    static final String pa = System.getProperty("user.home") + "\\" + "Desktop" + "\\";


    public static void main(String[] args) throws Exception {
        ruajpw(args[0], args[1]);
//        checkpw(args[0], args[1]);
    }

    public static void writeFile1(String path, String stringu) throws Exception {
        File file = new File(pa + path);
        FileWriter writer = new FileWriter(file, true);
        writer.write(stringu + "\n");
        writer.flush();
        writer.close();
    }

    public static void ruajpw(String argumenti, String argumenti1) throws Exception {
        System.out.println("Argumenti i par: " + argumenti);
        Password pas = new Password();
        Scanner input = new Scanner(System.in);

        System.out.println("Jep passwordin");
        String passi = input.nextLine();

        Pattern fileExtnPtrn = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}");
        Matcher mtch = fileExtnPtrn.matcher(passi);

        if (!mtch.matches()) {
            System.out.println("Passwordi se paku duhet te jet i gjat 6karaktere dhe te permbaj se paku nje simbol ose numer");
            System.exit(1);
        }

        System.out.println("Konfirmo passwordin");
        String passi1 = input.nextLine();

        if(!passi.equals(passi1)){
            System.out.println("Password doesnt match");
            System.exit(1);
        }

        String hashi = pas.getSaltedHash(passi);

        String komplet = argumenti + " " + hashi;

        writeFile1(argumenti1, komplet);
    }

    public static void checkpw(String argumenti, String argumenti1) throws Exception {
        System.out.println("Argumenti i par: " + argumenti);
        Password pas = new Password();
        Scanner input = new Scanner(System.in);
        System.out.println("Jep passwordin");
        String passi = input.nextLine();

        try {
            String line = "";
            BufferedReader br = new BufferedReader(new FileReader(pa + argumenti1));
            while ((line = br.readLine()) != null) {
                boolean bool = line.split(" ")[0].equals(argumenti);

               if(bool){
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
            System.err.println("Gabim: Celesi '" + argumenti + "'" + " nuk ekziston.");
        } catch (Exception e) {
            System.err.println("Gabim: fajlli '" + argumenti + "' nuk ekziston.");
        }

    }
}