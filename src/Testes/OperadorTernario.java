package Testes;

public class OperadorTernario {
public static void main(String[] args) {
	int n1,n2,r;
	n1 = 4;
	n2 = 8;
	r = (n1>n2)?n1+n2:n1-n2;
	System.out.println(r);
	
	String teste = "Karol";
	Boolean isFemale;
	isFemale = teste == "Karol" ? true : false;
	
	if(teste == "Karol") {
		isFemale = true;
	}
	else {
		isFemale = false;
	}
	
	if(isFemale)
		System.out.println("Este nome é feminino: " + teste);
	
	
}
}
