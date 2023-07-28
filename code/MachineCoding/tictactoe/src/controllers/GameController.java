package controllers;

import models.Game;
import models.GameState;
import models.Player;
import services.BoardService;
import services.GameService;
import strategies.winningstrategies.ColWinningStrategy;
import strategies.winningstrategies.RowWinningStrategy;

import java.util.List;


// Simple interface to interact with Game for the client.
public class GameController {

    public static Game createGame(int dimension, List<Player> playerList) {
        return Game.getBuilder().setPlayers(playerList)
                .addWinningStrategy(new ColWinningStrategy())
                .addWinningStrategy(new RowWinningStrategy())
                .setDimension(dimension)
                .build();
    }

    public void undo() {
    }

    public void displayBoard(Game game) {
        BoardService.display(game.getBoard());
    }

    public GameState getGameStatus(Game game) {
        return game.getGameState();
    }

    public void executeNextMove(Game game) {
        GameService gameService = new GameService(game);
        gameService.executeNextMove();
    }

    public String getWinner(Game game) {
        return game.getWinner().getName();
    }

}
