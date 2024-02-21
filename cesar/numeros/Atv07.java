// Escreva um programa para calcular a raiz quadrada dos números dados

public class Atv07{
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            Double x =  Math.sqrt(Integer.parseInt(args[i]));
            System.out.print("√" + Integer.parseInt(args[i]) + " = " + x + "\n");
        }
        System.out.println();
    }
}