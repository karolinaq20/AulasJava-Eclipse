package Testes;

public class TesteFuncao01 {
//static void soma (int a ,int b) {
	static int soma (int a,int b) {
	int s = a + b;
	//System.out.println("A soma � "+s);
	return s;
}
	public static void main(String[] args) {
System.out.println("Come�ou o programa!");
	int	sm = soma (5,2);
	System.out.println("A soma vale" +sm);
}
}
