class Arguments {

    public static void count(String[] args) {
        if (args.length != 3) {
            System.out.println("Error: Invalid number of arguments provided!\nExpect: <count> <function> <text>");
            System.exit(1);
        }
        switch (args[1].toLowerCase()) {
            case "lines":
                System.out.println("Lines: " + Count.lines(args[2]));
                break;
            case "words":
                System.out.println("Words: " + Count.words(args[2]));
                break;
            case "letters":
                System.out.println("Letters: " + Count.letters(args[2]));
                break;
            case "vowels":
                System.out.println("Vowels: " + Count.vowels(args[2]));
                break;
            case "symbols":
                System.out.println("Symbols: " + Count.symbols(args[2]));
                break;
            case "consonants":
                System.out.println("Consonants: " + Count.consonants(args[2]));
                break;
            case "sentences":
                System.out.println("Sentences: " + Count.sentences(args[2]));
                break;
            default:
                System.out.println("Expect: <unit> <lines|words|letters|vowels|symbols|consonants|sentences> <text>");
        }
    }

    public static void tapcode(String[] args) {
        if (args.length != 3) {
            System.err.println("Error: Invalid number of arguments provided!\nExpect: <tap-code> <function> <text>");
            System.exit(1);
        }
        switch (args[1].toLowerCase()) {
            case "encode":
                Tapcode.encode(args[2]);
                break;
            case "decode":
                Tapcode.decode(args[2]);
                break;
            default:
                System.out.println("Expect: <code> <encode|decode> <text>");
        }
    }

    public static void casecmd(String[] args) {
        if (args.length != 3) {
            System.err.println("Error: Invalid number of arguments provided!\nExpect: <case> <function> <text>");
            System.exit(1);
        }
        switch (args[1].toLowerCase()) {
            case "lower":
                System.out.println("Lower: " + Case.lower(args[2]));
                break;
            case "upper":
                System.out.println("Upper: " + Case.upper(args[2]));
                break;
            case "capitalize":
                System.out.println("Capitalize: " + Case.capitalize(args[2]));
                break;
            case "inverse":
                System.out.println("Inverse: " + Case.inverse(args[2]));
                break;
            case "alternating":
                System.out.println("Alternating: " + Case.alternating(args[2]));
                break;
            case "sentence":
                System.out.println("Sentence: " + Case.sentence(args[2]));
                break;
            default:
                System.out.println("Expect: <case> <lower|upper|capitalize|inverse|alternating> <text>");
        }
    }

    public static void usercreate(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Error: Invalid number of arguments provided!\nExpect: <create-user> <user>");
            System.exit(1);
        }
        Key.saveFile(args[1]);
    }

    public static void userdelete(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Error: Invalid number of arguments provided!\nExpect: <delete-user> <user>");
            System.exit(1);
        }
        Key.deleteFile(args[1]);
    }

    public static void exportkey(String[] args) throws Exception {
        if (args.length == 3) {
            switch (args[1].toLowerCase()) {
                case "public":
                    Key.exportFile(args[2], ".pub.xml", args[1]);
                    break;
                case "privat":
                    Key.exportFile(args[2], ".xml", args[1]);
                    break;
                default:
                    System.out.println("Expect: <public|privat> <user> [file]");
            }
        } else if (args.length == 4) {
            switch (args[1].toLowerCase()) {
                case "public":
                    Key.copyFile(args[2], ".pub.xml", args[3], args[1]);
                    break;
                case "privat":
                    Key.copyFile(args[2], ".xml", args[3], args[1]);
                    break;
                default:
                    System.out.println("Expect: <public|privat> <user> [file]");
            }
        } else {
            System.out.println("Error: Invalid number of arguments provided!\nExpect: <export-key> <public|privat> <user> [file]");
            System.exit(1);
        }

    }

    public static void importkey(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println("Error: Invalid number of arguments provided!\nExpect: <import-key> <(user.home)/file> <user>");
            System.exit(1);
        }
        Key.importKey(args[1], args[2]);
    }

    public static void writemessage(String[] args) throws Exception {
        if (args.length == 3) {
            Key.writeMessage(args[1], args[2], null,null);
        } else if (args.length == 4){
            Key.writeMessage(args[1],args[2],args[3],null);
        }else if (args.length == 5){
            if (args[3].equals("--sender")){
                Key.writeMessage(args[1],args[2],null,args[4]);
            }else System.out.println("Error: Invalid number of arguments provided!\nExpect: --sender <token>");
        }else if(args.length == 6){
            if(args[4].equals("--sender")){
                Key.writeMessage(args[1],args[2],args[3],args[5]);
            }else System.out.println("Error: Invalid number of arguments provided!\nExpect: [file] --sender <token>");
        }else {
            System.err.println("Error: Invalid number of arguments provided!\nExpect: <user> <message> [file] [--sender <token>]");
            System.exit(1);
        }
    }

    public static void readmessage(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Error: Invalid number of arguments provided!\nExpect: <read-message> <encrypted|path>");
            System.exit(1);
        }
        Key.readMessage(args[1]);
    }

    public static void login(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Error: Invalid number of arguments provided!\nExpect: <login> <user>");
            System.exit(1);
        }
        Loginsystem.checkpw(args[1]);
    }

    public static void status(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Error: Invalid number of arguments provided!\nExpect: <status> <token>");
            System.exit(1);
        }
        JWT.verifikojwt(args[1]);
    }

}
