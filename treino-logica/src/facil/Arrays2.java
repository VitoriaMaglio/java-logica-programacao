package facil;

import java.util.HashSet;
import java.util.Set;

public class Arrays2 {

    /*
    Dado um array de números, imprima todos os elementos usando um loop.

    Conte quantas vezes um número aparece no array.


    !!!!!!!!!!!!!!!!!!!!!!!Encontre o primeiro número duplicado em um array. -> USAR SET POIS ELE NÃO ACEITA DUPLICADOS
     */

    public static void main(String[] args) {
        int[] numeros = {2,3,5,6,7,5,3,3};
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
//        int number = 5;
//        int resul = 0;
//        for (int i = 0; i < numeros.length;i++){
//            System.out.println(i);
//        }
//
//
//
//
//
//        for (int i = 0; i < numeros.length; i++){
//            if (numeros[i] == number){
//                resul ++;
//            }
//        }
//        System.out.println(resul);
//
//        HashSet<Integer> vistos = new HashSet<>();
//        for(int num : numeros){
//            if (vistos.contains(num)){
//                System.out.println("Primeiro duplicado " + num);
//                return;
//            }
//            vistos.add(num);
//        }
//
//




    }
}
