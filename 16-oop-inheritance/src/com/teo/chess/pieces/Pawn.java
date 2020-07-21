package com.teo.chess.pieces;

public class Pawn extends PlayingPiece {

    public Pawn(PieceColor color) {
        super(color, 'p');
    }

    @Override
    public boolean isMoveLegal(int currentCol, int currentRow, int newCol, int newRow) {
        return currentCol == newCol && Math.abs(currentRow - newRow) == 1;
    }
}
