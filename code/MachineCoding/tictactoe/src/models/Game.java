package models;

import strategies.winningstrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;


/**
 * Run the application. We ask the player their name.
 * We ask them to choose a symbol
 * "C"
 * "R"
 * "*"
 *
 *
 */
public class Game {
    Board board;
    List<Player> players;
    List<Move> moves;
    int currentPlayerIndex;
    GameState gameState;
    Player winner;
    List<WinningStrategy> winningStrategies;

    private Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.board = new Board(dimension);
        this.moves = new ArrayList<>();
        this.currentPlayerIndex = 0;
        this.gameState = GameState.IN_PROGRESS;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        // 1. Players
        // 2. Dimension
        // 3. winning strategies

        List<Player> players;
        List<WinningStrategy> winningStrategies;
        int dimension;

        private Builder() {
            this.players = new ArrayList<>();
            this.winningStrategies = new ArrayList<>();
            this.dimension = 0;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }
        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder addPlayer(Player player) {
            this.players.add(player);
            return this;
        }

        public Builder addWinningStrategy(WinningStrategy winningStrategy) {
            this.winningStrategies.add(winningStrategy);
            return this;
        }

        public Game build() {

            // validations here.

            return new Game(dimension, players, winningStrategies);

        }

    }


    // TODO: SRP, controller, services
    public void makeMove() {
        Player currentPlayer = players.get(currentPlayerIndex);
        System.out.printf("Player turn: %s\n", currentPlayer.getName());

        Move move = currentPlayer.makeMove(board);
        moves.add(move);

        // Update the board with the move taken.
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        // Updating the cell in the board with the move that player took.
        this.board.getBoard().get(row).set(col, move.getCell());

        for (WinningStrategy winningStrategy: winningStrategies) {
            if (winningStrategy.checkWinner(board, move)) {
                System.out.printf("The player %s has won.\n", currentPlayer.getName());
                gameState = GameState.WIN;
                break;
            }
        }

        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        // displays the board
        this.board.display();

    }
}
