package Lista03;
/*
 * 08. Implemente uma classe Java que represente uma conta Conta Banc�ria, digamos Conta,
que carrega as caracter�sticas de uma conta real e tudo o que ela faz. Ela deve ter o nome
do titular (String), o n�mero (int), a ag�ncia (String), o saldo (double) e uma data de
abertura (String). Al�m disso, ela deve fazer as seguintes a��es: saca, para retirar um valor
do saldo; deposita, para adicionar um valor ao saldo; calculaRendimento, para devolver o
rendimento mensal dessa conta. Teste-a, usando uma outra classe que tenha o main. A
classe Conta deve conter pelo menos os seguintes m�todos:
a. saca que recebe um valor como par�metro e retira esse valor do saldo da conta
b. deposita que recebe um valor como par�metro e adiciona esse valor ao saldo da conta
c. calculaRendimento que n�o recebe par�metro algum e devolve o valor do saldo
multiplicado por 0.1

09. Crie um m�todo recuperaDadosParaImpressao(), que n�o recebe par�metro mas
devolve o texto com todas as informa��es da nossa conta para efetuarmos a impress�o.
Dessa maneira, voc� n�o precisa ficar copiando e colando um monte de
System.out.println() para cada mudan�a e teste que fizer com cada um de seus
funcion�rios, voc� simplesmente vai fazer:
Conta c1 = new Conta();
// brincadeiras com c1....
System.out.println(c1.recuperaDadosParaImpressao());
*/

public class ContaBancaria 
{
	 String nomeTitular = "Manoel",agencia = "12345",dataAbertura = "10/06/2000";
	 int numero = 40028922;
	 public double saldo;
public void sacar(int x)
{ 
	if(x > 0  && x <= this.saldo)
	{
		this.saldo -= x;
	}
	else
	{
		System.out.println("Impossivel sacar este valor!");
	}
}
public void depositar(int x)
{ 
	if(x > 0)
	{
		this.saldo += x;
	}
	else
	{
		System.out.println("Impossivel depositar este valor!");
	}
}
public double calculaRendimento()
{
	return (this.saldo * 0.1);
}
String recuperaDadosParaImpressao()
{
	return "Nome: " + this.nomeTitular + "\nAgencia: " + this.agencia+ "\nData de abertura: " + this.dataAbertura + "\nNumero da conta: " + this.numero + "\nSaldo: "+ this.saldo + "\nRendimento: "+ calculaRendimento();
}

}
