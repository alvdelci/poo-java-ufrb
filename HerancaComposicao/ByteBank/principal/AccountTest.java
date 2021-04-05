package HerancaComposicao.ByteBank.principal;
//Entrada e saída de números de ponto flutuante com  objetos Account;
import java.util.*;
import HerancaComposicao.ByteBank.banco.Account;

public class AccountTest{
	//Método main inicia a execução do aplicativo java;
	public static void main(String[] args) {
		Account account1 = new Account(50.00); //Cria objeto Account
		Account account2 = new Account(-7.53); //Cria objeto Account
		//Exibe o saldo de cada objeto;
		System.out.printf("account1 balance: $%.2f \n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f \n", account2.getBalance());
		
		//Cria Scanner para obter entrada a partir da janela de comando;
		Scanner input = new Scanner(System.in);
		double depositAmount; // quantia de depósito lida a partir do usuário
		
		//Depósito na account1
		System.out.print("Enter deposit amount for account1: ");
		depositAmount = input.nextDouble(); //Entrada do usuário;
		System.out.printf("\nadding %.2f to account1 balance \n\n", depositAmount);
		account1.credit(depositAmount); //Adiciona saldo de account1;

		//Exibe saldos
		System.out.printf("account1 balance: $%.2f \n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f \n", account2.getBalance());
		
		//Depósito na account2
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble(); //Entrada do usuário;
		System.out.printf("\nadding %.2f to account2 balance \n\n", depositAmount);
		account2.credit(depositAmount); //Adiciona saldo de account2;
		
		//Exibe saldos
		System.out.printf("account1 balance: $%.2f \n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f \n", account2.getBalance());

		double withdrawAmount;
		//Saque na account1
		System.out.print("Enter amount withdraw for account1: ");
		withdrawAmount = input.nextDouble();
		account1.withdraw(withdrawAmount);

		//Saque na account2
		System.out.print("Enter amount withdraw for account2: ");
		withdrawAmount = input.nextDouble();
		account2.withdraw(withdrawAmount);

		input.close();
		//Exibe saldos
		System.out.print("Final balance: ");
		System.out.printf("\n\naccount1 balance: $%.2f \n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f \n", account2.getBalance());

	}//main
}//Classe Account