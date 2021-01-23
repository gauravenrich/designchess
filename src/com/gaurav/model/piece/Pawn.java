package com.gaurav.model.piece;

import com.gaurav.model.board.Box;

public class Pawn extends Piece{

    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean canMove(Box start, Box end) {
        return false;
    }
}
