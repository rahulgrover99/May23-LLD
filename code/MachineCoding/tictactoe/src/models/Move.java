package models;

public class Move {

    private int moveNumber;
    private Cell cell;

    public Move(int moveNumber, Cell cell) {
        this.moveNumber = moveNumber;
        this.cell = cell;
    }

    public Move(Cell cell) {
        this.cell = cell;
        this.moveNumber = 0;
    }

    public int getMoveNumber() {
        return moveNumber;
    }

    public void setMoveNumber(int moveNumber) {
        this.moveNumber = moveNumber;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
