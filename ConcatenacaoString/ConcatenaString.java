package ConcatenacaoString;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConcatenaString {
    /**
     * Concatena e imprime nome e sobrenome
     * @param nome
     * @param sobrenome
     */
    public static void imprimeNomeSobrenome(String nome, String sobrenome) {
        System.out.println(nome + " " + sobrenome);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Permite entrada de dados
        boolean inLoop = true; //Condição para o laco de repeticao
        String nome = "", sobrenome = ""; //Variaveis de instancia

        //Loop
        do {
            try {
                //Solicita nome
                System.out.print("Insira nome: ");
                nome = input.next("[a-zA-Z]+");

                //Solicita sobrenome
                System.out.print("Insira sobrenome: ");
                sobrenome = input.next("[a-zA-Z]+");
                
                //Chama o metodo para imprimir as Strings concatendas
                imprimeNomeSobrenome(nome, sobrenome);

                //Condicao para sair do laço de repeticao
                inLoop = false;

            } catch (InputMismatchException inputMismatchException) {
                /**
                 * trata excecao, volta ao primeiro input se algum caractere nao alfabetico for digitado
                 */
                System.err.printf("Insira apenas caracteres alfabéticos!\n");
                input.nextLine();
            } //end Catch

        } while (inLoop); //end Loop

        //Fecha Scanner
        input.close();
    } //end Main method
}