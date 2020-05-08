package fr.game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SandPileGameTest {

    @Test
    void should_increment_number_of_sand_grain_for_a_single_cell_with_one_grain() {
        int[][] pile = new int[][]{{1}};
        int[][] expected = new int[][]{{2}};

        int[][] result = SandPileGame.sandPile(pile, 1);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_increment_number_of_sand_grain_for_a_single_cell_with_2_grains() {
        int[][] pile = new int[][]{{2}};
        int[][] expected = new int[][]{{3}};

        int[][] result = SandPileGame.sandPile(pile, 1);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_set_number_of_sand_grain_to_0_for_a_single_cell_with_3_grains() {
        int[][] pile = new int[][]{{3}};
        int[][] expected = new int[][]{{0}};

        int[][] result = SandPileGame.sandPile(pile, 1);

        assertThat(result).isEqualTo(expected);
    }
}
