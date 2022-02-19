package questao1;

/*
 * Classe utilizada para alocar o método de geração de escadas com o caracter
 * asterisco
 * 
 * @author Tânia Rocha
 * */

public class Escada {

	/*
	 * Método utilizado para gerar uma escada utilizando o caracter asterisco
	 * @param int - numero de linhas que a escada deve possuir
	 * */
	public StringBuilder geraEscada(int n) {
		StringBuilder escada = new StringBuilder();
		
		// For utilizado para gerar cada linha
		for (int i = n; i > 0; i--) {
			
			// For para imprimir os espaços antes dos asteriscos
			// o (i - 1) é utilizado para que a ultima linha não possua espaço
			for (int j = 0; j < (i - 1) ; j++) {
				escada.append(" ");
			}
			
			// For para imprimir o caracter asterisco
			for (int j = i; j <= n; j++) {
				escada.append("*");
			}
			
			// If utilizado para pular a linha, exceto da ultima linha da escada
			if ((i - 1) != 0) {
				escada.append("\n");
			}
		}
		
		return escada;
	}
}
