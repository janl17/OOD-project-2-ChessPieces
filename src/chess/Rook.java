package chess;

public class Rook extends AbstractChess {

    public Rook(int row, int col, Color color) {
        super(row, col, color);
    }
    @Override
    public boolean canMove(int row, int col) throws IllegalArgumentException {
        if (super.canMove(row, col)) {
            if (row == getRow() || col == getColumn()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}