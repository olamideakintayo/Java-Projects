// Character.java

public class Character {

	public static int numberOfOccurences(String word, char ch) {
	String newLetters = word.toLowerCase();
	int count = 0;
	for (int counter = 0; counter < newLetters.length(); counter++) {
	if(newLetters.charAt(counter) == ch) {
	count++;
	}		}
		return count;

	}
	}