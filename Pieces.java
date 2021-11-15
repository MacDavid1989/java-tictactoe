/**
 * Pieces
 */
public class Pieces extends Player {
  private final int row;
  private final int col;

  public Pieces(char name, int row, int col) {
    super(name);
    this.row = row;
    this.col = col;
  }
}