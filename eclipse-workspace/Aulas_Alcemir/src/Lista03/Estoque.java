package Lista03;
/*
 * 05. Escreva uma classe em Java chamada Estoque. Ela dever� possuir:
a. Os atributos nome (String), qtdAtual (int) e qtdMinima (int).
b. Um construtor sem par�metros e um outro contendo os par�metros nome, qtdAtual,
e qtdMinima.
c. os m�todos com as seguintes assinaturas:
i. void mudarNome(String nome)
ii. void mudarQtdMinima(int qtdMinima)
iii. void repor(int qtd)
iv. void darBaixa(int qtd)

v. String mostra()
vi. boolean precisaRepor()

06. Os atributos qtdAtual e qtdMinima jamais poder�o ser negativos. O m�todo repor
aumenta qtdAtual de acordo com o par�metro qtd. O m�todo darBaixa diminui qtdAtual
de acordo com o par�metro qtd. O m�todo mostra() retorna uma String contendo o nome
do produto, sua quantidade m�nima, sua quantidade atual. O m�todo precisaRepor
retorna true caso a quantidade atual esteja menor ou igual � quantidade m�nima e false,
caso contr�rio.
*/

public class Estoque 
{
	String nome;
	public int qtdAtual,qtdMinima;
	
	 void mudarNome(String nome)
	{
		
	}
	void mudarQtdMinima(int qtdMinima)
	{
		
	}
	public void repor(int qtd)
	 {
		 this.qtdAtual += qtd;
	 }
	 String mostra()
	 {
		 return this.nome + "\nQuantidade minima: " + this.qtdMinima + "\nQuantidade atual: " + this.qtdAtual;
	 }
	public void darBaixa(int qtd)
	 {
		 this.qtdAtual -= qtd;
	 }
	 public boolean precisaRepor()
	 {

		 if(this.qtdAtual <= this.qtdMinima)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }
	
	
	Estoque()
	{
		
	}
	public Estoque(String nome, int qtdAtual, int qtdMinima)
	{
		this.nome = nome;
		if(qtdAtual > 0 && qtdMinima > 0)
		{
			this.qtdAtual = qtdAtual;
			this.qtdMinima = qtdMinima;
		}
		else
		{
			System.out.println("OS parametros passados s�o invalidos!");
		}
	}

}
