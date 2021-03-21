package compareInt;

import java.util.*; //Importando biblioteca java.utils

class CompareNumbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Abrindo variável de entrada

        System.out.print("Informe um número: ");
        Integer number1 = input.nextInt();

        System.out.print("Informe outro número: ");
        Integer number2 = input.nextInt();

        if(number1 == number2) {
            System.out.print("Esses números são iguais!");
        } else if(number1 > number2){
            System.out.print(number1 + " é o maior!");
        } else {
            System.out.print(number2 + " é o maior!");
        }

        input.close(); //Fechando a variável de entrada
    }
}