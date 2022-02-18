package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import questao2.Senha;

class SenhaTest {

	@Test
	void validaSenhaTest() {
		Senha senha = new Senha();
		assertEquals(3, senha.validaSenha("Ya3"));
	}
	
	@Test
	void verificaTamanhoTest() {
		Senha senha = new Senha();
		assertEquals(3, senha.verificaTamanho("abc"));
	}
	
	@Test
	void verificaDigitoTest() {
		Senha senha = new Senha();
		assertEquals(1, senha.verificaDigito("abc"));
		assertEquals(0, senha.verificaDigito("abc3"));
	}
	
	@Test
	void verificaMinusculoTest() {
		Senha senha = new Senha();
		assertEquals(1, senha.verificaMinusculo("ABC"));
		assertEquals(0, senha.verificaMinusculo("Abc"));
	}
	
	@Test
	void verificaMaiusculoTest() {
		Senha senha = new Senha();
		assertEquals(1, senha.verificaMaiusculo("abc"));
		assertEquals(0, senha.verificaMaiusculo("Abc"));
	}
	
	@Test
	void verificaCaracterEspecialTest() {
		Senha senha = new Senha();
		assertEquals(1, senha.verificaCaracteresEspeciais("abc"));
		assertEquals(0, senha.verificaCaracteresEspeciais("abc!"));
	}

}
