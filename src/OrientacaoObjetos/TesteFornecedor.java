package OrientacaoObjetos;

public class TesteFornecedor {
public static void main(String[] args) {
	
	FornecedorHeranca4 felipe = new FornecedorHeranca4 ("Felipe","Rua Pascoal,222","12345678911",12345678,18,25000,10000);
	felipe.imprimirInfo();
	felipe.validarCpf();
	felipe.obterSaldo();
	
}
}
