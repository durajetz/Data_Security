class Arguments {
    Count c = new Count();
    Tapcode t = new Tapcode();
    Case c2 = new Case();
    Key k1 = new Key();

    public void count(String[] args) {
        if (args.length != 3) {
            System.out.println("wrong args");
            System.exit(1);
        }
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
    }

    public void tapcode(String[] args) {
        if (args.length != 3) {
            System.err.println("wrong args");
            System.exit(1);
        }
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
    }

    public void casecmd(String[] args) {
        if (args.length != 3) {
            System.err.println("wrong args");
            System.exit(1);
        }
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
        }
    }

    public void usercreate(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("wrong args");
            System.exit(1);
        }
        k1.saveFile(args[1]);
    }

    public void userdelete(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("wrong args");
            System.exit(1);
        }
        k1.deleteFile(args[1]);
    }

    public void exportkey(String[] args) throws Exception {
        if (args.length == 3) {
            switch (args[1].toLowerCase()) {
                case "public":
                    k1.exportFile(args[2], ".pub.xml", args[1]);
                    break;
                case "privat":
                    k1.exportFile(args[2], ".xml", args[1]);
                    break;
                default:
                    System.out.println("CorrectWay: <public|privat> <name> [file]");
            }
        } else if (args.length == 4) {
            switch (args[1].toLowerCase()) {
                case "public":
                    k1.copyFile(args[2], ".pub.xml", args[3], args[1]);
                    break;
                case "privat":
                    k1.copyFile(args[2], ".xml", args[3], args[1]);
                    break;
                default:
                    System.out.println("CorrectWay: <public|privat> <name> [file]");
            }
        } else {
            System.out.println("wrong args");
            System.exit(1);
        }

    }

    public void importkey(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println("wrong args");
            System.exit(1);
        }
        k1.importKey(args[1], args[2]);
    }

    public void writemessage(String[] args) throws Exception {
        if (args.length == 3) {
            k1.writeMessage(args[1], args[2], "");
        } else {
            k1.writeMessage(args[1], args[2], args[3]);
        }
    }

    public void readmessage(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("wrong args");
            System.exit(1);
        }
        k1.readMessage(args[1]);
    }

}