package PacoteJava;
import java.util.*;
public class ExercicioDoWhile2 {
/*6-Escrever um programa que receba vários números inteiros no teclado. 
 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/
public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	int num,media=0,mult=0,x=0;
	
	do
	{
		System.out.printf("\nEntre com um número: ");
		num = leia.nextInt();
		
		if(num%3==0 && num!=0)
		{
			mult = (mult+num);
			x++;
		}
		
	}
	
	
	while (num!=0);
	media= mult / x;
	System.out.printf("\nA média dos números múltiplos de 3 é: %d",media);
		
	
	
}
	
	
}
