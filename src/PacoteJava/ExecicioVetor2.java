/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.

 * */
package PacoteJava;
import java.util.*;

public class ExecicioVetor2 {

	public static void main(String[] args) {
		
	
int[] num= new int[6] ;
int somapar=0,quantimpar=0,x,quantpar=0;
Scanner leia = new Scanner(System.in);

for(x=0;x<6;x++)
{
	System.out.println("\nEntre com um n�mero: ");
	num[x] = leia.nextInt();
	
	if(num[x]%2==0)
	{
		System.out.println("\nEsse n�mero � par --> "+num[x]);
		somapar = somapar + num[x];
	
	}
	else
	{
		System.out.println("\nEsse n�mero � impar --> "+num[x]);
		quantimpar++;
	}
	
}
System.out.println("\nA soma dos n�meros pares foi : "+somapar);
System.out.println("\nA quantidade de n�meros �mpares digitados foi: "+quantimpar);

 }
}