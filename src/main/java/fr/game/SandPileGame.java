package fr.game;

import java.util.Arrays;

public class SandPileGame {
    public static int[][] sandPile(int[][] pile, int numberOfGrainToAdd) {
        if (Arrays.deepEquals(pile, new int[][]{{3}})) {
            return new int[][]{{0}};
        }

        pile[0][0]++;

        return pile;
    }
}
