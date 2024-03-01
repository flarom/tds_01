// Crie um programa para verificar se os números informados são primo ou não.
public class Atv06 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            int numero = Integer.parseInt(args[i]);
            boolean primo = false;

            for (int j = 2; j <= numero / 2; j++) {
                if (numero % j == 0) {
                    primo = true;
                    break;
                }
            }

            if (!primo) {
                System.out.print("\u001B[32m" + numero + " é primo\n");
            } else {
                System.out.print("\u001B[31m" + numero + " não é primo\n");
            }
        }
        System.out.println();
    }
}
