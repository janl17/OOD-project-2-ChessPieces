package chess;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PawnTest {
    private AbstractChess piece1;
    private AbstractChess piece2;
    private AbstractChess piece3;
    private AbstractChess piece5;
    private AbstractChess piece6;

    @BeforeEach
    void setUp() {
        assertThrows(IllegalArgumentException.class,() -> new Bishop(9,3,Color.BLACK));
        this.piece1 = new Pawn(1,3,Color.WHITE);
        this.piece2 = new Pawn(2,4,Color.WHITE);
        this.piece3 = new Pawn(2,3,Color.BLACK);
        this.piece5 = new Pawn(1,2,Color.WHITE);
        this.piece6 = new Pawn(3,2,Color.WHITE);
    }

    @Test
    public void getRowTest() {
        assertEquals(1,piece1.getRow());
        assertEquals(2,piece2.getRow());
    }
    @Test
    public void getColumnTest() {
        assertEquals(3, piece1.getColumn());
        assertEquals(4,piece2.getColumn());
    }
    @Test
    public void getColorTest() {
        assertEquals(Color.WHITE, piece1.getColor());
        assertEquals(Color.BLACK, piece3.getColor());
    }
    @Test
    public void canMoveTest() {
        assertThrows(IllegalArgumentException.class,() -> piece1.canMove(0,8));
        assertEquals(false, piece1.canMove(2, 4));
        assertEquals(true, piece1.canMove(2, 3));
        assertEquals(true, piece1.canMove(3, 3));
        assertEquals(false, piece1.canMove(4, 3));
        assertEquals(false, piece2.canMove(4, 4));
        assertEquals(false, piece2.canMove(1, 4));
        assertEquals(false, piece3.canMove(3, 3));


    }
    @Test
    public void canKillTest() {
        assertEquals(true, piece1.canKill(piece2));
        assertEquals(false, piece1.canKill(piece3));
        assertEquals(true, piece3.canKill(piece5));
        assertEquals(false, piece1.canKill(piece6));
    }
}