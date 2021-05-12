package Testes;
import java.util.*;
public class EscolhaCaso {
public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
	System.out.println("\nQuantas pernas? ");	
int perna = leia.nextInt();
String tipo;
System.out.println("\nIsso é um (a) ");
switch (perna)
{
case 1 :
tipo = "Saci";
break;

case 2:
	tipo = "Bípede";
	break;
case 3 :
	tipo = "Tripé";
	break;
case 4 :
	tipo = "Quadrúpede";
	break;
case 6 :
	tipo = "Aranha";
	break;
	default:
		tipo = "ET";
		
	
}
System.out.println(tipo);
 }
}
