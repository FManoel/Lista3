package Lista03;
/*
 * 03. Escreva uma classe Quadrado com atributo lado do tipo double. A classe deve ter um
construtor que recebe como parâmetro o lado do quadrado. Deve também ter os
métodos area() e perimetro() que retornam respectivamente a área e o perímetro do
quadrado, cujas fórmulas são as seguintes:
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

