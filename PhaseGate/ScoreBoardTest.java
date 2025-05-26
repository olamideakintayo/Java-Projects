// ScoreBoardTest.java

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ScoreBoardTest {

	@Test
	public void displaytotalScores1() {
	ScoreBoard scoresInputs = new ScoreBoard();
	int[][] scores = {{3, 3, 4}, {9, 1, 3}};
	int[] expected = {10, 13};
	int[] actual = scoresInputs.totalScores(scores);
	assertArrayEquals(expected, actual);
}

	@Test
	public void displaytotalScores2() {
	ScoreBoard scoresInputs = new ScoreBoard();
	int[][] scores = {{-4, -8, -9}, {0, 15, 15}};
	int[] expected = {-21, 30};
	int[] actual = scoresInputs.totalScores(scores);
	assertArrayEquals(expected, actual);
}

	@Test
	public void displaytotalScores3() {
	ScoreBoard scoresInputs = new ScoreBoard();
	int[][] scores = {{3, -3, 0}, {9, 1, -12}};
	int[] expected = {0, -2};
	int[] actual = scoresInputs.totalScores(scores);
	assertArrayEquals(expected, actual);
}


}