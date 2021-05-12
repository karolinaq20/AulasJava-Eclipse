package Testes;

public class ComparacaoString {
public static void main(String[] args) {

	String nome1="Karolina";
	String nome2="Karolina";
	String nome3=new String("Karolina");
	String res;
	res = (nome1.equals(nome3))?"igual":"diferente";
	System.out.println(res);
}
}
