package com.kodilla.sudoku;

public class Backtrack {
    private SudokuBoard sudokuBoard;
    private int row;
    private int col;
    private int guessValue;

    public Backtrack(SudokuBoard sudokuBoard, int row, int col, int guessValue) {
        this.sudokuBoard = sudokuBoard;
        this.row = row;
        this.col = col;
        this.guessValue = guessValue;
    }

    public SudokuBoard getSudokuBoard() {
        return sudokuBoard;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getGuessValue() {
        return guessValue;
    }
}
