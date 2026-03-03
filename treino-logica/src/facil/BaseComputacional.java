package facil;

public class BaseComputacional {
    //1 - Acertei
    //Operadores
    static int a = 8;
    static int b = 3;

//    public static void main(String[] args) {
//        System.out.println(a/b);//2
//        System.out.println(a % b);//2
//    }
    /**
     * O resultado da divisão indica o quociente e o módulo da divisão indica o resto da divisão
     */

    //2- Acertei
    //Ordem de precedência
    static int resultado = 10 + 2 * 3;

//    public static void main(String[] args) {
//        System.out.println(resultado);//16
//    }
    //3 -
    //Boolean
    static int x = 5;

//    public static void main(String[] args) {
//        System.out.println(x > 3 && x < 10);//true E as duas condições precisam ser verdadeiras
//        System.out.println(x > 3 || x < 4);//true OU só uma condição precisa ser verdadeira
//        System.out.println(!(x == 5)); //false ! inverte o valor booleano
//
//    }
    /**
     * boolean a = true;
     * boolean b = false;
     * boolean c = true;
     * a && b -> false
     * a || b -> true
     * !a -> false
     * a && c -> true
     * a && (b||c) -> true
     *
     * REGRAS && and : só é true se todo mundo for true
     *  true && true  = true
     *  true && false → false
     *  false && true → false
     *  false && false → false
     *
     *  REGRAS || or : é true se pelo menos um for true
     *  true || true → true
     *  true || false → true
     *  false || true → true
     *  false || false → false
     *
     *  REGRAS Curto-circuito -> java para de avaliar uma expressão lógica porque já sabe o resultado final.
     *  and && se o primeiro for false o resto não é avaliado
     *  or || se o primeiro for true o resto não é avaliado
     *
     *  = atribui
     *  ==compara
     */

    //4 - Acertei
    //decisão simples
    static int idade = 15;

    public static void main(String[] args) {
        //Método main é static, ou seja, pertence a classe e não a instância de um objeto
        //ele não poe referencia/acessar algo que não é static
        if (idade >= 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Menor");
        }
        //Saída Menor

        //5 - Acertei
        int nota = 7;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        //Saída Aprovado
        //Não poderia imprimir mais de uma mensagem, pois não existe uma condição dupla que a variável se encaixa, apenas um bloco executa

        //6 - Acertei
        int numero = 10;

        //if (numero = 5) {
           // System.out.println("Igual a 5");
       // }

        // Código não compila, o erro é o uso de = pois isso é atribuição, não comparação.
        //If espera um boolean



    }



}
