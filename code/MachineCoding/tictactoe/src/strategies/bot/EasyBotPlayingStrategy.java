package strategies.bot;

import models.Board;
import models.CellStatus;
import models.Move;


/**
 * Easy bot playing strategy simply returns a move
 * to the first cell that is empty.
 */
public class EasyBotPlayingStrategy implements BotPlayingStrategy{

    @Override
    public Move suggestMove(Board board) {
        for (int i = 0; i < board.getBoard().size(); i++) {
            for (int j = 0; j < board.getBoard().size(); j++) {
                if (board.getBoard().get(i).get(j).getCellStatus().equals(CellStatus.EMPTY)) {
                    return new Move(board.getBoard().get(i).get(j));
                }
            }
        }
        return null;
    }
}
