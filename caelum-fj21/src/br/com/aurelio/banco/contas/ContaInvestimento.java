package br.com.aurelio.banco.contas;

public class ContaInvestimento extends Conta{
	@Override
	public void atualiza(double taxaSelic) {
		this.saldo += this.saldo * taxaSelic;	
	}
}