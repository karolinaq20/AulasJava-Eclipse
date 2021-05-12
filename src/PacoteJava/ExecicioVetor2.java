/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.

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
	System.out.println("\nEntre com um número: ");
	num[x] = leia.nextInt();
	
	if(num[x]%2==0)
	{
		System.out.println("\nEsse número é par --> "+num[x]);
		somapar = somapar + num[x];
	
	}
	else
	{
		System.out.println("\nEsse número é impar --> "+num[x]);
		quantimpar++;
	}
	
}
System.out.println("\nA soma dos números pares foi : "+somapar);
System.out.println("\nA quantidade de números ímpares digitados foi: "+quantimpar);

 }
}