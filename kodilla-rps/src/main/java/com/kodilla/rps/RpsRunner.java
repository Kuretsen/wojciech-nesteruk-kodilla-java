package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        boolean end = false;
        int quantityOfRoundsWon = 0;
        int quantityOfRoundsLost = 0;
        Game game = new Game();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w grze kamień, papier, nożyce!");
        System.out.println("Podaj swoje imię.");
        String playerName = scanner.nextLine();
        System.out.println("Podaj do ilu wygranych rund ma toczyć się gra.");
        int quantityOfRounds = scanner.nextInt();

        System.out.println("Do gry będzie wykorzystywana klawiatura. \n" + "Do zagrania kamienia wpisz: 1. \n" + "Do zagrania papieru wpisz: 2. \n" + "Do zagrania nożyc wpisz: 3. \n" + "Jeśli chcesz zakończyć grę wpisz: x \n" + "Jeśli chcesz zacząć grę od nowa wpisz: n");

        while (!end) {
            game.playerTurn();
            String playerMove = game.getPlayerAttribute();
            game.computerTurn();
            String computerMove = game.getComputerAttribute();
            System.out.println("Twój ruch to: " + playerMove + ". \n Ruch komputera to: " + computerMove);
            String result = game.gameRules();
            System.out.println(result);

            if ("Wygrałeś rundę".equals(result)) {
                quantityOfRoundsWon = quantityOfRoundsWon + 1;
                if (quantityOfRoundsWon == quantityOfRounds) {
                    System.out.println(playerName + " wygrałeś");
                    System.out.println("Jeśli chcesz zacząć ponownie grę wpisz n");
                    if (scanner.next().equals("n")) {
                        System.out.println("Podaj do ilu zwycięstw chcesz grać");
                        quantityOfRounds = scanner.nextInt();
                        quantityOfRoundsWon = 0;
                    } else if (scanner.next().equals("x")) {
                        end = true;
                    }
                }
            } else if ("Przegrałeś rundę".equals(result)) {
                quantityOfRoundsLost = quantityOfRoundsLost + 1;
                if (quantityOfRoundsLost == quantityOfRounds) {
                    System.out.println(playerName + " niestety przegrałeś");
                    System.out.println("Jeśli chcesz zacząć ponownie grę wpisz n");
                    if (scanner.next().equals("n")) {
                        System.out.println("Podaj do ilu zwycięstw chcesz grać");
                        quantityOfRounds = scanner.nextInt();
                        quantityOfRoundsWon = 0;
                    } else if (scanner.next().equals("x")) {
                        end = true;
                    }
                }
            }
        }
    }
}
