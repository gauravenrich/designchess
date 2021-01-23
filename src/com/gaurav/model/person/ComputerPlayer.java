package com.gaurav.model.person;

public class ComputerPlayer extends Player {

    public ComputerPlayer(boolean isComputerPlayer, boolean isWhite) {
        this.humanPlayer = isComputerPlayer;
        this.whiteSide = isWhite;
    }
}
