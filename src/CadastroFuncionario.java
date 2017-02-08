import java.util.Scanner;
import java.util.Random;

public class CadastroFuncionario extends Usuario implements NdeRegistroFuncionario {
	
	public int registroEmpresa=0,op;


	public String cargo;
	

		Scanner ler = new Scanner (System.in);
		
		public void entradaDeDados(){ // MODIFICANDO O METODO QUE FOI HERDADO DA CLASSE PAI USUARIO
			
			String cpf,senha;
			
			
			System.out.println("Funcionário, Digite seu CPF:");
			cpf=ler.next();
			
			if(super.validarCpf(cpf) == true){
				System.out.println("cpf válido\n\n");
				
				super.setCpf(cpf);
				
				System.out.println("Digite seu nome e sobre nome:");
				super.setNome(ler.next());
				super.setSobrenome(ler.next());
				
				System.out.println("Digite o número correspondente ao seu cargo: \n1.Vendedor 2.Gerente");
				op=ler.nextInt();
				if(op==1){					
					cargo="Vendedor";
					setCargo(cargo);
					
				}else if(op==2){
					cargo="Gerente";
					setCargo(cargo);
				}
				
				System.out.println("\nDigite o número de seu RG");
				super.setRg(ler.next());
				
				System.out.println("Crie uma senha:");
				super.setSenha(ler.next());
				System.out.println("Confirme a senha:");
				senha=ler.next();
				
				Random nRegistroEmpresa= new Random();
				int numero=Math.abs(nRegistroEmpresa.nextInt()); // GERAR NUMERO DE REGISTRO DA EMPRESA
				
				if(super.getSenha().equals(senha)){
					registroEmpresa=numero;
					System.out.println("Cadastro Concluído");
					System.out.println("Seu Login é: \nNúmero de Registro Empresa: "+ registroEmpresa + "\nSenha: "+super.getSenha());
					
					
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
		
		public int getRegistroEmpresa() {
			return registroEmpresa;
		}

		public void setRegistroEmpresa(int registroEmpresa) {
			this.registroEmpresa = registroEmpresa;
		}
		
		public String getCargo() {
			return cargo;
		}

		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
		
		public int autenticaFunc(int i, String senhaa) {
			if(registroEmpresa ==i){				
				
				if(super.getSenha().equals(senhaa)){				
						return 1;
				}
					return 0;
			}
			else 
				return 0;
		}
		
		
		
		
		public boolean autentica(String cpff, String senhaa) { //ESSE MÉTODO NÃO SERÁ USADO ( PEÇO DESCULPAS PELA GAMBIARRA)
			if(super.getCpf().equals(cpf)){				
					
				if(super.getSenha().equals(senha)){				
						return true;
				}
					return true;
			}
			else 
				return false;
		}
}
