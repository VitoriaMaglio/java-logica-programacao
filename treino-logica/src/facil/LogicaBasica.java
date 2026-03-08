package facil;

public class LogicaBasica {
    /*
    Escreva um programa que verifique se um número inteiro é par ou ímpar.

    Utilize um loop for para imprimir os números de 1 a 10.

    !!!!!!!!!!!!Crie um programa que some todos os números de um array.
    !!!!!!!!!!!!Dado um array de números, encontre o maior número.

     */


    public static void main(String[] args) {
//        int num = 2;
//        if (num % 2 == 0){
//            System.out.println("Número par.");
//        }else{
//            System.out.println("Número ímpar.");
//        }

//        for (int i = 1; i<=10;i++){
//            System.out.println(i);
//        }

        int[] array = {2,4,6,8};
        int soma = 0;
        //Declarar fora do loop a var, pq se não ela zera em toda iteração
        for (int i = 0; i< array.length; i++){
            soma += array[i];

        }
        System.out.println(soma);


        int maior = array[0];
        for (int i = 1 ; i < array.length; i ++){
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        System.out.println(maior);
    }
}
