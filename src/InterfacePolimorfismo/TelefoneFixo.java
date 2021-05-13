package OrientacaoObjetos;

public class TelefoneFixo extends Telefone {
	public TelefoneFixo()
	{
		super("Fixo");
	}
	@Override
	public void toca (int numToques)
	{
		for(int i=0;i<numToques;i++)
		{
			System.out.println("\nHello moto...");
		}
	}
	@Override
	public void disca (String numero)
	{
		System.out.println("\nO número: "+numero+"é um celular...");
	}
}
