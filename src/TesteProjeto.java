import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteProjeto {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int resp1,resp2;
		CadastroCliente cadastrar = new CadastroCliente();
		CadastroFuncionario cadastroF = new CadastroFuncionario();
		LoginCliente login1 = new LoginCliente();
		LoginFuncionario login2 = new LoginFuncionario();
		
		RealizarVendas obj2=new RealizarVendas();
		
		CadastroCarros obj = new CadastroCarros();
		
		
		System.out.println("•♦◘ BEM VINDO A AUTOINDRA ◘♦•");
		
		System.out.println("Você é :\n 1- Cliente   2-Funcionário");
		resp1=ler.nextInt();
		System.out.println("Tecle 2 para cadastrar \n 2-OK");
		resp2=ler.nextInt();
		
		if(resp1==1 && resp2==2){//SE FOR CLIENTE SEM CADASTRO
			System.out.println("•♦◘ FAÇA SEU CADASTRO E TENHA ACESSO AO NOSSO LOGIN ◘♦•");			
			cadastrar.entradaDeDados();
			login1.logando();
		}
		else if(resp1==2 && resp2==2){//SE FOR FUNCIONÁRIO MAS SEM CADASTRO
			System.out.println("•♦◘ FAÇA SEU CADASTRO E TENHA ACESSO AO NOSSO LOGIN ◘♦•");	
			cadastroF.entradaDeDados();	
			login2.logando();
			
			System.out.println("Funcionário: "+cadastroF.getNome() +"\nCargo: "+cadastroF.getCargo());
			System.out.println("O que deseja fazer?\n1.Cadastrar carros no sistema    2.Realizar Vendas");
			
			if(ler.nextInt()==1){
					obj.obterDados();
			}
			else if (ler.nextInt()==2){
					obj2.obterDados();
			}
			
		}
		
		
	}
}
