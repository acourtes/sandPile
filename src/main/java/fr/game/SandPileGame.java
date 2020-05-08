package fr.game;

public class SandPileGame {

    public static final int MAXIMUM_NUMBER_OF_SAND_GRAIN = 4;

    public static int[][] sandPile(int[][] pile, int numberOfGrainToAdd) {
        var center = (pile.length - 1) / 2;

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

            if (weAreNotToMuchOnLeft(x)) {
                //Left
                processCell(pile, x - 1, y);
            }
            if (weAreNotTooMuchOnTop(y)) {
                //Top
                processCell(pile, x, y - 1);
            }
            if (weAreNotTooMuchOnRight(x, length)) {
                //Right
                processCell(pile, x + 1, y);
            }
            if (weAreNotTooMuchOnDown(y, length)) {
                //Down
                processCell(pile, x, y + 1);
            }
        }
    }

    private static boolean weAreNotTooMuchOnDown(int y, int length) {
        return y + 1 < length;
    }

    private static boolean weAreNotTooMuchOnRight(int x, int length) {
        return x + 1 < length;
    }

    private static boolean weAreNotTooMuchOnTop(int y) {
        return y - 1 >= 0;
    }

    private static boolean weAreNotToMuchOnLeft(int x) {
        return x - 1 >= 0;
    }
}
