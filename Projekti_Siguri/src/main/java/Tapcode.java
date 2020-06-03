class Tapcode
{
    public static void encode(String s)
    {
        String[] fjalet=s.toLowerCase().split(" ");

        for (int i = 0; i < fjalet.length; i++) {
            int row, col;
            for (int g = 0;g < fjalet[i].length(); g++) // browse through every character
            {
                row = ((fjalet[i].charAt(g) - 'a') / 5) + 1;  // finding row of the table
                col = ((fjalet[i].charAt(g) - 'a') % 5) + 1;  // finding column of the table

                if (fjalet[i].charAt(g) == 'k')  // if character is 'k' (count like 'c' 1 3)
                {
                    row = 1;
                    col = 3;
                }

                else if (fjalet[i].charAt(g) >= 'k') // if character is greater than 'k'
                {
                    if (col == 1)
                    {
                        col = 6;
                        row = row - 1;
                    }
                    col = col - 1;

                }
                for (int j = 0;j<row;j++){ // converting rownumber to dots(e.g 'F' is in second row(2) -> ..)
                    System.out.print(".");
                }                                                                                                 // 'f' -> 21 ->.. .
                System.out.print(" "); // converting colnumber to dots(e.g 'F' is in first col(1) -> .)
                for (int k = 0;k<col;k++){
                    System.out.print(".");
                }
                System.out.print("  ");

            }
            for (int j = i; j < fjalet.length-1; j++) {
                System.out.print("/  ");
                break;
            }

        }

    }

    public static void decode(String input) {
        final String[] codeAlphabet = {". .", ". ..", ". ...", ". ....", ". .....", ".. .", ".. ..", ".. ...", ".. ....", ".. .....",". ...", "... .", "... ..",
                "... ...", "... ....", "... .....", ".... .", ".... ..", ".... ...", ".... ....", ".... .....", "..... .", "..... ..","..... ...", "..... ....","..... ....." };
        String wordDecode="";
        if(input == null || input.trim().isEmpty()) {
            System.out.println("Invalid input! It must be a tapcode input");
        }
        String[] words = input.split("\n"); // split to lines
        for (int i = 0; i < words.length; i++) {
            String[] letters = words[i].split("  "); // split words to letters
            for (int j = 0; j < letters.length; j++) {
                for (int v = 0; v < codeAlphabet.length; v++) {
                    if(letters[j].equals(". ...")){ // pa qet kusht kur eshte inputi ". ..." ,output del "ck"
                        wordDecode += 'c';
                        break;}
                    if (letters[j].equals(codeAlphabet[v])) {
                        wordDecode += (char) ((int) ('A') + v);
                    }else  if(letters[j].equals("/")){
                        wordDecode += " ";
                        break;
                    }
                }
            }
        }
        System.out.print(wordDecode.toLowerCase());
    }
}
