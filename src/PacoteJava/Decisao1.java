package PacoteJava;

import java.util.Scanner;

public class Decisao1 {
public static void main(String[] args) {
	
	int num; 
	
	Scanner leia = new Scanner (System.in);
	
	System.out.println("Entre com um n�mero: ");
	num =leia.nextInt();
	
	if(num>0)
	{
		System.out.println("\nO n�mero � positivo!!! ");
		
	}
	else if(num == 0)
	{
		System.out.println("\nO n�mero � ZERO!!!");
	}
	else
	{
		System.out.println("\nO n�mero � negativo!!!");
	}
}

}
