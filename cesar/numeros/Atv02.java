// Crie um programa para encontrar a média dos números informados.
public class Atv02{
    public static void main(String[] args) {
        int total = 0;
        for(int i = 0; i < args.length; i++){
            total += Integer.parseInt(args[i]);
        }
        total /= args.length;
        System.out.println(total);
    }
}
