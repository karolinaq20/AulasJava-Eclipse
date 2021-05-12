package OrientacaoObjetos;

public class Pessoa {
private String primeiroNome;
private String ultimoNome;
private String nomesDomeio;

public Pessoa (String primeiro,String meio,String ultimo)
{
	primeiroNome = primeiro;
	ultimoNome = ultimo;
	nomesDomeio = meio;
	
	}
public String getNomeCompleto()
{
	String nomeCompleto = primeiroNome +" "+nomesDomeio +" "+ultimoNome;
	return nomeCompleto;
}
}
