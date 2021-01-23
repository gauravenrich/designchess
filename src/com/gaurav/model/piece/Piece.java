package com.gaurav.model.piece;

import com.gaurav.model.board.Box;

public abstract class Piece {
    private boolean isWhite;
    private boolean isKilled;

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean aWhite) {
        isWhite = aWhite;
    }

    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed) {
        isKilled = killed;
    }

    public abstract boolean canMove(Box start,Box end);
}
