package OrientacaoObjetos;

public class FornecedorHeranca4 extends PessoaHeranca {
private double valorCredito;
private double valorDivida;

public FornecedorHeranca4 (String nome,String endereco,String cpf ,int telefone,int idade,double valorCredito,double valorDivida)
{
	super(nome,endereco,cpf,telefone,idade);
	this.valorCredito = valorCredito;
	this.valorDivida = valorDivida;
	
}
public FornecedorHeranca4(String nome,String endereco,double valorDivida)
{
	super(nome,endereco);
	this.valorDivida = valorDivida;
	
}
public void imprimirInfo()
{
System.out.println("\nNome do empregado: "+getNome()+"\n"+"CPF: "+getCpf()+"\n"
+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()+"\n"+"Endereço: "
+getEndereco()+"\n"+"Valor monetário do total de artigo produzidos por "+getNome()+" : "+ "\nValor crédito: "+valorCredito+"\nValor dívida: "+valorDivida);
}
public void validarCpf()
{
	if(getCpf().length()!=11)
	{
		System.out.println("\n--CPF Inválido!!!");
	}
	else
	{
		System.out.println("\n--CPF Válido!!!");
	}
}
public double getValorCredito() {
	return valorCredito;
}
public void setValorCredito(double valorCredito) {
	this.valorCredito = valorCredito;
}
public double getValorDivida() {
	return valorDivida;
}
public void setValorDivida(double valorDivida) {
	this.valorDivida = valorDivida;
}
public void obterSaldo()
{
	double diferencacd = valorCredito - valorDivida;
	System.out.println("\nO saldo referente ao fornecedor é igual a: "+diferencacd);
	
}




}
