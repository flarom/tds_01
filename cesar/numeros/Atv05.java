// Escreva um programa para calcular o fatorial dos números digitados.
public class Atv05{
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            long fact = 1;
            for (int j = 2; j <= Integer.parseInt(args[i]); j++) {
                fact = fact * j;
            }
            System.out.print(fact + "\n");
        }
        System.out.println();
    }
}
