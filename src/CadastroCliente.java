import java.util.Scanner;

public class CadastroCliente extends Usuario implements NdeRegistroFuncionario{

	Scanner ler = new Scanner (System.in);
	
	
	
		public void entradaDeDados(){ // MODIFICANDO O METODO QUE FOI HERDADO DA CLASSE PAI USUARIO
			String cpf,senha;
			
			System.out.println("Digite seu CPF: (somente n�meros)");
			cpf=ler.next();
			
			if(super.validarCpf(cpf) == true){
				System.out.println("cpf v�lido\n\n");
				
				super.setCpf(cpf);
				
				System.out.println("Digite seu nome e sobre nome:");
				super.setNome(ler.next());
				super.setSobrenome(ler.next());
				
				System.out.println("Digite o n�mero de seu RG");
				super.setRg(ler.next());
				
				System.out.println("Crie uma senha:");
				super.setSenha(ler.next());
				System.out.println("Confirme a senha:");
				senha=ler.next();
				super.setSenha(senha);
				
				if(super.getSenha().equals(senha)){
					System.out.println("Cadastro Conclu�do\n\n");
					System.out.println("SEU DADOS DE LOGIN S�O: \n CPF: "+super.getCpf()+"\n SENHA: "+super.getSenha());
				}
				else if(super.getSenha()!=senha){
					System.out.println("Senha Incorreta, cadastre-se novamente");
					entradaDeDados();
				}

			}
			else {
				System.out.println("cpf inv�lido\n\n");
				entradaDeDados();
			}
			
		}
		
		
		public int autenticaFunc(int i, String senhaa) {//ESSE M�TODO N�O SER� USADO ( PE�O DESCULPAS PELA GAMBIARRA)
			return 0;
		}

		@Override
		public boolean autentica(String cpff, String senhaa) {
			if(super.getCpf().equals(cpff) && super.getSenha().equals(senhaa)){		
							
						return true;
			}
			else 
				return false;
		}


	}