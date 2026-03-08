package facil;

import java.util.HashMap;
import java.util.Map;

public class ArrayLeetCode1 {
    /*
    Dado um array de inteiros nums e um inteiro target, retorne os índices de dois números que somam target.

Exemplo:
nums = [2,7,11,15], target = 9 → [0,1]
     */

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        //int sum = nums[0] + nums[1];
        //se soma de dois números pertences  for (int i = 0; i < nums.length; i++){
        ////            for (int j = i + 1; j < nums.length; j++){
        ////                if (nums[i] + nums[j] == target){
        ////                    System.out.println(i+j);
        ////                    return;
        ////                }
        ////            }
        ////        }ao array for igual a target retorna true
        //para verificar todas as combinações de pares você precisa de dois loops
        //para cada elemento compara com o próximo
//

        //HASHMAP
        //pares de chave-valor -> se eu tenho um número, qual seu complemento para target??

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int complemento = target - nums[i];
            if (map.containsKey(complemento)) {
                System.out.println("Índices: " + map.get(complemento) + " e " + i);
                System.out.println("Números: " + nums[map.get(complemento)] + " e " + nums[i]);



                return;
            }
        map.put(nums[i], i);//guarda um par chave valor dentro do Map associando o valor a sua chave

        }


    }
}
