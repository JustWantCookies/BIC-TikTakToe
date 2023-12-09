package org.example;

public class Board {

    private static int SIZE = 3;

    private char[][] cells;

    public Board(){
        cells = new char[3][3];

        // Init board
        for(int i =0; i <3; i++){
            for(int j =0; j <3; j++){
                cells[i][j] = ' ';
            }
        }
    }

    public boolean isCellEmpty(int x, int y){
        return cells[x][y] == ' ';
    }

    public void place(int x, int y, char marker){
        cells[x][y] = marker;
    }
}
