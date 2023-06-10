package chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BishopTest {
    private AbstractChess piece1;
    private AbstractChess piece2;
    private AbstractChess piece3;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        assertThrows(IllegalArgumentException.class,() -> new Bishop(-1,3,Color.WHITE));
        this.piece1 = new Bishop(0,3,Color.WHITE);
        this.piece2 = new Bishop(1,1,Color.WHITE);
        this.piece3 = new Bishop(1,2,Color.BLACK);


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
        assertThrows(IllegalArgumentException.class,() -> piece1.canMove(-1,1));
        assertEquals(false, piece1.canMove(1, 1));
        assertEquals(true, piece1.canMove(1, 2));
        assertEquals(false,piece1.canMove(0,3));
    }
    @Test
    public void canKillTest() {
        assertEquals(false,piece1.canKill(piece2));
        assertEquals(true, piece1.canKill(piece3));
    }


}
