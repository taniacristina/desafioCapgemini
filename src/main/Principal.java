package main;

import questao1.Escada;
import questao2.Senha;
import questao3.Anagramas;

public class Principal {

	public static void main(String[] args) {
		
		// Questao 1
		Escada escada = new Escada();
		System.out.println(escada.geraEscada(6));
		
		System.out.println("");
		
		// Questao 2
		Senha senha = new Senha();
		System.out.println(senha.validaSenha("Ya3"));
		
		System.out.println("");
		
		// Questao 3
		Anagramas anagrama = new Anagramas();
		System.out.println(anagrama.getNumeroAnagramas("ovo"));
		System.out.println(anagrama.getNumeroAnagramas("ifailuhkqq"));

	}

}
