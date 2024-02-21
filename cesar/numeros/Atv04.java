// Crie um programa para encontrar o maior número entre os números dados
public class Atv04{
    public static void main(String[] args) {
        int maior = 0;
        for(int i = 0; i < args.length; i++){
            if(Integer.parseInt(args[i]) > maior){
                maior = Integer.parseInt(args[i]);
            }
        }
        System.out.println("Maior número: "+maior);
    }
}
