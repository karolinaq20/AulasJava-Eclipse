package PacoteJava;

import java.util.Scanner;

public class Decisao1 {
public static void main(String[] args) {
	
	int num; 
	
	Scanner leia = new Scanner (System.in);
	
	System.out.println("Entre com um número: ");
	num =leia.nextInt();
	
	if(num>0)
	{
		System.out.println("\nO número é positivo!!! ");
		
	}
	else if(num == 0)
	{
		System.out.println("\nO número é ZERO!!!");
	}
	else
	{
		System.out.println("\nO número é negativo!!!");
	}
}

}
