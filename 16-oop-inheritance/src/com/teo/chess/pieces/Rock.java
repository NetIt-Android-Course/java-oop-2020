package com.teo.chess.pieces;

public class Rock extends PlayingPiece {

    public Rock(PieceColor color) {
        super(color, 'R');
    }

    @Override
    public boolean isMoveLegal(int currentCol, int currentRow, int newCol, int newRow) {
        return (currentCol == newCol && currentRow != newRow) ||
                (currentCol != newCol && currentRow == newRow);
    }
}
