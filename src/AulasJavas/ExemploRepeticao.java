package AulasJavas;
import java.util.*;
public class ExemploRepeticao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1,nota2,nota3,media,somamedia=0,mediageral;
		try (//int x;
		Scanner leia = new Scanner(System.in)) {
			for(int x=1;x<=1;x++)
			{

				System.out.println("\nEntre com a primeira nota: ");
				nota1 = leia.nextFloat();
				System.out.println("\nEntre com a segunda nota: ");
				nota2 = leia.nextFloat();
				System.out.println("\nEntre com a terceira nota: ");
				nota3 = leia.nextFloat();
				
				media = (nota1 + nota2 + nota3)/3;
				System.out.printf("\nM�dia aluno "+x+": %2.2f",media);
				somamedia = somamedia + media;
			}
			mediageral = somamedia / 3;
			System.out.println("\nM�dia geral: "+mediageral);
			for(int x=1;x<=10;x++)
			{
				System.out.println("\n");
			}
			int num,somapar=0,somaimpar=0;
			System.out.println("Entre com um n�mero: ");
			num = leia.nextInt();
			
			while(num!=0)
			{
				if(num%2==0)
				{
					somapar = somapar + num;
				}
				else
				{
					somaimpar = somaimpar + num;
				}
				System.out.println("\nEntre com um n�mero: ");
				num = leia.nextInt();
			}
			System.out.println("\nSomat�rio dos pares: "+somapar);
			System.out.println("\nSomat�rio dos �mpares: "+somaimpar);
			int somanum=0;
			System.out.println("\nEntre com um n�mero: ");
			num = leia.nextInt();
			do
			{
				
				somanum = somanum + num;
				System.out.println("\nEntre com um n�mero: ");
				num = leia.nextInt();
			}
			while(num<0);
			System.out.println("\nSomat�rio dos n�meros: "+somanum);
		}
	}
	
	

}

