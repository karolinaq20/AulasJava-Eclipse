package AulasJavas;

import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) {
	
		try (Scanner entrada = new Scanner (System.in)) {
			int idade;
			
			System.out.printf("Entre com a sua idade: ");
			idade = entrada.nextInt();
				
				while(idade>=1)
				{
					System.out.printf("\nSua idade: %d",idade);
					if(idade>=18)
					{
						System.out.printf("\nVoc� � de maior...");
					}
					else
					{
						System.out.printf("\nVoc� � de menor.");
						idade = entrada.nextInt();
						
					}
					System.out.printf("\nEntre com a sua idade: ");
					idade = entrada.nextInt();
				}
				
			
		}
	}

}

