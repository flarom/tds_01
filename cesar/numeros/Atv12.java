// Implemente um algoritmo para ordenar uma lista de números em ordem crescente.

public class Atv12 {
    public static void main(String[] args) {
        int qtdNumeros = args.length;

        int[] numeros = new int[qtdNumeros];
        for (int i = 0; i < qtdNumeros; i++) {
            numeros[i] = Integer.parseInt(args[i]);
        }

        for (int j = 0; j < qtdNumeros - 1; j++) {
            for (int k = 0; k < qtdNumeros - j - 1; k++) {
                if (numeros[k] > numeros[k + 1]) {
                    int temp = numeros[k];
                    numeros[k] = numeros[k + 1];
                    numeros[k + 1] = temp;
                }
            }

            System.out.print((j + 1) + ".\t"); // exibe o passo atual (opcional)
            for (int numero : numeros) {
                System.out.print(numero + " "); // exibe a posição atual dos numeros
            }
            System.out.println();
        }
    }
}
