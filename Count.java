
public class Count {
    // COUNT LINES
    public int lines(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        String[] lines = s.split("\n|\r");
        return lines.length;
    }

    // COUNT WORDS
    public int words(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        String[] words = s.split("\\s+");
        return words.length;
    }

    // COUNT LETTERS
    public int letters(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c))
                count++;
        }
        return count;
    }

    // COUNT SYMBOLS


    // COUNT VOWELS
    public int vowels(String s) {
        int count1 = 0;
        s = s.toLowerCase();
        for(char ch : s.toCharArray()) {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count1++; }
        }
        return count1;
    }
}
