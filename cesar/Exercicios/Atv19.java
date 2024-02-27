// Escreva um programa que exiba quais, e quantas vezes, uma letra está repitida numa string

public class Atv19 {
    public static void main(String[] args) {
        String entrada = args[0].toUpperCase();
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            int contagem = 0;
            for (int i = 0; i < entrada.length(); i++) {
                if (entrada.charAt(i) == letra) {
                    contagem++;
                }
            }
            if (contagem > 0) {
                System.out.println("\u001B[35m'" + letra + "'\u001B[0m " + contagem + " vezes");
            }
        }
    }
}
