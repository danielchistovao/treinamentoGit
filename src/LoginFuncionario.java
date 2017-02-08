import java.util.Scanner;

public class LoginFuncionario extends CadastroFuncionario implements NdeRegistroFuncionario{

	Scanner ler =new Scanner (System.in);
	
	CadastroFuncionario info = new CadastroFuncionario();
	
	int registro;
	String senha;
	
	public void logando(){			
		System.out.println("\n\n•♦◘ ACESSO AO LOGIN: ◘♦•");
		System.out.print("\nREGISTRO EMPRESA: ");
		registro=ler.nextInt();
		info.setRegistroEmpresa(registro);
		
		
		System.out.println("\nSENHA: ");
		senha=ler.next();
		info.setSenha(senha);			
		
		info.autenticaFunc(registro, senha);

		
		if(info.autenticaFunc(info.getRegistroEmpresa(), info.getSenha()) ==1){
			System.out.println("•♦◘ USUÁRIO LOGADO ◘♦•\n\n");
		}
		else
			System.out.println("CPF INVÁLIDO: USUÁRIO NÃO CADASTRADO");
	}
	
	
	public int autenticaFunc(int i, String senhaa) {
		return 0;
	}
}
