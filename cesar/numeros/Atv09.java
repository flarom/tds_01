// Escreva um programa para inverter um número dado.
public class Atv09 {
    public static void main(String[] args) {
        String numero = args[0];
        String invertido = "";
        for (int y = numero.length() - 1; y >= 0; y--) {
            invertido += numero.charAt(y);
        }
        System.out.println(Integer.parseInt(invertido));
    }
}
