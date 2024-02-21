// Escreva um programa para verificar se os números são pares ou ímpares
public class Atv03{
    public static void main(String[] args) {
        for(int i =0; i < args.length; i++){
            if((Integer.parseInt(args[i])& 1) == 0){
                System.out.print(Integer.parseInt(args[i]) + "\tPAR\n");
            } else {
                System.out.print(Integer.parseInt(args[i]) + "\tIMPAR\n");
            }
        }
        System.out.println();
    }
}
