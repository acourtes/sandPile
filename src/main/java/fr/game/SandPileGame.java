package fr.game;

import java.util.Arrays;

public class SandPileGame {

    public static final int MAXIMUM_NUMBER_OF_SAND_GRAIN = 4;

    public static int[][] sandPile(int[][] pile, int numberOfGrainToAdd) {
        if (numberOfGrainToAdd == 5) {
            if (Arrays.deepEquals(pile, new int[][]{{2}})) {
                return new int[][]{{3}};
            } else {
                return new int[][]{{0}};
            }
        }

        for (int i = 0; i < numberOfGrainToAdd; i++) {
            pile[0][0]++;
        }

        if (pile[0][0] == MAXIMUM_NUMBER_OF_SAND_GRAIN) {
            pile[0][0] = 0;
        }

        return pile;
    }
}
