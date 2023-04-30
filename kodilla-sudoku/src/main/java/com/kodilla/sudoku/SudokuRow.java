package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuRow {
    public ArrayList<SudokuElement> sudokuElements;

    public SudokuRow(ArrayList<SudokuElement> sudokuElements) {
        this.sudokuElements = sudokuElements;
    }

    public ArrayList<SudokuElement> getSudokuElements() {
        return sudokuElements;
    }

    public void setSudokuElements(ArrayList<SudokuElement> sudokuElements) {
        this.sudokuElements = sudokuElements;
    }
}
