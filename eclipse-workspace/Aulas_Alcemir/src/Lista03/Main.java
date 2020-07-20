package Lista03;
/*
 * 02. Acrescente um método main à classe Lampada da questão 01. O método main deve:
a. Instanciar 2 objetos do tipo Lampada (lampa1 e lampa2)
b. Ligar o objeto lampa1 e desligar o objeto lampa2.
c. Usar o método observa() para mostrar se os objetos lampa1 e lampa2 estão
“ligados” ou “desligados”.*/

public class Main 
{
	public static void main(String[] args)
	{
		Lampada lampa1 = new Lampada();
		Lampada lampa2 = new Lampada();
		
		lampa1.liga();
		lampa2.desliga();
		System.out.println(lampa1.observa() + "\n" + lampa2.observa());
		
		usaEstoque();
		usaQuadrado();
		
	}
	static void usaEstoque()
	{
		UsaEstoque.estoque1.darBaixa(5);
		UsaEstoque.estoque2.repor(7);
		UsaEstoque.estoque3.darBaixa(4);
		
		System.out.println("Estoque 1: " + UsaEstoque.estoque1.precisaRepor()+ "\nEstoque 2: " + UsaEstoque.estoque2.precisaRepor()+ "\nEstoque 3: " + UsaEstoque.estoque3.precisaRepor() + "\n");
		System.out.println(UsaEstoque.estoque1.mostra() + "\n\n"+UsaEstoque.estoque2.mostra() + "\n\n"+UsaEstoque.estoque3.mostra() + "\n");
		
	}
static void usaQuadrado()
{
	System.out.println("Area do q1 = "+ UsaQuadrado.q1.area()+"\nPerimetro do q1 = "+ UsaQuadrado.q1.perimetro() + "\n\n");
	System.out.println("Area do q2 = "+ UsaQuadrado.q2.area()+"\nPerimetro do q2 = "+ UsaQuadrado.q2.perimetro() + "\n\n");
	System.out.println("Area do q3 = "+ UsaQuadrado.q3.area()+"\nPerimetro do q3 = "+ UsaQuadrado.q3.perimetro() + "\n\n");
}
}
