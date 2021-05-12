package PacoteJava;

import java.io.InputStream;
import java.util.Scanner;

public class Decisao2 {

	public static void main(String[] args) {
	float num1,num2,resultado=0;
	int op;
	
	Scanner ler = new Scanner(System.in);
	System.out.println("Entre com o primeiro número: ");
	num1 = ler.nextFloat();
	System.out.println("Entre com o primeiro número: ");
	num2 = ler.nextFloat();
	
	System.out.println("\n\t\tMenu de opções ");
	System.out.println("\n1-Soma\n2-Diferença\n3-Multiplicação\n4-Divisão");
	System.out.println("\nDigite sua opção: ");
	op = ler.nextInt();
		
	switch(op)
	{
	case 1:
		resultado = num1 + num2;
		break;
	case 2: 
		resultado = num1- num2;
		break;
	case 3:
		resultado = num1 * num2;
		break;
	case 4 :
		resultado = num1 / num2;
		break;
		default:
		System.out.println("\nOpção inválida!!! ");
		
	}
	System.out.println("\nResultado: "+resultado);
	}

	private static Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

}
