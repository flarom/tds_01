// Ler n strings e exiba quais são palíndromes

public class Atv18 {
    public static void main(String[] args) {
        for (int x = 0; x < args.length; x++) {
            String palavraAtual = args[x];
            String inverter = "";

            for (int y = palavraAtual.length() - 1; y >= 0; y--) {
                inverter += palavraAtual.charAt(y);
            }

            if (palavraAtual.equals(inverter)) {
                System.out.println("\u001B[32m'" + palavraAtual + "'\té um palíndromo.");
            } else {
                System.out.println("\u001B[31m'" + palavraAtual + "'\tnão é um palíndromo.");
            }
        }
    }
}
