package com.teo.chess.pieces;

public class Bishop extends PlayingPiece {

    public Bishop(PieceColor color) {
        super(color, 'B');
    }

    @Override
    public boolean isMoveLegal(int currentCol, int currentRow, int newCol, int newRow) {
        return false;
    }
}
