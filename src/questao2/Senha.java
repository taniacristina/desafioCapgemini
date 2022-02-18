package questao2;

public class Senha {

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
	
	public int verificaTamanho (String senha) {
		int lengthSenha = senha.length();
		if (lengthSenha < 6) {
			return (6 - lengthSenha);
		} 
		return 0;
	}
	
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
