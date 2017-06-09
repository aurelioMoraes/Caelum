package br.com.aurelio.banco.contas;

public class PessoaFisica implements Cliente{
	
	private String cpf;
	private String nome;
	private String telefone;
	
	public PessoaFisica(String cpf, String nome) {
		
		this.nome = nome;
		
		if( validaDados(cpf) ){
			this.cpf = cpf;	
		} else {
			return;
		}
	}
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;		
	}

	@Override
	public String getTelefone() {
		return this.telefone;
	}

	@Override
	public void setTelefone(String telefone) {
		this.telefone = telefone;
		
	}

	@Override
	public boolean validaDados(String numeroRegistro) {
		String[] formatedCpf = numeroRegistro.split(".|-");
		if(formatedCpf.length == 11){
			return true;
		} else {
			return false;
		}
	}

}
