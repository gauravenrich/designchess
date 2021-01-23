package com.gaurav.model.board;

import com.gaurav.model.constants.GameStatus;
import com.gaurav.model.person.Player;

import java.util.List;

public class ChessGame {
    private Player[] players;
    private Board board;
    private Player currentTurn;
    private GameStatus gameStatus;
    private List<Move> movedPlayer;

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getCurrentTurn() {
        return currentTurn;
    }

    public void setCurrentTurn(Player currentTurn) {
        this.currentTurn = currentTurn;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public List<Move> getMovedPlayer() {
        return movedPlayer;
    }

    public void setMovedPlayer(List<Move> movedPlayer) {
        this.movedPlayer = movedPlayer;
    }
}
