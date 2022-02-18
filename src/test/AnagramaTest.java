package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import questao3.Anagramas;

class AnagramaTest {

	@Test
	void getNumeroAnagramasTest() {
		Anagramas anagrama = new Anagramas();
		assertEquals(2, anagrama.getNumeroAnagramas("ovo"));
		assertEquals(3, anagrama.getNumeroAnagramas("ifailuhkqq"));
	}

}
