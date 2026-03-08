package facil;

public class Arrays2 {

    /*
    Dado um array de números, imprima todos os elementos usando um loop.

    Conte quantas vezes um número aparece no array.


    !!!!!!!!!!!!!!!!!!!!!!!Encontre o primeiro número duplicado em um array. -> USAR SET POIS ELE NÃO ACEITA DUPLICADOS
     */

    public static void main(String[] args) {
//        int[] numeros = {2,3,5,6,7,5,3,3};
//        for (int i = 0; i < numeros.length; i++){
//            System.out.println(numeros[i]);
//        }
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

        //inverter um array de numeros

        int[] arr = {1,2,3,4,5};

        int inicio = 0;
        int fim = arr.length - 1;//indice começa no zero que difere da quantidade de elementos(arr.length)

        while(inicio < fim){

            int temp = arr[inicio];//guarga o valor temporariamente
            arr[inicio] = arr[fim];
            arr[fim] = temp;

            inicio++;//mover os ponteiros esquerda->direita
            fim--;//direita->esquerda
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }}
    }


