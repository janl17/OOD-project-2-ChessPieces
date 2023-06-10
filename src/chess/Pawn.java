package chess;

public class Pawn extends AbstractChess {
    public Pawn(int row, int col, Color color) throws IllegalArgumentException{
        super(row, col, color);
        if (color == Color.WHITE && row < 1) {
            throw new IllegalArgumentException("White pawns can't be less than 1");
        }
        if (color == Color.BLACK && row > 6) {
            throw new IllegalArgumentException("Black pawns can't be more than 6");
        }
    }

    @Override
    public boolean canMove(int row, int col) throws IllegalArgumentException {
        if (super.canMove(row, col)) {
            if (getColor() == Color.BLACK) {
                if (getRow() == 6) {
                    if ((row == 4 || row == 5) && (col == getColumn())) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    if ((row == getRow() - 1) && (col == getColumn())) {
                        return true;
                    } else {
                        return false;
                    }
                }
            } else {
                if (getRow() == 1) {
                    if ((row == 3 || row == 2) && (col == getColumn())) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    if ((row == getRow() + 1) && (col == getColumn())) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return false;
    }
    @Override
    public boolean canKill(ChessPiece piece) {
        if (getColor()==Color.BLACK) {
            if (Math.abs(piece.getColumn() - getColumn()) == 1 && getRow() - piece.getRow() == 1) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (Math.abs(piece.getColumn() - getColumn()) == 1 && piece.getRow() - getRow() == 1) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}
