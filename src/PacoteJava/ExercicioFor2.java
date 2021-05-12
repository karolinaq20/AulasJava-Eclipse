package PacoteJava;
/*2-Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 * */
import java.util.*;

public class ExercicioFor2 {
	
public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int num,x,par=0,impar=0;
	
	for(x=1;x<=10;x++)
	{
		System.out.printf("\nEntre com um valor: ");
		num= leia.nextInt();
		
		if(num%2==0)
		{
			par = par + 1;
		}
	if(num%2==1)
	{
		impar = impar +1;
	}
	
	}
	System.out.printf("\nA quantidade de números pares é: %d",par);
	System.out.printf("\nA quantidade de números impares é: %d",impar);
	
	
}
}
