


public class Count {
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

        // COUNT SYMBOLS
        public static int symbols(String s){
            int count2 = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (s.substring(i, i + 1).matches("[^A-Za-z0-9 ]") && !Character.isWhitespace(ch)) {
                    count2++;
                }
            }
            return count2;
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

        // COUNT CONSONANTS
        public static int consonants(String s){
            int count3 = 0;
            s = s.toLowerCase();
            for (char ch1 : s.toCharArray()){
                if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' ){
                    System.out.print("");
                }else if(Character.isLetter(ch1) && ch1 != ' '){
                    count3++;
                }
            }
            return count3;
        }

        // COUNT SENTENCES
        public static int sentences(String s){
            String[] sentence = s.split("[!?.:]+");
            return sentence.length;
        }

}
