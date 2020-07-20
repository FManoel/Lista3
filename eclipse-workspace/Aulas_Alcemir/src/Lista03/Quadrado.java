package Lista03;
/*
 * 03. Escreva uma classe Quadrado com atributo lado do tipo double. A classe deve ter um
construtor que recebe como par�metro o lado do quadrado. Deve tamb�m ter os
m�todos area() e perimetro() que retornam respectivamente a �rea e o per�metro do
quadrado, cujas f�rmulas s�o as seguintes:
a. area = lado2
b. perimetro = 4 x lado
 */
public class Quadrado 
{
 public double lado;
 
 public double area()
 {
	 return (lado*lado);
 }
 
public double perimetro()
 {
	 return (4 * lado);
 }
 
 
 public Quadrado (double lado)
 {
	 this.lado = lado;
 }
}

