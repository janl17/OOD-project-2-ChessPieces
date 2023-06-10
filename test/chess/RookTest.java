package chess;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RookTest {
    private AbstractChess piece1;
    private AbstractChess piece2;
    private AbstractChess piece3;

    @BeforeEach
    void setUp() {
        assertThrows(IllegalArgumentException.class,() -> new Bishop(-1,9,Color.WHITE));
        this.piece1 = new Rook(0,3,Color.WHITE);
        this.piece2 = new Rook(1,1,Color.WHITE);
        this.piece3 = new Rook(1,3,Color.BLACK);
    }

    @Test
    public void getRowTest() {
        assertEquals(0,piece1.getRow());
        assertEquals(1,piece2.getRow());
    }
    @Test
    public void getColumnTest() {
        assertEquals(3, piece1.getColumn());
        assertEquals(1,piece2.getColumn());
    }
    @Test
    public void getColorTest() {
        assertEquals(Color.WHITE, piece1.getColor());
        assertEquals(Color.BLACK, piece3.getColor());
    }
    @Test
    public void canMoveTest() {
        assertThrows(IllegalArgumentException.class,() -> piece1.canMove(8,9));
        assertEquals(false, piece1.canMove(1, 1));
        assertEquals(true, piece1.canMove(1, 3));
        assertEquals(true, piece1.canMove(0, 4));

    }
    @Test
    public void canKillTest() {
        assertEquals(false, piece1.canKill(piece2));
        assertEquals(true, piece1.canKill(piece3));
    }
}