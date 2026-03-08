package facil;

import java.util.HashSet;
import java.util.Set;

public class Strings {

    /*
    Conte quantas vogais existem em uma palavra

    Inverta uma string.

    Verifique se uma palavra é palímdromo
    Remover caracteres duplicados
     */
    public static void main(String[] args) {
        String palavra = "programming";
        int contador = 0;

        Set<Character> vogais = new HashSet<>();
        vogais.add('a');
        vogais.add('e');
        vogais.add('i');
        vogais.add('o');
        vogais.add('u');

        for (char c : palavra.toCharArray()) {
            if (vogais.contains(c)) {
                contador++;
            }
        }

        System.out.println(contador);

        Set<Character> vistos = new HashSet<>();
        String resultado = "";

        for (char c : palavra.toCharArray()) {

            if (!vistos.contains(c)) {
                vistos.add(c);
                resultado += c;
            }

        }

        System.out.println(resultado);


        String palav = "hello";



        char[] letras = palav.toCharArray();

        int inicio = 0;
        int fim = letras.length - 1;

        while (inicio < fim) {
            char temp = letras[inicio];
            letras[inicio] = letras[fim];
            letras[fim] = temp;

            inicio++;
            fim--;
        }


    }

}










