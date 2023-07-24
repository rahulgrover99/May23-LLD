package models;

import strategies.winningstrategies.WinningStrategy;

import java.util.List;

public class Game {
    Board board;
    List<Player> players;
    List<Move> moves;
    Player nextPlayerTurn;
    GameState gameState;
    Player winner;
    List<WinningStrategy> winningStrategies;

    // TODO(): Add Builder design pattern
}
