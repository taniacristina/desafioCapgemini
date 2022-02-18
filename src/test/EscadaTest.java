package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import questao1.Escada;

class EscadaTest {

	@Test
	void geraEscadaTest() {
		StringBuilder escadaTest = new StringBuilder();
		Escada escada = new Escada();
		
		escadaTest.append("     *\n");
		escadaTest.append("    **\n");
		escadaTest.append("   ***\n");
		escadaTest.append("  ****\n");
		escadaTest.append(" *****\n");
		escadaTest.append("******");
		
		assertEquals(escadaTest.toString(), escada.geraEscada(6).toString());
	}

}
