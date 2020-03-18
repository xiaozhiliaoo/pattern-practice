package org.lili.behavioral.templateMethod.ex2;

import java.util.Random;

/**
 * Created by lili on 2017/7/8.
 */
public class SnakesAndLadders extends Game {

    private static final int[] board = {0, 0, -1, 0, 3, 0, 0, 0, -5, 0};

    private int[] playerPositions = null;

    private Random die = null;

    private int winnerId = -1;

    void initializeGame() {
        playerPositions = new int[playersCount];
        for (int i = 0; i < playersCount; i++) {
            playerPositions[i] = 0;
        }

        die = new Random();

        winnerId = -1;
    }

    void makePlay(int player) {
        // Roll the die
        int dieRoll = die.nextInt(6) + 1;

        // Move the token
        playerPositions[player] += dieRoll;

        // Move up or down because of the ladders or the snakes
        int penaltyOrBonus = board[playerPositions[player]];
        playerPositions[player] += penaltyOrBonus;

        if (playerPositions[player] > 8) {
            // Has reached the top square
            winnerId = player;
        }
    }

    boolean endOfGame() {
        // The game is over when a winner exists
        return (winnerId != -1);
    }

    void printWinner() {
        System.out.println("Player #" + winnerId + " has won!");
    }
}
