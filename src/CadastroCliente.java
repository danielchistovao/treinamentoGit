import java.util.Scanner;

public class CadastroCliente extends Usuario implements NdeRegistroFuncionario{

	Scanner ler = new Scanner (System.in);
	
	
	
		public void entradaDeDados(){ // MODIFICANDO O METODO QUE FOI HERDADO DA CLASSE PAI USUARIO
			String cpf,senha;
			
			System.out.println("Digite seu CPF: (somente números)");
			cpf=ler.next();
			
			if(super.validarCpf(cpf) == true){
				System.out.println("cpf válido\n\n");
				
				super.setCpf(cpf);
				
				System.out.println("Digite seu nome e sobre nome:");
				super.setNome(ler.next());
				super.setSobrenome(ler.next());
				
				System.out.println("Digite o número de seu RG");
				super.setRg(ler.next());
				
				System.out.println("Crie uma senha:");
				super.setSenha(ler.next());
				System.out.println("Confirme a senha:");
				senha=ler.next();
				super.setSenha(senha);
				
				if(super.getSenha().equals(senha)){
					System.out.println("Cadastro Concluído\n\n");
					System.out.println("SEU DADOS DE LOGIN SÃO: \n CPF: "+super.getCpf()+"\n SENHA: "+super.getSenha());
				}
				else if(super.getSenha()!=senha){
					System.out.println("Senha Incorreta, cadastre-se novamente");
					entradaDeDados();
				}

			}
			else {
				System.out.println("cpf inválido\n\n");
				entradaDeDados();
			}
			
		}
		
		
		public int autenticaFunc(int i, String senhaa) {//ESSE MÉTODO NÃO SERÁ USADO ( PEÇO DESCULPAS PELA GAMBIARRA)
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