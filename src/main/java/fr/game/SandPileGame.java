package fr.game;

public class SandPileGame {

    public static final int MAXIMUM_NUMBER_OF_SAND_GRAIN = 4;

    public static int[][] sandPile(int[][] pile, int numberOfGrainToAdd) {
        var length = pile.length;
        var center = (length - 1) / 2;

        for (int i = 0; i < numberOfGrainToAdd; i++) {
            processCell(pile, center, center);
        }

        return pile;
    }

    private static void processCell(int[][] pile, int x, int y) {
        var length = pile.length;
        pile[x][y]++;
        if (pile[x][y] == MAXIMUM_NUMBER_OF_SAND_GRAIN) {
            pile[x][y] = 0;

            if (x - 1 >= 0) {
                //Left
                processCell(pile, x - 1, y);
            }
            if (y - 1 >= 0) {
                //Top
                processCell(pile, x, y - 1);
            }
            if (x + 1 < length) {
                //Right
                processCell(pile, x + 1, y);
            }
            if (y + 1 < length) {
                //Down
                processCell(pile, x, y + 1);
            }
        }
    }
}
