package com.gaurav.model.piece;

import com.gaurav.model.board.Box;

public class Bishop extends Piece {

    public Bishop(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean canMove(Box start, Box end) {
        return false;
    }
}
