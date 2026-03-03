package dificil;

public class Logica {
    //14 - Acertei
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 4; i++) {
            soma += i;
        }

        System.out.println(soma);
        /**
         * 1 = 1
         * 2 = 3
         * 3 = 6
         * 4 = 10
         * soma = 10
         */

    //15 - Acertei
        int count = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);
        /**
         * 1
         * 2 count 1
         * 3
         * 4 count 2
         * 5
         * 6 count 3
         * 7
         * 8 count 4
         * 9
         * 10 count 5
         * count = 5
         *
         * O código conta a quantidade de números menores e iguais a 10 que possuem o módulo da divisão por 2 igual a zero, números pares
         *
         */
        //16 - Acertei
        int x = 10;

        if (x > 5)
            System.out.println("Maior que 5");
        System.out.println("Fim");
        //Linhas impressas 2
        //\n, erro lógico

        //17 - Acertei
        int a = 0;

        for (int i = 0; i < 3; i++) {
            a += i;
        }

        System.out.println(a);
        /**
         * 1 ; a = 0+ 1 = 1
         * 2 ; a = 1+2 = 3
         * a  = 3
         */

        //18 - Acertei
        int w = 3;
        int y = 2;

        if (w > y && y++ < 2) {
            System.out.println("A");
        }

        System.out.println(y);
        //Impresso && AND 3 > 2 e 3 < 2 -> false
        // Impresso Y = 3
        //Muda pois é interado mais um em seu valor

        //19 - Acertei
        int total = 0;

        for (int i = 0; i <= 5; i++) {
            if (i % 3 == 0) {
                total += i;
            }
        }

        System.out.println(total);
        /**
         * 0
         * 1
         * 2
         * 3 total = 0+3 = 3
         * 4
         * 5
         * total = 3
         * Números que entram é apenas o três
         */

        //20 - Acertei
        int n = 5;
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        System.out.println(f);
        //Código calcula fatorial de 5
        //
        /**
         * 1 f = 1
         * 2 f = 2
         * 3 f =  6
         * 4 f =  24
         * 5 f =  120
         */

        int i = 5;

        while (i > 0) {
            System.out.println(i);
        }//Loop infinito

        /**
         *  int r = 10;
         *
         *         if (r = 5) {
         *             System.out.println("Teste");
         *         }
         *         Você está atribuindo um novo valor para a variável, sendo que if só aceita boolean
         *         Mudando o valor de r para 5 -> Não compila
         */

        //Para funcionar a comparação de dois objetos com .equals é preciso sobrescrever .equals da classe Object?

//        Pessoa p1 = new Pessoa();
//        Pessoa p2 = p1;
//
//        System.out.println(p1 == p2);
        //Imprime true pois tem a mesma referência do mesmo objeto


    }
}
