public class count {
    public static void main(String[] args) {
    
        if(args.length == 2) {
            String str = args[0];
            switch (str.toLowerCase()) {
                case "lines":
                    System.out.println("Lines: " + lines(args[1])); break;
                case "words":
                    System.out.println("Words: " + words(args[1])); break;
                case "letters":
                    System.out.println("Letters: " + letters(args[1])); break;
                case "vowels":
                    System.out.println("Vowels: " + vowels(args[1])); break;
                default:
                    System.out.println("Correct way: <unit(lines,words,letters,symbols,vowels,consonants,sentences)> <text>");
            }
        }else System.out.println("Wrong! The number of arguments must be 2");

    }

    // COUNT LINES
    public static int lines(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        String[] lines = s.split("\n|\r");
        return lines.length;
    }

    // COUNT WORDS
    public static int words(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        String[] words = s.split("\\s+");
        return words.length;
    }

    // COUNT LETTERS
    public static int letters(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c))
                count++;
        }
        return count;
    }

    // COUNT VOWELS
    public static int vowels(String s) {
        int count1 = 0;
        s = s.toLowerCase();
        for(char ch : s.toCharArray()) {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count1++; }
        }
        return count1;
    }
}

// COUNT SYMBOLS     --->             
// COUNT CONSONANTS  ------->       /3MORE TO GO/             coming soon....
// COUNT SENTENCES   --->
