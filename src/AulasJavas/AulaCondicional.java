package AulasJavas;
import java.util.*;
public class AulaCondicional {
public static void main(String[] args) {
	{
		Scanner ler = new Scanner(System.in);
		int idade;
		String nome;
		
		System.out.println("entre com sua idade:");
		idade = ler.nextInt();
		ler.nextLine();
		System.out.println("entre com seu nome:");
		nome = ler.nextLine();
		System.out.println("Seu nome:"+nome);
		System.out.println("sua idade: "+idade);
	}
}
}
