package Lista03;
/*
 * 08. Implemente uma classe Java que represente uma conta Conta Bancária, digamos Conta,
que carrega as características de uma conta real e tudo o que ela faz. Ela deve ter o nome
do titular (String), o número (int), a agência (String), o saldo (double) e uma data de
abertura (String). Além disso, ela deve fazer as seguintes ações: saca, para retirar um valor
do saldo; deposita, para adicionar um valor ao saldo; calculaRendimento, para devolver o
rendimento mensal dessa conta. Teste-a, usando uma outra classe que tenha o main. A
classe Conta deve conter pelo menos os seguintes métodos:
a. saca que recebe um valor como parâmetro e retira esse valor do saldo da conta
b. deposita que recebe um valor como parâmetro e adiciona esse valor ao saldo da conta
c. calculaRendimento que não recebe parâmetro algum e devolve o valor do saldo
multiplicado por 0.1

09. Crie um método recuperaDadosParaImpressao(), que não recebe parâmetro mas
devolve o texto com todas as informações da nossa conta para efetuarmos a impressão.
Dessa maneira, você não precisa ficar copiando e colando um monte de
System.out.println() para cada mudança e teste que fizer com cada um de seus
funcionários, você simplesmente vai fazer:
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
