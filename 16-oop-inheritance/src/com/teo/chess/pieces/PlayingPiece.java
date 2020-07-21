package com.teo.chess.pieces;

public class PlayingPiece {

    private PieceColor color;
    private char symbol;

    public PlayingPiece(PieceColor color, char symbol) {
        this.color = color;
        this.symbol = symbol;
    }

    public PieceColor getColor() {
        return color;
    }

    public char getSymbol() {
        return symbol;
    }

    public boolean isMoveLegal(int currentCol, int currentRow, int newCol, int newRow) {
        return false;
    }
}
