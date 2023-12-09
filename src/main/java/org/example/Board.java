package org.example;

public class Board {

    private static int SIZE = 3;

    private char[][] cells;

    public Board(){
        cells = new char[3][3];
    }

    public boolean isCellEmpty(int x, int y){
        return cells[x][y] == ' ';
    }
}
