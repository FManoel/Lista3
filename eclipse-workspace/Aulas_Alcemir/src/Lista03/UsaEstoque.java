package Lista03;
/*
 * 07. Escreva uma classe UsaEstoque cujo m�todo main instancia os 3 objetos a seguir:
estoque1
nome: Impressora Jato de Tinta
qtdAtual: 13
qtdMinima: 6

estoque2
nome: Monitor LCD 17 polegadas
qtdAtual: 11
qtdMinima: 13

estoque3
nome: Mouse �tico
qtdAtual: 6
qtdMinima: 2

Depois disso, execute as seguintes opera��es na seguinte ordem:
a. a) Dar baixa em 5 unidades de estoque1.
b. b) Fazer a reposi��o de 7 unidades de estoque2.
c. c) Dar baixa em 4 unidades de estoque3.
d. d) Exibir a sa�da do m�todo precisaRepor dos 3 objetos.
e. Exibir a sa�da do m�todo mostra para apresentar as informa��es sobre os 3 objetos.*/

public class UsaEstoque 
{

	static	Estoque estoque1 = new Estoque("Impressora Jato de Tinta",13,6);
    static	Estoque estoque2 = new Estoque("Monitor LCD 17 polegadas",11,13);
    static  Estoque estoque3 = new Estoque("Mouse �tico",6,2);
	

}
