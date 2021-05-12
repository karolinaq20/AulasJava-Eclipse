/*4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. 
Na terceira op��o o valor da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz.*/

package PacoteJava;

import java.util.Scanner;

public class ExercicioMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];
		int valor,l,c,op;
		
		Scanner leia = new Scanner(System.in);
		
		//System.err.println("\nErro");
		for(l=0;l<2;l++)
		{
			for(c=0;c<2;c++)
			{
				System.out.println("\nMatriz1: ");
				matriz1[l][c] = leia.nextFloat();
				System.out.println("\nMatriz2: ");
				matriz2[l][c] = leia.nextFloat();
			}
		}
		
		System.out.println("\nEntre com um valor para a constante: ");
		valor = leia.nextInt();
		
		System.out.println("\n\t\tMenu de op��es...");
		System.out.println("\n1- Somar as duas matrizes");
		System.out.println("\n2- Subtrair a primeira matriz da segunda");
		System.out.println("\n3- Adicionar uma constante as duas matrizes");
		System.out.println("\n4- Imprimir as matrizes");
		System.out.println("\nDigite sua op��o: ");
		op = leia.nextInt();
		while(op<1 || op>4)
		{
			System.out.println("\nDigite uma op��o v�lida");
			System.out.println("\n\t\tMenu de op��es...");
			System.out.println("\n1- Somar as duas matrizes");
			System.out.println("\n2- Subtrair a primeira matriz da segunda");
			System.out.println("\n3- Adicionar uma constante as duas matrizes");
			System.out.println("\n4- Imprimir as matrizes");
			System.out.println("\nDigite sua op��o: ");
			op = leia.nextInt();
		}
		switch(op)
		{
		case 1:
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					matriz3[l][c] = matriz1[l][c] + matriz2[l][c];
					System.out.println("\nSoma matriz: "+matriz3[l][c]);
				}
			}
			break;
		case 2:
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					matriz3[l][c] =  matriz2[l][c] - matriz1[l][c] ;
					System.out.println("\nDiferen�a matriz: "+matriz3[l][c]);
				}
			}
			break;
		case 3:
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					matriz1[l][c] = matriz1[l][c] + valor;
					matriz2[l][c] = matriz2[l][c] + valor;
					System.out.println("\nMatriz1 somada a constante: "+matriz1[l][c]);
					System.out.println("\nMatriz2 somada a constante: "+matriz2[l][c]);
				}
			}
			break;
		case 4:
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++)
				{
					
					System.out.println("\nMatriz1 : "+matriz1[l][c]);
					System.out.println("\nMatriz2 : "+matriz2[l][c]);
				}
			}
			break;
			/*default:
				System.out.println("\nOp��o inv�lida!!!");*/
		}
	}

}
