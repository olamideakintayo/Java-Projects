// CharacterTest.java

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CharacterTest {

	@Test
	public void displayCharactersOccurences() {
	Character characterOccurences = new Character();
	assertEquals(2, characterOccurences.numberOfOccurences("Hello world", 'o'));
	}
	
	@Test
	public void displayCharactersOccurences2() {
	Character characterOccurences = new Character();
	assertEquals(3, characterOccurences.numberOfOccurences("olamide akintayo", 'a'));
	}

	}