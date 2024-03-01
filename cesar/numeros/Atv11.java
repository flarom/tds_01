// Escreva um algoritmo que leia n temperaturas e converta-as de Celsius para Fahrenheit.

public class Atv11{
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            double cel = Double.parseDouble(args[i]);
            double fah = cel * 9 / 5 + 32; // F=C*9/5+32
            System.out.println(cel + "°C = " + fah + "°F");
        }
    }
}
