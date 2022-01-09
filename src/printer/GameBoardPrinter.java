package printer;

public class GameBoardPrinter {
    
    public static void printGameBoard(char[][] gameBoard) {
    
        System.out.println("---------------------------------------------");
        System.out.println("                   JOGADOR                   ");
        System.out.println("---------------------------------------------");
        System.out.println("|   | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10|");
        System.out.println("---------------------------------------------");

        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

        int lettersIndex = 0;

        for (int i = 1; i < gameBoard.length; i++) {
            System.out.printf("| %c", letters[lettersIndex]);

            lettersIndex++;
            
            for (int j = 0; j < gameBoard[i].length; j++) {
                if (j == 0){
                    System.out.print(" |");
                } else {
                    System.out.print("   |");
                }
                            
            }
            System.out.println();
        }
    
    }

    
}

