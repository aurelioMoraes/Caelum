package br.com.aurelio.banco.contas;

public class Gerente extends Funcionario{
	
	
	public Gerente() {}
	
	public Gerente(String nome) {
		this.nome = nome;
	}

	@Override
	double getBonificacao() {
		return this.salario * 1.4 + 1000;
	}

}