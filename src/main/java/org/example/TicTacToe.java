package org.example;

import java.util.Scanner;

public class TicTacToe {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;

    public TicTacToe() {
        board = new Board();
        player1 = new Player('X');
        player2 = new Player('0');
        currentPlayer = player1;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (!hasWinner() && !board.isFull()) {
            switchCurrentPlayer();
            board.print();

            System.out.print("row(0,2):");
            int row = scanner.nextInt();
            System.out.print("column(0,2):");
            int col = scanner.nextInt();

            board.place(row, col, currentPlayer.getMarker());
        }
    }

    private void switchCurrentPlayer() {
        if (currentPlayer.equals(player1))
            currentPlayer = player2;
        else
            currentPlayer = player1;
        System.out.println();
        System.out.printf("Current Player: %s", currentPlayer.getMarker());
    }

    private boolean hasWinner() {
        char marker = currentPlayer.getMarker();

        if (board.checkWinner() == marker) {
            System.out.printf("Player %s wins!", currentPlayer);
            return true;
        }

        return false;
    }

}
