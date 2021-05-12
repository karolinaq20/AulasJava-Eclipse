package AulasJavas;

import java.util.Scanner;

public class RepeticaoDoWhile {
	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner (System.in)) {
			int idade;
			
			do 
				{
				System.out.printf("\nEntre com a sua idade: ");
				idade = entrada.nextInt();
					System.out.printf("\nSua idade: %d",idade);
					if(idade>=18)
					{
						System.out.printf("\nVocê é de maior...");
					}
					else
					{
						System.out.printf("\nVocê é de menor.");
						idade = entrada.nextInt();
						
					}
					
				}
				while(idade>=1);
			
		}
	}

}

