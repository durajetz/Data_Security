class Tapcode
{
    public void encode(String s)
    {
        String[] fjalet=s.toLowerCase().split( " ");

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
}
