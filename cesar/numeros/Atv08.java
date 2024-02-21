// Crie um programa para gerar a série de Fibonacci até um número dado
public class Atv08{
    public static void main(String[] args) {
        for (int i = 0; i <= Integer.parseInt(args[0]); i++) {
            System.out.println(fibo(i));
        }
    }

    public static int fibo(int n) {
        if (n < 3) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
