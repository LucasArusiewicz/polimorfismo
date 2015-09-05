package src;

import java.util.Scanner;

public class Visitante extends Pessoa {

	private String numeroCracha;
	private Funcionario funcResp;

	public Visitante() {
		super();
		Scanner scan = new Scanner(System.in);
		System.out.println("===== Dados do Visitante =====");
		System.out.println("Informe o numero do crachá: ");
		this.numeroCracha = scan.nextLine();
		System.out.println("Matricula do funcionário responsável");
		funcResp();
		ControleAcesso.listaPessoas.add(this);
		System.out.println("Visitante cadastrado: " + super.getNome() + " " + super.getSobreNome() + ".");
		System.out.println("Crachá: " + this.numeroCracha);
	}

	private void funcResp() {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while (i == 0) {
			int mat = scan.nextInt();
			for (Pessoa p : ControleAcesso.listaPessoas) {
				System.out.println("teste");
			}
		}

	}

	public String getNumeroCracha() {
		return numeroCracha;
	}

	public void setNumeroCracha(String numeroCracha) {
		this.numeroCracha = numeroCracha;
	}

	public Funcionario getFuncResp() {
		return funcResp;
	}

	public void setFuncResp(Funcionario funcResp) {
		this.funcResp = funcResp;
	}

}
