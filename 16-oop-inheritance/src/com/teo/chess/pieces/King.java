package com.teo.chess.pieces;

public class King extends PlayingPiece {

    public King(PieceColor color) {
        super(color, 'K');
    }

    @Override
    public boolean isMoveLegal(int currentCol, int currentRow, int newCol, int newRow) {
        return false;
    }
}
