package com.teo.chess.pieces;

public class Queen extends PlayingPiece {

    public Queen(PieceColor color) {
        super(color, 'Q');
    }

    @Override
    public boolean isMoveLegal(int currentCol, int currentRow, int newCol, int newRow) {
        return false;
    }
}
