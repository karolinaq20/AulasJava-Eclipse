package AulasJavas;
import java.util.*;
public class ExemploArrayVetor {

	public static void main(String[] args) {
		
		int[]numeros = new int[5];
		int somapar=0,quantimpar=0,x;
		
		Scanner leia = new Scanner(System.in);
				
		for(x=0;x<5;x++)
		{
			System.out.println("\nEntre com um n�mero: ");
			numeros[x] = leia.nextInt();
		
			if (numeros[x]%2==0)
			{
				somapar = somapar + numeros [x];
				
			}
			else
			{
				quantimpar++;
			}
		
		}
			for(x=0;x<5;x++)
		{
			if (numeros[x]%2==0)
			{
				System.out.println("\nN�meros: "+numeros[x]+"<--Este n�mero � par");
			}
			else
			{
				System.out.println("\nN�meros: "+numeros[x]+"<--Este n�mero � impar");
			}
			
		}
			System.out.println("\nSomat�rio pares :"+somapar);
			System.out.println("\nN�meros impares digitados : "+quantimpar);
		}
		
}