package facil;

import java.util.Scanner;

public class Exerteste {
    /*
    Declare um array de strings com os nomes de três cores diferentes.
     */

    String [] nomes = {"Vitória", "Débora","Felipe" };

    public static void main(String[] args) {
        String[] nomes =  new String[3];
        nomes[0] = "Vitória";
        nomes[1] = "Débora";
        nomes[2] = "Felipe";


    /*
    Utilize um loop for para imprimir os números de 1 a 5.
     */

        for (int i = 0; i <= 5; i++){
            System.out.println(i);
        }



        /*
        Escreva um trecho de código que solicite ao usuário que insira um número inteiro e o imprima na
        tela.
         */

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Digite um número inteiro: ");
                int num = scanner.nextInt();
                System.out.println("Número digitado: " + num);
                break;
            } catch (Exception e) {
                System.out.println("Você digitou um número diferente de inteiro. Tente novamente!");
                scanner.next();

            }
        }




    }




}
