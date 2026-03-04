package facil;

public class LeetCode3 {
    /*
    Dado um array de inteiros, encontre a maior soma possível de um subarray contínuo.
     */

    public static void main(String[] args) {
        int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
        int somaAtual = nums[0];
        int melhorSoma = nums[0];

        for (int i = 1; i < nums.length; i++) {
            somaAtual = Math.max(nums[i], somaAtual + nums[i]);
            melhorSoma = Math.max(melhorSoma, somaAtual);
        }

        System.out.println(melhorSoma);

    }
}
