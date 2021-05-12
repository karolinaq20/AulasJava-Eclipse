package PacoteJava;
import java.util.Scanner;

public class ExercicioWhile2 {
public static void main(String[] args) {
	
	
	int idade,sexo,fp,contpc=0,contmn=0,contha=0,contoc=0,contpn40=0,contpc18=0,x=1;
	
	Scanner leia = new Scanner(System.in);
	
	while(x<=6)
	{
		System.out.println("\nEntre com a sua idade: ");
		idade= leia.nextInt();
		System.out.println("\nSexo: \n1-Feminino\n2-Masculino\n3-Outros");
		sexo = leia.nextInt();
		System.out.println("\nFator Psicológico : \n1-Calma /o/ e \n2-Nervoroso/o/e\n3-Outros");
		fp = leia.nextInt();
				
		if(fp==1)
		{
			contpc++;
		}
		if(sexo==1 && fp==2)
		{
			contmn++;
		}
		if (sexo==2 && fp==3)
		{
			contha++;
		}
		if(sexo==3 && fp==1)
		{
			contoc++;
		}
		if(fp==2 && idade>40)
		{
			contpn40++;
			
		}
		if(fp==1 && idade<18)
		{
			contpc18++;
		}
		x++;
	System.out.println("\nQuantidades de pessoas calmas: "+contpc);
	System.out.println("\nQuantidades de mulheres nervosas: "+contmn);
	System.out.println("\nQuantidades de homens agressivos: "+contha);
	System.out.println("\nQuantidades de outras pessoas calmas: "+contoc);
	System.out.println("\nQuantidades de pessoas nervosas com mais de 40 anos: "+contpn40);
	System.out.println("\nQuantidades de pessoas calmas com menos de 18 anos: "+contpc18);
	
	}
	
	
}
}
