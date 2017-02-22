package banco;

public class TesteEmpresa {
	
	public static void main(String[] args) {
		
		Empresa empresa = new Empresa(3);
		int quantidadeDeFuncionarios = 3;
		
		for( int i = 0 ; i < quantidadeDeFuncionarios; i++ ){
			Funcionario f = new Funcionario("joao" + i);
			f.setSalario( 1000 + i * 100 );	
			empresa.adiciona(f);
		}

		empresa.mostraEmpregados();
		
		
		System.out.println("Total de funcionario criados: " + Funcionario.getIdentificador() );
		
		//Funcionario novoFunc = new Funcionario();
		//novoFunc.setNome("carlos");
		//System.out.println(empresa.contem(empresa.empregado[0]));
		//System.out.println(empresa.contem(novoFunc));
	}
}
