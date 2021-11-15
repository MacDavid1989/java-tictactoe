/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    char player1 = 'X';
    char player2 = 'Y';

    Board gameBoard = new Board(3, 3);
    gameBoard.printBoard();
  }
}