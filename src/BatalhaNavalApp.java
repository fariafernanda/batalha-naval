import printer.GameBoardPrinter;

public class BatalhaNavalApp {
    public static void main(String[] args){

        // Determinando tamanho do tabuleiro
        char[][] gameBoard;
        gameBoard = new char[11][11];
        
        int submarines = 10;

       
        GameBoardPrinter.printGameBoard(gameBoard);
    }
}
