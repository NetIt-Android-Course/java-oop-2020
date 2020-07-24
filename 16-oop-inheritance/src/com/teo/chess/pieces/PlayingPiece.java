package com.teo.chess.pieces;

public abstract class PlayingPiece {

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

    public abstract boolean isMoveLegal(int currentCol, int currentRow, int newCol, int newRow);
}
