// Crie um programa para verificar se os números informados são primo ou não.
public class Atv06{
    public static void main(String[] args) {
        int x = 0;
        for(int i = 0; i < args.length; i++){
            int numero = Integer.parseInt(args[i]);
            
            if (isPrimo(numero)) {
                System.out.print(numero + "\té primo\n");
            } else {
                System.out.print(numero + "\tnão é primo\n");
            }
        }
        System.out.println();
    }
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
