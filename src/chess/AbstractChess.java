package chess;

public abstract class AbstractChess implements ChessPiece {
    private final int row;
    private final int col;
    private final Color color;

    public AbstractChess(int row, int col, Color color) throws IllegalArgumentException {
        if (!(0 <= row && row <= 7 && 0 <= col && col <= 7)) {
            throw new IllegalArgumentException("Rows and columns should be within 0 to 7.");
        }
        this.row = row;
        this.col = col;
        this.color = color;

    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.col;
    }

    public Color getColor() {
        return this.color;
    }

    public boolean canMove(int row, int col) throws IllegalArgumentException {
        if (!(0 <= row && row <= 7 && 0 <= col && col <= 7)) {
            throw new IllegalArgumentException();
        }
        if (row==getRow() && col==getColumn()){
            return false;
        }
       else {
           return true;
       }
        }

    public boolean canKill(ChessPiece piece) {
        if (piece.getColor() == color) {
            return false;
        }
        return canMove(piece.getRow(), piece.getColumn());
    }
}