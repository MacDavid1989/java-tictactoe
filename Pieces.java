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

  public int getRow() {
    return row;
  }
  public int getCol() {
    return col;
  }

  @Override
  public String toString() {
    return "Pieces: Player" + getName() +"[" + getCol() + "," + getRow() + "]";
  }
}