package Lista03;
/*
 * 05. Escreva uma classe em Java chamada Estoque. Ela deverá possuir:
a. Os atributos nome (String), qtdAtual (int) e qtdMinima (int).
b. Um construtor sem parâmetros e um outro contendo os parâmetros nome, qtdAtual,
e qtdMinima.
c. os métodos com as seguintes assinaturas:
i. void mudarNome(String nome)
ii. void mudarQtdMinima(int qtdMinima)
iii. void repor(int qtd)
iv. void darBaixa(int qtd)

v. String mostra()
vi. boolean precisaRepor()

06. Os atributos qtdAtual e qtdMinima jamais poderão ser negativos. O método repor
aumenta qtdAtual de acordo com o parâmetro qtd. O método darBaixa diminui qtdAtual
de acordo com o parâmetro qtd. O método mostra() retorna uma String contendo o nome
do produto, sua quantidade mínima, sua quantidade atual. O método precisaRepor
retorna true caso a quantidade atual esteja menor ou igual à quantidade mínima e false,
caso contrário.
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
			System.out.println("OS parametros passados são invalidos!");
		}
	}

}
