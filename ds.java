import java.security.*;

public class ds {
    public static void main(String[] args) throws Exception {
        Count c = new Count();
        Tapcode t = new Tapcode();
        Case c2 = new Case();
        Key k1 = new Key();

//        if(args.length != 3) {
//            System.out.println("No arguments provided! Expect exactly 3");
//            System.exit(1);
//        } -----> to be changed soon
        
        if (args[0].equalsIgnoreCase("count")) {
            switch (args[1].toLowerCase()) {
                case "lines":
                    System.out.println("Lines: " + c.lines(args[2]));
                    break;
                case "words":
                    System.out.println("Words: " + c.words(args[2]));
                    break;
                case "letters":
                    System.out.println("Letters: " + c.letters(args[2]));
                    break;
                case "vowels":
                    System.out.println("Vowels: " + c.vowels(args[2]));
                    break;
                case "symbols":
                    System.out.println("Symbols: " + c.symbols(args[2]));
                    break;
                case "consonants":
                    System.out.println("Consonants: " + c.consonants(args[2]));
                    break;
                case "sentences":
                    System.out.println("Sentences: " + c.sentences(args[2]));
                    break;
                default:
                    System.out.println("CorrectWay: <unit(lines,words,letters,vowels,symbols,consonants,sentences)> <text>");
            }
        } else if (args[0].equalsIgnoreCase("tap-code")) {
            switch (args[1].toLowerCase()) {
                case "encode":
                    t.encode(args[2]);
                    break;
                case "decode":
                    t.decode(args[2]);
                    break;
                default:
                    System.out.println("CorrectWay: <code(encode,decode)> <text>");

            }
        } else if (args[0].equalsIgnoreCase("case")) {
            switch (args[1].toLowerCase()) {
                case "lower":
                    System.out.println("Lower: " + c2.lower(args[2]));
                    break;
                case "upper":
                    System.out.println("Upper: " + c2.upper(args[2]));
                    break;
                case "capitalize":
                    System.out.println("Capitalize: " + c2.capitalize(args[2]));
                    break;
                case "inverse":
                    System.out.println("Inverse: " + c2.inverse(args[2]));
                    break;
                case "alternating":
                    System.out.println("Alternating: " + c2.alternating(args[2]));
                    break;
                case "sentence":
                    System.out.println("Sentence: " + c2.sentence(args[2]));
                    break;
                default:
                    System.out.println("CorrectWay: <case(lower,upper,capitalize,inverse,alternating)> <text>");
            }else if (args[0].equalsIgnoreCase("create-user")) {
                k1.saveFile(args[1]);
            } else if (args[0].equalsIgnoreCase("delete-user")) {
                k1.deleteFile(args[1]);
        } else if(args[0].equalsIgnoreCase("export-key")){
            if(args.length == 3){
                switch (args[1].toLowerCase()) {
                    case "public": k1.exportFile(args[2], ".pub.xml", args[1]);break;
                    case "privat": k1.exportFile(args[2], ".xml", args[1]);break;
                    default: System.out.println("CorrectWay: <public|private> <name> [file]");
                }
            }else {
                switch (args[1].toLowerCase()){
                    case "public": k1.copyFile(args[2], ".pub.xml", args[3],args[1]);break;
                    case "privat": k1.copyFile(args[2], ".xml", args[3],args[1]);break;
                    default: System.out.println("CorrectWay: <public|private> <name> [file]");}
            }
            else System.out.println("Invalid command!");
    }
}
