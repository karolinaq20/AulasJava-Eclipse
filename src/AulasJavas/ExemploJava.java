package AulasJavas;

import java.util.Scanner;

public class ExemploJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a nota 1: ");
		nota1 = leia.nextFloat();
		System.out.println("Entre com a nota 2: ");
		nota2 = leia.nextFloat();
		System.out.println("Entre com a nota 3: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3)/3;
		System.out.println("\nMédia aritmética: "+media);
		System.out.printf("Media aritmédica arredondada: %2.2f",media);
		
		nota1 = Math.sqrt(nota2);
		nota2 = Math.pow(nota3, 3);
		nota3 = nota1 % nota2;
		
	}

}
