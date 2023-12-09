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

        boolean res = board.isCellEmpty(0,0);
        assertFalse(res);
    }
}
