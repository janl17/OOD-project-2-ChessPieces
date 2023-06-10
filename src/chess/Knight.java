package chess;

public class Knight extends AbstractChess {
    public Knight(int row, int col, Color color) {
        super(row, col, color);
    }
    @Override
    public boolean canMove(int row, int col) throws IllegalArgumentException {
        if (super.canMove(row, col)) {
            if ((Math.abs(row - getRow()) == 2 && Math.abs(col - getColumn()) == 1)
                    || ((Math.abs(row - getRow()) == 1 && Math.abs(col - getColumn()) == 2))) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}

