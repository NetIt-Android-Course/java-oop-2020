package com.teo.chess.pieces;

public class Knight extends PlayingPiece {

    public Knight(PieceColor color) {
        super(color, 'N');
    }

    @Override
    public boolean isMoveLegal(int currentCol, int currentRow, int newCol, int newRow) {
        return false;
    }
}
