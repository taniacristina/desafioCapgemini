package questao2;

/*
 * Classe utilizada para alocar os métodos de validação de senhas
 * 
 * @author Tânia Rocha
 * */
public class Senha {

	/*
	 * Método utilizado para validar se uma senha é segura
	 * 
	 * @param senha a ser testada
	 * @return numero de caracteres faltantes para a senha ser segura
	 * */
	public int validaSenha (String senha) {
		int caracteresFaltantes = 0;
		
		int tamanhoFalta = verificaTamanho(senha);
		
		caracteresFaltantes += verificaDigito(senha);
		caracteresFaltantes += verificaMinusculo(senha);
		caracteresFaltantes += verificaMaiusculo(senha);
		caracteresFaltantes += verificaCaracteresEspeciais(senha);
		
		if (caracteresFaltantes > tamanhoFalta) {
			return caracteresFaltantes;
		} else {
			return tamanhoFalta;
		}
		
	}
	
	/*
	 * Método utilizado para validar se o tamanho de uma senha atende
	 * ao minimo requerido
	 * 
	 * @param senha a ser testada
	 * @return numero de caracteres faltantes para a senha chegar ao tamanho minimo
	 * */
	public int verificaTamanho (String senha) {
		int lengthSenha = senha.length();
		if (lengthSenha < 6) {
			return (6 - lengthSenha);
		} 
		return 0;
	}
	
	/*
	 * Método utilizado para validar se uma senha possui um número
	 * 
	 * @param senha a ser testada
	 * @return 0 caso exista um número e 1 caso não exista
	 * */
	public int verificaDigito (String senha) {
     
	  char[] charsSenha = senha.toCharArray();
      StringBuilder sb = new StringBuilder();
     
      for(char c : charsSenha){
         if(Character.isDigit(c)){
            sb.append(c);
         }
      }
     
      if (sb.length() == 0) {
    	  return 1;
      }
      
      return 0;
	}
	
	/*
	 * Método utilizado para validar se uma senha possui uma letra minúscula
	 * 
	 * @param senha a ser testada
	 * @return 0 caso exista uma letra minúscula e 1 caso não exista
	 * */
	public int verificaMinusculo (String senha) {
		
	  char[] charsSenha = senha.toCharArray();
      StringBuilder sb = new StringBuilder();
     
      for(char c : charsSenha){
         if(Character.isLowerCase(c)){
            sb.append(c);
         }
      }
     
      if (sb.length() == 0) {
    	  return 1;
      }
      
      return 0;
	}
	
	/*
	 * Método utilizado para validar se uma senha possui uma letra maiúscula
	 * 
	 * @param senha a ser testada
	 * @return 0 caso exista uma letra maiúscula e 1 caso não exista
	 * */
	public int verificaMaiusculo (String senha) {
		
		  char[] charsSenha = senha.toCharArray();
	      StringBuilder sb = new StringBuilder();
	     
	      for(char c : charsSenha){
	         if(Character.isUpperCase(c)){
	            sb.append(c);
	         }
	      }
	     
	      if (sb.length() == 0) {
	    	  return 1;
	      }
	      
	      return 0;
	}
	
	/*
	 * Método utilizado para validar se uma senha possui um caracter especial
	 * 
	 * @param senha a ser testada
	 * @return 0 caso exista um caracter especial e 1 caso não exista
	 * */
	public int verificaCaracteresEspeciais (String senha) {
		String caracteresEspeciais = "!@#$%^&*()-+";
		char[] charCaracteresEspeciais = caracteresEspeciais.toCharArray();
		
		for (int i = 0; i < senha.length(); i++) {
			for (char c: charCaracteresEspeciais) {
				if (c == senha.charAt(i)) {
					return 0;
				}
			}
		}
		return 1;
	}
}
