package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private int computerMove;
    private String computerAttribute;
    private int playerMove;
    private String playerAttribute;
    public void playerTurn() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz swoje zagranie");
        playerMove = scan.nextInt();
        if (playerMove == 1) {
            playerAttribute = "Kamień";
        } else if (playerMove == 2) {
            playerAttribute = "Papier";
        } else if (playerMove == 3) {
            playerAttribute = "Nożyce";
        } else {
            playerAttribute = "Wpisz cyfre 1 (kamień), 2 (papier) lub 3 (nożyce)";
        }
    }
    public String getPlayerAttribute() {
        return playerAttribute;
    }
    public void computerTurn() {
        Random random = new Random();
        computerMove = random.nextInt(3) + 1;
        if (computerMove == 1) {
            computerAttribute = "Kamień";
        } else if (computerMove == 2) {
            computerAttribute = "Papier";
        }else {
            computerAttribute = "Nożyce";
        }
    }

    public String getComputerAttribute() {
        return computerAttribute;
    }
    public String gameRules() {
        String gameResult = "";
        if (playerMove == computerMove) {
            gameResult = "Remis";
        } else if (playerMove == 1 && computerMove == 2) {
            gameResult = "Przegrałeś runde";
        } else if (playerMove == 2 && computerMove == 3) {
            gameResult = "Przegrałeś rundę";
        } else  if (playerMove == 3 && computerMove == 1){
            gameResult = "Przegrałeś rundę";
        } else if (playerMove == 2 && computerMove == 1){
            gameResult = "Wygrałeś rundę";
        } else if (playerMove == 3 && computerMove == 2) {
            gameResult = "Wygrałeś rundę";
        } else if (playerMove == 1 && computerMove == 3) {
            gameResult = "Wygrałeś rundę";
        }
        return gameResult;
    }
}
