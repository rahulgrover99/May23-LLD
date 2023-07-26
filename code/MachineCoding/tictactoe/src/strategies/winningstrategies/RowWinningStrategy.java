package strategies.winningstrategies;

import models.*;

public class RowWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        int rowToCheck = move.getCell().getRow();
        Player player = move.getCell().getPlayer();

        for (int i = 0; i < board.getBoard().size(); i++) {
            Cell cell = board.getBoard().get(rowToCheck).get(i);
            if (cell.getCellStatus().equals(CellStatus.EMPTY)
                    || !cell.getPlayer().equals(player)) {
                return false;
            }
        }
        return true;
    }
}
