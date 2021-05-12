package AulasJavas;
import java.util.*;

public class ExemploArrayMatriz {

	public static void main(String[] args) {
	
	float[][] notas = new float[2][2];
	float somanotas=0,somamerdia=0,media,mediageral;
	int cont=0,linha,coluna;
	
	Scanner leia = new Scanner(System.in);
	
	for(linha=0;linha<2;linha++)
	{
		for(coluna=0;coluna<2;coluna++)
		 {
			System.out.println("\nEntre com a nota: ");
			notas[linha][coluna] = leia.nextFloat();
			somanotas = somanotas + notas[linha][coluna];
			cont++;
		 }
		}
	mediageral = somanotas / cont;
	System.out.printf("\nMédia Geral: %2.2f",mediageral);
	}
	
}