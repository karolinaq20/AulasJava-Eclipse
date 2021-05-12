package OrientacaoObjetos;

public class TesteAutomovel {
public static void main(String[] args) {
	//instaciando um objeto da classe automovel
	Automovel auto1 = new Automovel("Karol","Ferrari","48B7596",2021);
	
	//troca de mensagens ( chamada ao método imprimirInfo()
	auto1.imprimirInfo();
	System.out.println("\n***Transferência de Proprietário***");
	auto1.setNomeProprietarie("Tokunbo");
	auto1.imprimirInfo();
	
	Automovel auto2 = new Automovel("Amanda","Defender","UDP4711",2018);
    auto2.imprimirInfo();
    System.out.println("\n***Mudança de Placa***");   
    auto2.setPlaca("KRP2012");
    auto2.imprimirInfo();
    
	}
}
