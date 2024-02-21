// Crie um programa para verificar se os números são palíndromos ou não.
public class Atv10 {
    public static void main(String[] args) {
        for (int x = 0; x < args.length; x++) {
            String numero = args[x];
            String invertido = "";

            for (int y = numero.length() - 1; y >= 0; y--) {
                invertido += numero.charAt(y);
            }

            if (numero.equals(invertido)) {
                System.out.println(numero + "\té um número palíndromo.");
            } else {
                System.out.println(numero + "\tnão é um número palíndromo.");
            }
        }
    }
}
