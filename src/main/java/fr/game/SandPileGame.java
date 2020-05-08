package fr.game;

public class SandPileGame {

    public static final int MAXIMUM_NUMBER_OF_SAND_GRAIN = 4;

    public static int[][] sandPile(int[][] pile, int numberOfGrainToAdd) {
        var length = pile.length;
        var center = (length - 1) / 2;

        for (int i = 0; i < numberOfGrainToAdd; i++) {
            pile[center][center]++;
            if (pile[center][center] == MAXIMUM_NUMBER_OF_SAND_GRAIN) {
                pile[center][center] = 0;

                if (center - 1 >= 0) {
                    //Left
                    pile[center - 1][center]++;
                    //Top
                    pile[center][center - 1]++;
                }
                if (center + 1 < length) {
                    //Right
                    pile[center + 1][center]++;
                    //Down
                    pile[center][center + 1]++;
                }
            }
        }

        return pile;
    }
}
