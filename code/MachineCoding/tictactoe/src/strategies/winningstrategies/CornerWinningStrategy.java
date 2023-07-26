package strategies.winningstrategies;

import models.*;

public class CornerWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        Player currentPlayer  = move.getCell().getPlayer();
        int boardSize = board.getBoard().size();

        int[] row = {0, 0, boardSize - 1, boardSize -1};
        int[] col = {boardSize - 1, 0, boardSize - 1, 0};

        for (int i = 0; i < 4; i++) {
            Cell currentCell = board.getBoard().get(row[i]).get(col[i]);
            if (currentCell.getCellStatus().equals(CellStatus.EMPTY)
                    || !currentCell.getPlayer().equals(currentPlayer)) {
                return false;
            }
        }
        return true;
    }
}
