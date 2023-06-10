package chess;

public class Queen extends AbstractChess {
    public Queen(int row, int col, Color color) {
        super(row, col, color);
    }
    @Override
    public boolean canMove(int row, int col) throws IllegalArgumentException {
        if (super.canMove(row, col)) {
            if (row == getRow() || col == getColumn() ||
                    Math.abs(row - getRow()) == Math.abs(col - getColumn())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}