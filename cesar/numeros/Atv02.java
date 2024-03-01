// Crie um programa para encontrar a média dos números informados.
public class Atv02{
    public static void main(String[] args) {
        float total = 0.0f;
        for(int i = 0; i < args.length; i++){
            total += Float.parseFloat(args[i]);
        }
        total /= args.length;
        System.out.println(total);
    }
}
