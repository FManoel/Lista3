package Lista03;

public class TesteContaBancaria 
{
	public static void main(String[] args)
	{
		ContaBancaria x = new ContaBancaria();
		
		x.depositar(200);
		x.sacar(50);
		System.out.println(x.recuperaDadosParaImpressao());
		
	}

}
