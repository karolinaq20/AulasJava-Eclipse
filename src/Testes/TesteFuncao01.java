package Testes;

public class TesteFuncao01 {
//static void soma (int a ,int b) {
	static int soma (int a,int b) {
	int s = a + b;
	//System.out.println("A soma é "+s);
	return s;
}
	public static void main(String[] args) {
System.out.println("Começou o programa!");
	int	sm = soma (5,2);
	System.out.println("A soma vale" +sm);
}
}
