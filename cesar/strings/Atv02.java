// Leia n strings, imprima quantas letras tem a junção de todas elas

public class Atv02{
    public static void main(String[] args){
        String palavra = "";

        for(int pos = 0; pos < args.length; pos++){
            palavra += args[pos];
        }

        System.out.println(palavra.length());
    }
}
