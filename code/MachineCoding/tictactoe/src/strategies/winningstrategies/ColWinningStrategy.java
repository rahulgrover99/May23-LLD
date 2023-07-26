package strategies.winningstrategies;

import models.*;

/**
 * ColWinningStrategy returns boolean
 * to answer whether the player who played
 * the last move has won the game or not.
 *
 * By checking every cell in that column should have symbol from the Player.
 *
 */
public class ColWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        int columnToCheck = move.getCell().getCol();
        Player player = move.getCell().getPlayer();

        for (int i = 0; i < board.getBoard().size(); i++) {
            Cell cell = board.getBoard().get(i).get(columnToCheck);
            if (cell.getCellStatus().equals(CellStatus.EMPTY)
                    || !cell.getPlayer().equals(player)) {
                return false;
            }
        }
        return true;
    }
}
