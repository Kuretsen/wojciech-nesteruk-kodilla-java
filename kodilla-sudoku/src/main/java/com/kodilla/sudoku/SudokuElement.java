package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuElement {
    public int value;
    public static int EMPTY = -1;
    private ArrayList<Integer> listOfPossibleValues;

    public SudokuElement(int value, ArrayList<Integer> listOfPossibleValues) {
        this.value = value;
        this.listOfPossibleValues = listOfPossibleValues;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static int getEMPTY() {
        return EMPTY;
    }

    public ArrayList<Integer> getListOfPossibleValues() {
        return listOfPossibleValues;
    }

    public void setListOfPossibleValues(ArrayList<Integer> listOfPossibleValues) {
        this.listOfPossibleValues = listOfPossibleValues;
    }
}
