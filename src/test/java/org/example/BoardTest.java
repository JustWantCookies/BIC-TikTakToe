package org.example;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void isEmptyTrueTest() {
        Board board = new Board();
        boolean res = board.isCellEmpty(0, 0);
        assertTrue(res);
    }

    @Test
    public void isEmptyFalseTest() {
        Board board = new Board();
        board.place(0, 0, 'X');
        boolean res = board.isCellEmpty(0, 0);
        assertFalse(res);
    }

    @Test
    public void placeTestZeroZero() {
        Board board = new Board();
        board.place(0, 0, 'X');
        boolean res = board.isCellEmpty(0, 0);
        assertFalse(res);
    }

    @Test
    public void placeTestOneOne() {
        Board board = new Board();
        board.place(1, 1, 'X');
        boolean res = board.isCellEmpty(1, 1);
        assertFalse(res);
    }

    @Test
    public void clearBoardTest() {
        Board board = new Board();
        board.clear();
        boolean res = board.isCellEmpty(0, 0);
        assertTrue(res);
    }

    @Test
    public void clearPlaceBoardTest() {
        Board board = new Board();
        board.place(0, 0, 'X');
        board.place(2, 1, 'X');
        board.clear();
        boolean res = board.isCellEmpty(0, 0) && board.isCellEmpty(2, 1);
        assertTrue(res);
    }

    @Test
    public void isFullTrueTest() {
        Board board = new Board();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.place(i, j, 'X');
            }
        }

        assertTrue(board.isFull());
    }

    @Test
    public void isFullFalseTest() {
        Board board = new Board();

        assertFalse(board.isFull());
    }

    @Test
    public void printBoardTest() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Board board = new Board();
        board.print();

        String expectedOutput = "-------\n| | | |\n| | | |\n| | | |\n-------";
        assertEquals(expectedOutput, outputStream.toString().trim());
    }

    @Test
    public void printBoardWithValueTest() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Board board = new Board();
        board.place(0, 0, 'X');
        board.print();

        String expectedOutput = "-------\n|X| | |\n| | | |\n| | | |\n-------";
        assertEquals(expectedOutput, outputStream.toString().trim());
    }

    public void checkWinnerNegativeTest() {
        Board board = new Board();
        assertEquals(' ', board.checkWinner());
    }

    public void checkWinnerPositiveTest() {
        Board board = new Board();
        board.place(0, 0, 'X');
        board.place(0, 1, 'X');
        board.place(0, 2, 'X');
        assertEquals(' ', board.checkWinner());
    }
}
