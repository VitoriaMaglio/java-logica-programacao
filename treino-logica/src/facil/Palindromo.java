package facil;

public class Palindromo {

    public static void main(String[] args) {


        String palavra = "radar";
        boolean ehPalindromo = true;

        int inicio = 0;
        int fim = palavra.length() - 1;

        while (inicio < fim) {

            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                ehPalindromo = false;
                break;
            }

            inicio++;
            fim--;
        }

        System.out.println(ehPalindromo);

    }
}