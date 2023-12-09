package org.example;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BoardTest {

    @Test
    public void isEmptyTrueTest(){
        Board board = new Board();
        boolean res = board.isCellEmpty(0,0);
        assertTrue(res);
    }

    @Test
    public void isEmptyFalseTest(){
        Board board = new Board();
        board.place(0,0, 'X');
        boolean res = board.isCellEmpty(0,0);
        assertFalse(res);
    }

    @Test
    public void placeTestZeroZero(){
        Board board = new Board();
        board.place(0,0, 'X');
        boolean res = board.isCellEmpty(0,0);
        assertFalse(res);
    }

    @Test
    public void placeTestOneOne(){
        Board board = new Board();
        board.place(1,1, 'X');
        boolean res = board.isCellEmpty(1,1);
        assertFalse(res);
    }
}
