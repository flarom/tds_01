//  ler uma palavra e escreva-a ao contrario

public class Atv04{
    public static void main(String[] args) {
        String palavra = "";
        String palavraContrario = "";

        for(int i = args.length -1; i > -1; i--){
            palavra = args[i];

            for(int pos = palavra.length() -1; pos > -1; pos--){
                palavraContrario += palavra.charAt(pos);
            }

            if(i > 0){
                palavraContrario += " ";
            }
        }

        System.out.println(palavraContrario);
    }
}
