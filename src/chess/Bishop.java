package chess;

public class Bishop extends AbstractChess {

    public Bishop(int row, int col, Color color) {
        super(row, col, color);
    }
    @Override
    public boolean canMove(int row, int col) throws IllegalArgumentException {
        if (super.canMove(row, col)){
            if (Math.abs(row - getRow()) == Math.abs(col - getColumn())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}


