package facil;

import java.util.*;
import java.util.Arrays;

public class LeetCode2 {
    /*
    Remova todas as ocorrências de um valor val in-place e retorne o novo tamanho do array.
    nums = [3,2,2,3], val = 3 → tamanho = 2
     */

    public static void main(String[] args) {


        int[] nums = {3, 2, 2, 3};
        int val = 3;

        //Se não pode ter valor repetido -> Set
        // NA VERDADE O PROBLEMA NÃO FALE DE VALORES REPETIDOS, E SIM DE UM VALOR

        int j = 0; // ponteiro de escrita

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }

        System.out.println("Novo tamanho: " + j);
    }


}
