package OrientacaoObjetos;

public class TelefonePublico extends Telefone {

	public TelefonePublico()
{
	super ("P�blico");
}
public void toca (int numToques)
{
	for(int i=0;i<numToques;i++)
	{
		System.out.println("\nTrimtrimtrim...Trimtrimtrim...Trimtrimtrim");
	}
}
	@Override
	public void disca(String numero)
	{
		if(numero.charAt(0)=='9'||numero.charAt(0)=='8')
		{
			System.out.println("\nEste telefone n�o liga para celular");
		}
		else
		{
			System.out.println("\nDiscando: "+numero);
		}
	}
}

