package org.example;

public class Board {

    public static int SIZE = 3;

    private char[][] cells;

    public Board() {
        cells = new char[3][3];

        clear();
    }

    public void clear() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] = ' ';
            }
        }
    }

    public boolean isCellEmpty(int x, int y) {
        return cells[x][y] == ' ';
    }

    public void place(int x, int y, char marker) {
        cells[x][y] = marker;
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cells[i][i] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public void print() {
        System.out.print("-------\n");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(cells[i][j]);
                System.out.print("|");
            }
            System.out.print("\n");
        }
        System.out.print("-------");
    }

    public char checkWinner() {
        // Check rows
        for (int i = 0; i < SIZE; i++) {
            if (cells[i][0] == cells[i][1] && cells[i][1] == cells[i][2] && cells[i][0] != ' ') {
                return cells[i][0];
            }
        }

        // Check columns
        for (int j = 0; j < SIZE; j++) {
            if (cells[0][j] == cells[1][j] && cells[1][j] == cells[2][j] && cells[0][j] != ' ') {
                return cells[0][j];
            }
        }

        // Check diagonals
        if (cells[0][0] == cells[1][1] && cells[1][1] == cells[2][2] && cells[0][0] != ' ') {
            return cells[0][0];
        }
        if (cells[0][2] == cells[1][1] && cells[1][1] == cells[2][0] && cells[0][2] != ' ') {
            return cells[0][2];
        }

        // No winner
        return ' ';
    }
}
