package udo.edu.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameTest {

	@Test 
	void testGame() {
		Game game1 = new Game(); // When a new Game is created / instantiated, then methods initGame() and loadQuestion() are also called
        
		assertNotNull(game1.answer, "Should be not empty");
		assertNotNull(game1.question, "Should be not empty");
		assertEquals(9, game1.error);
		
	}

}
