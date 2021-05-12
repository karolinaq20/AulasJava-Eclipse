package OrientacaoObjetos;

public class OperarioHeranca3 extends PessoaHeranca {
private double valorProducao;
private double comissao;

public OperarioHeranca3 (String nome,String endereco,String cpf ,int telefone,int idade,double valorProducao,double comissao)
   {
	super(nome,endereco,cpf,telefone,idade);
	this.valorProducao = valorProducao;
	this.comissao = comissao;
	}
		public void imprimirInfo()
		{
		System.out.println("\nNome do empregado: "+getNome()+"\n"+"CPF: "+getCpf()+"\n"
		+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()+"\n"+"Endereço: "
		+getEndereco()+"\n"+"Valor monetário do total de artigo produzidos por "+getNome()+" : "+valorProducao+"\n"+"Porcentagem ( sem '%') da comissao deste artigo: "+comissao);
	}
	public void calcularValorArtigo()
	{
		double valor_total = valorProducao + (valorProducao *(comissao/100));
		System.out.println("\nO valor total a ser recebido pelo operário "+getNome()+"é igual a: "+valor_total);
	}


public double getValorProducao() {
	return valorProducao;
}

public void setValorProducao(double valorProducao) {
	this.valorProducao = valorProducao;
}

public double getComissao() {
	return comissao;
}

public void setComissao(double comissao) {
	this.comissao = comissao;
}
}
