

public class Case {

    public static String lower(String s) {
        String st = s.toLowerCase();
        return st;

    }

    public static String upper(String s) {
        String st = s.toUpperCase();
        return st;

    }

    public static String inverse(String s) {
        char[] chars = s.toCharArray();
        for(int i = 0 ;i < chars.length; i++) {
            chars[i] = Character.isUpperCase(chars[i])
                    ? Character.toLowerCase(chars[i])
                    : Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }

    public static String capitalize(String str){
        String words[]=str.split("\\s");
        String capitalizeWord="";
        for(String w:words){
            String first=w.substring(0,1);
            String afterfirst=w.substring(1);
            capitalizeWord+=first.toUpperCase()+afterfirst.toLowerCase()+" ";
        }
        return capitalizeWord.trim();
    }

    public static String alternating(String s) {
        char[] chars = s.toCharArray();
        for(int i = 0 ;i < chars.length; i++) {
            chars[i] = i%2 == 0
                    ? Character.toLowerCase(chars[i])
                    : Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }

    public static String sentence(String string) {
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (chars[i]=='.' || chars[i]=='\'' || chars[i]=='?' || chars[i]=='!') {
                // You can add other chars here
                found = false;
            }
        }
        return String.valueOf(chars);
    }

}
