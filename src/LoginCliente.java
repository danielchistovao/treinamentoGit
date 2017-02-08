import java.util.Scanner;
public class LoginCliente extends CadastroCliente implements NdeRegistroFuncionario{

		Scanner ler =new Scanner (System.in);
		String cpf1,senha1;
		
		CadastroCliente log = new CadastroCliente();
		
		public void logando(){			
			System.out.println("\n\n•♦◘ ACESSO AO LOGIN: ◘♦•");
			System.out.print("\nCPF: ");
			cpf1=ler.next();
			log.setCpf(cpf1);
			
			
			System.out.println("\nSENHA: ");
			senha1=ler.next();
			log.setSenha(senha1);			
			
			log.autentica(cpf, senha1);
			
			if(log.autentica(log.getCpf(), log.getSenha()) == true){
				System.out.println("LOGOU");
			}
			else
				System.out.println("CPF INVÁLIDO: USUÁRIO NÃO CADASTRADO");
		}
}
