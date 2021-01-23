package com.gaurav.model.board;

import com.gaurav.model.piece.*;

public class Board {
    private Box[][] boxes;

    public Board() {
        boxes = new Box[8][8];
        this.resetBoard();
    }

    private void resetBoard() {
        // initialize white pieces
        boxes[0][0] = new Box(0, 0, new Rook(true));
        boxes[0][1] = new Box(0, 1, new Knight(true));
        boxes[0][2] = new Box(0, 2, new Bishop(true));
        boxes[0][4] = new Box(0, 3, new Queen(true));
        boxes[0][4] = new Box(0, 4, new King(true));
        boxes[0][5] = new Box(0, 5, new Bishop(true));
        boxes[0][6] = new Box(0, 6, new Knight(true));
        boxes[0][7] = new Box(0, 7, new Rook(true));

        for(int i=0;i<8;i++){
            boxes[1][i]=new Box(1, i, new Pawn(true));
        }

        // initialize Black pieces
        boxes[7][0] = new Box(0, 0, new Rook(false));
        boxes[7][1] = new Box(0, 1, new Knight(false));
        boxes[7][2] = new Box(0, 2, new Bishop(false));
        boxes[7][4] = new Box(0, 3, new King(false));
        boxes[7][4] = new Box(0, 4, new Queen(false));
        boxes[7][5] = new Box(0, 5, new Bishop(false));
        boxes[7][6] = new Box(0, 6, new Knight(false));
        boxes[7][7] = new Box(0, 7, new Rook(false));

        for(int i=7;i<8;i++){
            boxes[7][i]=new Box(7, i, new Pawn(false));
        }

    }

    public Box getBoxes(int x,int y) {
        return boxes[x][y];
    }

}
