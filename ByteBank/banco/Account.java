package ByteBank.banco;
//Classe Account com um construtor para validar e
//inicializar a variável de instância balance com um valor double;

public class Account {
	private double balance; //Variável de instancia que armazena o saldo;
	
	//construtor
	public Account(double initialBalance) {
		
		//Valida se initialBalance é maior que 0.0;
		//Se não, o saldo e inicializado com o valor padrão 0.0;
		if (initialBalance > 0.0) {
			balance = initialBalance;
		}
	} //Constructor Account

	//Retira um valor da conta
	public void withdraw(double valueWithdraw) {
		if(balance > valueWithdraw) {
			balance = balance - valueWithdraw; //Remove uma quantia do saldo;
			System.out.printf("$%.2f sacados. \nSaldo atual: $%.2f \n", valueWithdraw, balance);
		}
		else {
			System.out.print("\nWithdrawal amount exceeded account balance.\n\n");
		}
	} //Método Withdraw
	
	//Credita uma quantia à conta;
	public void credit(double amount) {
		balance = balance + amount; //Adiciona quantia ao saldo;
	} //Método credit
	
	//Retorna o saldo da conta;
	public double getBalance() {
		return balance;
	} //Método getBalance
	
}