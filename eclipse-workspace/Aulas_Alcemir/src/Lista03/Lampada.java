package Lista03;
/*
 * 01. Uma classe Lampada com atributo ligada (tipo boolean) e métodos liga() e desliga()
que nada retornam. O método liga torna o atributo ligada true e o método desliga torna
o atributo ligada false. Crie também o método observa() que retorna a String “ligada”
se a lâmpada estiver ligada e “desligada” se a lâmpada estiver desligada.
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
