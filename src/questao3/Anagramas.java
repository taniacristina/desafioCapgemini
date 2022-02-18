package questao3;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Classe utilizada para alocar métodos de verificação de anagramas
 * 
 * @author Tânia Rocha
 * 
 * */

public class Anagramas {
	
	
	/*
	 * Retorna a quantidade de pares de anagramas dentro de uma string
	 * @param String - palavra que se quer descobrir os anagramas
	 * @return um int que representa a quantidade de pares de anagramas
	 * */
	public int getNumeroAnagramas(String palavra) {
		
		// Iniciando a variavel responsável por armazenar a contagem de anagramas
		// e o HashMap responsável por guardar as substrings da palavra e as quantidade
		// de repetições
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
				
				// Verificando se a substring já existe no HashMap
				// Se existir então o seu valor será atualizado, somando mais um
				// indicando a nova ocorrência da substring
				if(mapSubstr.containsKey(substrKey)) {
					
					Integer valueKey = mapSubstr.get(substrKey);
					mapSubstr.put(substrKey, valueKey + 1);
					
				} else {
					mapSubstr.put(substrKey, 1); // Se não existir a substring é alocada
				}
			}
		}
		
		// For para verificar quais substrings se repetiram mais de uma vez
		// O calculo é feito através do valor
		// Caso o valor seja 1, 1 repetição, nenhum valor será adicionado a contAnagramas
		for(String key: mapSubstr.keySet()) {
			Integer valueKey = mapSubstr.get(key);
			contAnagramas += (valueKey * (valueKey-1))/2;
		}
		
		return contAnagramas;
	}

}

