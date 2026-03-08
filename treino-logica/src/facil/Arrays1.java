package facil;

import java.util.HashMap;
import java.util.Map;

public class Arrays1 {
    /*
    Crie um array com 5 números e imprima todos
     */

    public static void main(String[] args) {
        int[] numero = new int[5];
        numero[0] = 1;
        numero[1] = 3;
        numero[2] = 2;
        numero[3] = 4;
        numero[4] = 6;
        //System.out.println(numero); Isso imprime a referência do objeto na memória
        for (int i = 0; i < numero.length; i++){
            System.out.println(numero[i]);
        }
        for (int n : numero){
            System.out.println(n);
        }

        Map<String, Integer> nomesIdades = new HashMap<>();
        nomesIdades.put("VI",12);
        nomesIdades.put("Fe",77);
        nomesIdades.put("Re",45);
        for (Map.Entry<String,Integer> entry : nomesIdades.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }


//        int[] numbers = {1,2,3,4,5};
//        //System.out.println(numbers);Isso imprime a referência do objeto na memória
//        for (int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }
//    /*
//    Encontre o maior número do array
//     */
//    int maior = numbers[0];
//    for (int i = 1; i < numbers.length; i++){
//        if (numbers[i] > maior){
//            maior = numbers[i];
//        }
//    }
//        System.out.println(maior);
//
//
//    /*
//    Some todos os valores do Array
//     */
//        int soma = 0;
//        for (int i = 0; i < numbers.length; i++){
//            soma +=numbers[i];
//        }
//        System.out.println(soma);
//    /*
//    Conte quantos números são pares
//     */
//
//        int par = 0;
//        for (int i = 0; i < numbers.length; i++){
//            if (numbers[i] % 2 == 0){
//                par ++;
//            }
//        }
//        System.out.println(par);
//
//    /*
//    Inverta o array sem usar outro array
//     */
//        int i = 0;
//        int j = numbers.length - 1;//aponta para o último índice
//        while (i < j) {
//            int temp = numbers[i];//trocar de lado os valores
//            numbers[i] = numbers[j];
//            numbers[j] = temp;
//
//            i++;//avança direita
//            j--;//recua esquerda
//        }
//
//        // imprimir o array invertido
//        for (int n : numbers) {
//            System.out.print(n + " ");
//        }
}
//

}




