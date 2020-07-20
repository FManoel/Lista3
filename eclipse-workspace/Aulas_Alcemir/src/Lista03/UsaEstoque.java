package Lista03;
/*
 * 07. Escreva uma classe UsaEstoque cujo método main instancia os 3 objetos a seguir:
estoque1
nome: Impressora Jato de Tinta
qtdAtual: 13
qtdMinima: 6

estoque2
nome: Monitor LCD 17 polegadas
qtdAtual: 11
qtdMinima: 13

estoque3
nome: Mouse Ótico
qtdAtual: 6
qtdMinima: 2

Depois disso, execute as seguintes operações na seguinte ordem:
a. a) Dar baixa em 5 unidades de estoque1.
b. b) Fazer a reposição de 7 unidades de estoque2.
c. c) Dar baixa em 4 unidades de estoque3.
d. d) Exibir a saída do método precisaRepor dos 3 objetos.
e. Exibir a saída do método mostra para apresentar as informações sobre os 3 objetos.*/

public class UsaEstoque 
{

	static	Estoque estoque1 = new Estoque("Impressora Jato de Tinta",13,6);
    static	Estoque estoque2 = new Estoque("Monitor LCD 17 polegadas",11,13);
    static  Estoque estoque3 = new Estoque("Mouse Ótico",6,2);
	

}
