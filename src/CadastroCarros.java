import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class CadastroCarros {
	
	Scanner ler = new Scanner (System.in);


    int quantidade;
	String marca, nome,ano;
	double valor;	
	
	List <CadastroCarros> listCarros =new ArrayList<>();
	
	void obterDados(){
		
		System.out.println("Digite a quantidade de carros que irá cadastrar");
		
		quantidade=ler.nextInt();
		
		for (int i=0; i<quantidade; i++) {
			CadastroCarros info = new CadastroCarros();
			
			System.out.println("Digite o ano do carro ");
			ano=ler.next();
			info.setAno(ano);
			
			System.out.println("Digite a marca do carro ");
			marca=ler.next();
			info.setMarca(marca);
			
			System.out.println("Digite o nome do carro ");
			nome=ler.next();
			info.setNome(nome);
			
			System.out.println("Digite o valor do carro ");
			valor=ler.nextDouble();		
			info.setValor(valor);
			
			listCarros.add(info);			
		}
		for (CadastroCarros cadastroCarros : listCarros) {
			System.out.println("\n\nCarro Cadastrado: ");
			System.out.println("Nome: "+cadastroCarros.getNome());
			System.out.println("Marca: "+cadastroCarros.getMarca());
			System.out.println("Ano: "+cadastroCarros.getAno());
			System.out.println("Valor: "+cadastroCarros.getValor());			
		}
		
	}
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<CadastroCarros> getListCarros() {
		return listCarros;
	}

	public void setListCarros(List<CadastroCarros> listCarros) {
		this.listCarros = listCarros;
	}

		
}
