package models;

import strategies.bot.BotPlayingStrategy;

public class Bot extends Player {
    public Bot(String name, char symbol, int id, PlayerType playerType,
               BotDifficultyLevel botDifficultyLevel,
               BotPlayingStrategy botPlayingStrategy) {
        super(name, symbol, id, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = botPlayingStrategy;
    }
    BotDifficultyLevel botDifficultyLevel;
    BotPlayingStrategy botPlayingStrategy;



    // TODO: Override makeMove() method here
}

