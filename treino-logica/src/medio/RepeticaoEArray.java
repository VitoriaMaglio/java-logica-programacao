package medio;

public class RepeticaoEArray {

    //7 - Acertei
    //For
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        //Saída 1, 2, 3, 4, 5
        //Pq imprimi o 1 tbm? Por que o i começa no 1 e não tem nenhuma condição que proibe sua interação no loop

    //8 - Acertei
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
        //Saída 5, 4, 3,2,1
        //For decrescente pois a cada iteração o i diminui menos um.

    //9 - Errei
    //While -> executa até q a condição true seja false
        int i = 0;

        while (i < 5) {
            System.out.print(i + " ");
            i += 2;
        }
        //Saída -> 0, 2, 4, 6 ai sai do loop pois i tem q ser menor que 6 porém tem que imprimir um número maior para quebrar o loop
        //Loop roda tres vezes

        //10 - Acertei
        int x = 0;

        while (x < 3) {
            System.out.println(x);
        }
        //Loop é infinito pois não existe nehuma condição que faça o while terminar

        //11 - Acertei
        //Array simples
        int[] valores = {1, 3, 5, 7};

        System.out.println(valores[2]); //5, indíce começa no zero

        //12 - Acertei
        int[] numeros = {2, 4, 6};

        for (int a = 0; a < numeros.length; a++) {
            System.out.print(numeros[a] + " ");
        }
        //Saída 2,4,6 percorre o array

        //13 - Acertei
        int[] v = new int[3];
        v[0] = 10;
        v[1] = 20;
        v[2] = 30;
        v[3] = 40;
        //Compila sim
        //Executa Não
        //Erro Três posições declaradas no vetor, porém adiciona 4 índices, sendo que o indíce começa no zero


    }
}
