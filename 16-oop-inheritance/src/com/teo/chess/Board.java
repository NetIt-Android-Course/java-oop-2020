package com.teo.chess;

import com.teo.chess.pieces.*;

public class Board {

//|♖|♘|  |♔|♕|♗|♘|♖|
//|♙|♙|♙|  |♙|♙|♙|♙|
//|    |    |    |♙|    |    |    |   |
//|    |    |    |    |    |   |    |    |
//|    |    |    |    |    |   |♗|    |
//|    |    |    |    |♟|    |    |   |
//|♟|♟|♟|♟|    |♟|♟|♟|
//|♜|♞|♝|♚|♛|♝|♞|♜|


    private PlayingPiece[][] board = new PlayingPiece[8][8]; //columns and rows

    public Board() {
        createKingRow(0, PieceColor.WHITE);
        createKingRow(7, PieceColor.BLACK);
        createPawnRow(1, PieceColor.WHITE);
        createPawnRow(6, PieceColor.BLACK);
        printBoard();
    }

    private void printBoard() {
        for (int rows = 0; rows < board.length; rows++) {
            for (int columns = 0; columns < board.length; columns++) {
                if(board[columns][rows] != null){
                    System.out.print(board[columns][rows].getSymbol() + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private void createPawnRow(int row, PieceColor color) {
        for (int i = 0; i < board.length; i++) {
            board[i][row] = new Pawn(color);
        }
    }

    private void createKingRow(int row, PieceColor color) {
        board[0][row] = new Rock(color);
        board[1][row] = new Knight(color);
        board[2][row] = new Bishop(color);
        board[3][row] = new King(color);
        board[4][row] = new Queen(color);
        board[5][row] = new Bishop(color);
        board[6][row] = new Knight(color);
        board[7][row] = new Rock(color);
    }
}
