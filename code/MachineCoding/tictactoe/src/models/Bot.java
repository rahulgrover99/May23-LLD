package models;

import strategies.bot.BotPlayingStrategy;
import strategies.bot.BotPlayingStrategyFactory;

import java.util.Scanner;

public class Bot extends Player {
    public Bot(String name, char symbol, int id, PlayerType playerType,
               BotDifficultyLevel botDifficultyLevel, Scanner scanner) {
        super(name, symbol, id, playerType, scanner);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(botDifficultyLevel);
    }
    BotDifficultyLevel botDifficultyLevel;
    BotPlayingStrategy botPlayingStrategy;



    @Override
    public Move makeMove(Board board) {

        Move move = botPlayingStrategy.suggestMove(board);

        System.out.printf("the bot is making a move %d %d.\n", move.getCell().getRow(), move.getCell().getCol());

        move.getCell().setPlayer(this);
        move.getCell().setCellStatus(CellStatus.OCCUPIED);

        return move;
    }
}

