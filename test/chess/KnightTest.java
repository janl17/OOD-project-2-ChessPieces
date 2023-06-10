package chess;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightTest {
    private AbstractChess piece1;
    private AbstractChess piece2;
    private AbstractChess piece3;

    @BeforeEach
    void setUp() {
        assertThrows(IllegalArgumentException.class,() -> new Bishop(2,9,Color.WHITE));
        this.piece1 = new Knight(0,3,Color.WHITE);
        this.piece2 = new Knight(2,3,Color.WHITE);
        this.piece3 = new Knight(1,1,Color.BLACK);
    }

    @Test
    public void getRowTest() {
        assertEquals(0,piece1.getRow());
        assertEquals(2,piece2.getRow());
    }
    @Test
    public void getColumnTest() {
        assertEquals(3, piece1.getColumn());
        assertEquals(3,piece2.getColumn());
    }
    @Test
    public void getColorTest() {
        assertEquals(Color.WHITE, piece1.getColor());
        assertEquals(Color.BLACK, piece3.getColor());
    }
    @Test
    public void canMoveTest() {
        assertThrows(IllegalArgumentException.class,() -> piece1.canMove(9,1));
        assertEquals(false, piece1.canMove(2, 3));
        assertEquals(true, piece1.canMove(2, 2));
        assertEquals(true, piece1.canMove(1, 1));
    }
    @Test
    public void canKillTest() {
        assertEquals(false, piece1.canKill(piece2));
        assertEquals(true, piece1.canKill(piece3));
    }
}