package chess;

public class King extends AbstractChess {

    public King(int row, int col, Color color) {
        super(row, col, color);
    }

    @Override
    public boolean canMove(int row, int col) throws IllegalArgumentException {
        if (super.canMove(row, col)) {
            if ((row == getRow() && Math.abs(col - getColumn()) == 1)
                    || (col == getColumn() && Math.abs(row - getRow()) == 1)
                    || (Math.abs(col - getColumn()) == 1 && Math.abs(row - getRow()) == 1)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}