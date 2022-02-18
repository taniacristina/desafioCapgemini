/*
 * @author T�nia Rocha
 * */

package questao1;

public class Escada {

	/*
	 * M�todo utilizado para gerar uma escada utilizando o caracter asterisco
	 * @param int - numero de linhas que a escada deve possuir
	 * */
	public void geraEscada(int n) {
		
		// For utilizado para gerar cada linha
		for (int i = n; i > 0; i--) {
			
			// For para imprimir os espa�os antes dos asteriscos
			// o (i - 1) � utilizado para que a ultima linha n�o possua espa�o
			for (int j = 0; j < (i - 1) ; j++) {
				System.out.print(" ");
			}
			
			// For para imprimir o caracter asterisco
			for (int j = i; j <= n; j++) {
				System.out.print("*");	
			}
			
			System.out.println(""); // For para pular linha
		}
	}
}
