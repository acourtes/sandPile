package fr.game;

public class SandPileGame {

    public static final int MAXIMUM_NUMBER_OF_SAND_GRAIN = 4;

    public static int[][] sandPile(int[][] pile, int numberOfGrainToAdd) {

        for (int i = 0; i < numberOfGrainToAdd; i++) {
            pile[0][0]++;
            if (pile[0][0] == MAXIMUM_NUMBER_OF_SAND_GRAIN) {
                pile[0][0] = 0;
            }
        }

        return pile;
    }
}
