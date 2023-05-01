package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SudokuGame {
    public static void main(String[] args) throws CloneNotSupportedException {
        SudokuBoard sudokuBoard = new SudokuBoard();
        sudokuBoard.initiateBoard();
        Scanner scanner = new Scanner(System.in);
        SudokuLogic sudokuLogic = new SudokuLogic();

        System.out.println(sudokuBoard);
        boolean gameFinished = false;

        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();

            System.out.println("Entry value: [row][col][value] \nFinish entring: [SUDOKU]");

            boolean initValuesFinished = false;
            while (!initValuesFinished) {
                String entry = scanner.nextLine();
                if (entry.toUpperCase().equals("SUDOKU")) {
                    initValuesFinished = true;
                } else {
                    int row = Integer.valueOf(entry.substring(0, 1));
                    int col = Integer.valueOf(entry.substring(1, 2));
                    int value = Integer.valueOf(entry.substring(2, 3));
                    ArrayList<Integer> allowedNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
                    if (allowedNumbers.contains(row+1) && allowedNumbers.contains(col+1) && allowedNumbers.contains(value)) {
                        sudokuBoard.setValueInSudokuElement(row, col, value);
                        System.out.println(sudokuBoard);
                    } else {
                        System.out.println("Incorrect entry.");
                        break;
                    }
                }
            }

            sudokuLogic.insertMissingValuesIntoSudokuBoard(sudokuBoard);
            System.out.println(sudokuBoard);
            System.out.println("End Sudoku Solver: [Yes] or [No]");
            String isEnd = scanner.nextLine();
            gameFinished = theGame.resolveSudoku(isEnd);
        }

    }

    private boolean resolveSudoku(String isEnd) {
        return isEnd.equals("Yes");
    }
}