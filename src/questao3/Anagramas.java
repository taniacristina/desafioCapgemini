package questao3;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Classe utilizada para alocar m�todos de verifica��o de anagramas
 * 
 * @author T�nia Rocha
 * 
 * */

public class Anagramas {
	
	
	/*
	 * Retorna a quantidade de pares de anagramas dentro de uma string
	 * @param String - palavra que se quer descobrir os anagramas
	 * @return um int que representa a quantidade de pares de anagramas
	 * */
	public int getNumeroAnagramas(String palavra) {
		
		// Iniciando a variavel respons�vel por armazenar a contagem de anagramas
		// e o HashMap respons�vel por guardar as substrings da palavra e as quantidade
		// de repeti��es
		int contAnagramas = 0; 		
		HashMap<String, Integer> mapSubstr = new HashMap<>();
		
		int lengthPalavra = palavra.length();

		// Iniciando dois for's para comparar cada substring com o resto da palavra
		for (int i = 0; i < lengthPalavra; i++) {
			for (int j = i; j < lengthPalavra; j++) {
				
				// Retirando as substrings da palavra de acordo com os for's
				String palavraSubstr = palavra.substring(i, j + 1);
				
				// Criando um array de char para poder ordenar a substring encontrada
				char[] charPalavraSubstr = palavraSubstr.toCharArray(); 
				Arrays.sort(charPalavraSubstr);
				
				// Transformando o array de char em string novamente para ser alocada
				// no HashMap
				String substrKey = new String(charPalavraSubstr);
				
				// Verificando se a substring j� existe no HashMap
				// Se existir ent�o o seu valor ser� atualizado, somando mais um
				// indicando a nova ocorr�ncia da substring
				if(mapSubstr.containsKey(substrKey)) {
					
					Integer valueKey = mapSubstr.get(substrKey);
					mapSubstr.put(substrKey, valueKey + 1);
					
				} else {
					mapSubstr.put(substrKey, 1); // Se n�o existir a substring � alocada
				}
			}
		}
		
		// For para verificar quais substrings se repetiram mais de uma vez
		// O calculo � feito atrav�s do valor
		// Caso o valor seja 1, 1 repeti��o, nenhum valor ser� adicionado a contAnagramas
		for(String key: mapSubstr.keySet()) {
			Integer valueKey = mapSubstr.get(key);
			contAnagramas += (valueKey * (valueKey-1))/2;
		}
		
		return contAnagramas;
	}

}

