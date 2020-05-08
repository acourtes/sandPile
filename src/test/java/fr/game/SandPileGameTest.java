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

    @Test
    void should_add_2_sand_grains_for_a_single_cell_with_1_grain() {
        int[][] pile = new int[][]{{1}};
        int[][] expected = new int[][]{{3}};

        int[][] result = SandPileGame.sandPile(pile, 2);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_add_3_sand_grains_for_a_single_cell_with_no_grain() {
        int[][] pile = new int[][]{{0}};
        int[][] expected = new int[][]{{3}};

        int[][] result = SandPileGame.sandPile(pile, 3);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_add_5_sand_grains_for_a_single_cell_with_2_grains() {
        int[][] pile = new int[][]{{2}};
        int[][] expected = new int[][]{{3}};

        int[][] result = SandPileGame.sandPile(pile, 5);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_add_5_sand_grains_for_a_single_cell_with_3_grains() {
        int[][] pile = new int[][]{{3}};
        int[][] expected = new int[][]{{0}};

        int[][] result = SandPileGame.sandPile(pile, 5);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_add_1_sand_grain_for_a_9_cells_with_only_3_grains_at_center() {
        int[][] pile = new int[][]{
                {0, 0, 0},
                {0, 3, 0},
                {0, 0, 0}};
        int[][] expected = new int[][]{
                {0, 1, 0},
                {1, 0, 1},
                {0, 1, 0}};

        int[][] result = SandPileGame.sandPile(pile, 1);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_add_1_sand_grain_for_a_9_cells_with_3_grains_at_center_and_one_grain_on_left() {
        int[][] pile = new int[][]{
                {0, 0, 0},
                {1, 3, 0},
                {0, 0, 0}};
        int[][] expected = new int[][]{
                {0, 1, 0},
                {2, 0, 1},
                {0, 1, 0}};

        int[][] result = SandPileGame.sandPile(pile, 1);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_add_1_sand_grain_for_a_9_cells_with_3_grains_at_center_and_one_grain_on_top() {
        int[][] pile = new int[][]{
                {0, 1, 0},
                {0, 3, 0},
                {0, 0, 0}};
        int[][] expected = new int[][]{
                {0, 2, 0},
                {1, 0, 1},
                {0, 1, 0}};

        int[][] result = SandPileGame.sandPile(pile, 1);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_add_1_sand_grain_for_a_9_cells_with_3_grains_at_center_and_one_grain_on_right() {
        int[][] pile = new int[][]{
                {0, 0, 0},
                {0, 3, 1},
                {0, 0, 0}};
        int[][] expected = new int[][]{
                {0, 1, 0},
                {1, 0, 2},
                {0, 1, 0}};

        int[][] result = SandPileGame.sandPile(pile, 1);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_add_1_sand_grain_for_a_9_cells_with_3_grains_at_center_and_one_grain_on_down() {
        int[][] pile = new int[][]{
                {0, 0, 0},
                {0, 3, 0},
                {0, 1, 0}};
        int[][] expected = new int[][]{
                {0, 1, 0},
                {1, 0, 1},
                {0, 2, 0}};

        int[][] result = SandPileGame.sandPile(pile, 1);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_add_1_sand_grain_for_a_9_cells_with_3_grains_at_center_and_3_grains_on_left() {
        int[][] pile = new int[][]{
                {0, 0, 0},
                {3, 3, 1},
                {0, 0, 0}};
        int[][] expected = new int[][]{
                {1, 1, 0},
                {0, 1, 2},
                {1, 1, 0}};

        int[][] result = SandPileGame.sandPile(pile, 1);

        assertThat(result).isEqualTo(expected);
    }
}
