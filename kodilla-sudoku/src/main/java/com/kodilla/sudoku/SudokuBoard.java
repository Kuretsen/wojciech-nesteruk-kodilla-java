package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Arrays;

public class SudokuBoard extends Prototype<SudokuBoard> {
    private ArrayList<SudokuRow> sudokuBoard = new ArrayList<>();

    public SudokuBoard() {
    }

    public void setSudokuBoard(ArrayList<SudokuRow> sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }

    public ArrayList<SudokuRow> getSudokuBoard() {
        return sudokuBoard;
    }

    public void initiateBoard() {
        for (int row = 0; row < 9; row++) {
            ArrayList<SudokuElement> initiateRowList = new ArrayList<>();
            SudokuRow sudokuRow = new SudokuRow(initiateRowList);
            for (int col = 0; col < 9; col++) {
                initiateRowList.add(new SudokuElement(SudokuElement.EMPTY, new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9))));
            }
            sudokuBoard.add(sudokuRow);
        }
    }

    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard clonedSudokuBoard = (SudokuBoard) super.clone();
        clonedSudokuBoard.sudokuBoard = new ArrayList<>();
        for (SudokuRow sudokuRowList : sudokuBoard) {
            ArrayList<SudokuElement> sudokuElements = new ArrayList<>();
            SudokuRow clonedSudokuRow = new SudokuRow(sudokuElements);
            for (SudokuElement element : sudokuRowList.getSudokuElements()) {
                SudokuElement elementCopy = new SudokuElement(element.getValue(),new ArrayList<>(element.getListOfPossibleValues()));
                sudokuElements.add(elementCopy);
            }
            clonedSudokuBoard.getSudokuBoard().add(clonedSudokuRow);
        }
        return clonedSudokuBoard;
    }

    public void setValueInSudokuElement(int row, int col, int value) {
        getSudokuBoard().get(row).getSudokuElements().get(col).setValue(value);
        getSudokuBoardElement(row, col).getListOfPossibleValues().clear();
    }

    public SudokuElement getSudokuBoardElement(int row, int col) {
        return getSudokuBoard().get(row).getSudokuElements().get(col);
    }

    public int getValueOfSudokuElement(int row, int col) {
        return getSudokuBoard().get(row).getSudokuElements().get(col).getValue();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int row = 0; row < 9; row++) {
            builder.append("  ");
            for (int col = 0; col < 9; col++) {
                builder.append("|---");
            }

            builder.append("|");
            builder.append("\n");
            builder.append(row).append(" ");

            for (int col = 0; col < 9; col++) {
                builder.append("|");
                builder.append(" ");
                if (getSudokuBoard().get(row).getSudokuElements().get(col).getValue() == SudokuElement.EMPTY) {
                    builder.append(" ");
                } else {
                    builder.append(getSudokuBoard().get(row).getSudokuElements().get(col).getValue());
                }
                builder.append(" ");
            }

            builder.append("|");
            builder.append("\n");
        }
        builder.append("  ");
        for (int col = 0; col < 9; col++) {
            builder.append("|---");
        }
        builder.append("|");
        builder.append("  ");
        builder.append("\n");
        builder.append("  ");

        for (int col = 0; col < 9; col++) {
            builder.append(" ");
            builder.append(" ");
            builder.append(col);
            builder.append(" ");
        }

        return builder.toString();
    }
}
