
public abstract class Usuario {
	
	public String nome,sobrenome;	
	public String senha;
	public String rg;
	public String cpf;
	
	public Usuario() {
		
	}

	public Usuario( String cpf, String senha) {
		this.cpf=cpf;
		this.senha=senha;
	}

	public Usuario(String nome, String sobrenome, String senha, String rg, String cpf) {
		this.nome = nome;
		this.sobrenome=sobrenome;
		this.senha=senha;
		this.rg=rg;
		this.cpf=cpf;
		
	}
	
	public void entradaDeDados(){//ENTRADA DE DADOS
		
	}
	public void logando(){//LOGAR OS FUNCIONÁRIOS E OS CLIENTES
		
	}
	public boolean validarCpf(String cpf){ // VALIDAR SE O CPF É VÁLIDO		
		
		int teste,resto,quociente, digito=0,digitoFinal;		
		
		if(cpf.length()!=11){ //VERIFICAR SE O CPF ESTÁ NO TAMANHO DE CARACTERES CORRETO
			return false;
		}
		
		else{
			
			int vetCpf [] = new int [11]; //LISTA ONDE FICARÃO CADA DIGIDO DO CPF
			
			for (int i = 0; i < vetCpf.length; i++) { //INSERINDO DIGIDOS
				vetCpf[i]=Integer.parseInt( cpf.substring( i, (i+1) ) );			
			}
			
			digitoFinal=Integer.parseInt( cpf.substring( 10, 11 ) ); //VARIAVEL COM O DIGITO FINAL PARA SER VALIDADO POSTERIORMENTE		
					
			int j=0;
			int acumulador=0;
			for (int i = 10; i > 1; i--) {				
				acumulador+=(vetCpf[j]*=i);		
				j++;		
			}
			resto=acumulador%11;
			quociente=acumulador/11;
	
			if(resto<2){// SE O RESTO DA SOMA DOS PRIMEIROS 9 DIGITOS DIVIDOS POR 11 FOR MENOR QUE 2, O DÉCIMO DIGITO DEVE SER 0
				digito=0;
			}
			else if(resto >=2){
				digito=11-resto;
			}// SE O RESTO DA SOMA DOS PRIMEIROS 9 DIGITOS DIVIDOS POR 11 FOR MAIOR OU IGUAL A 2, O DÉCIMO DIGITO DEVE SER 11-RESTO
			
			if(vetCpf[9]==digito){//SE O DIGITO DIGITADO FOR IGUAL AO DIGITO VÁLIDO, ENTAO O 10º DIGITO É VAIDO
				
				int i=10, segundoAcumulador=0, cont=11,	segundoResto, segundoQuociente, segundoDigito=0 ;	//VALIDAR  O SEGUNDO DIGITO
				for (int g=0; g<10; g++) {				
						vetCpf[g]=(vetCpf[g]/i);
						segundoAcumulador+=(vetCpf[g]*cont);
						cont--;
					i--;
				}
				segundoResto= segundoAcumulador%11;
				segundoQuociente= segundoAcumulador/11;
				
				if(segundoResto<2){
					segundoDigito=0;
				}
				else if(segundoResto>=2){
					segundoDigito= 11-segundoResto;
				}
				
				if(vetCpf[10]==segundoDigito){
					return true;
				}
				else 
					return false;
		
			}
			
			else
				return false;
		}	
		
		
		
	}
	

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
