package Lista03;
/*
 * 01. Uma classe Lampada com atributo ligada (tipo boolean) e m�todos liga() e desliga()
que nada retornam. O m�todo liga torna o atributo ligada true e o m�todo desliga torna
o atributo ligada false. Crie tamb�m o m�todo observa() que retorna a String �ligada�
se a l�mpada estiver ligada e �desligada� se a l�mpada estiver desligada.
*/
public class Lampada 
{
 public boolean ligada;
  
  public void liga()
  {
	  this.ligada = true;
  }
public  void desliga()
  {
	  this.ligada = false;  
  }
  String observa()
  {
	  if(ligada == true)
	  {
		  return "ligada";
	  }
	  else
	  {
		  return "desligada";
	  }
  }
}
