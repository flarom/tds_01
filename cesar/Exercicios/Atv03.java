// Ler uma frase e imprima-a de trás para frente.

public class Atv03{
    public static void main(String[] args){
        String palavra = "";

        for(int pos = args.length -1; pos > -1; pos--){
            palavra += args[pos];
            if(pos > 0){
                // separar cada palavra com espaço, exceto pela ultima palavra do input
                palavra += " ";
            }
        }

        System.out.println(palavra);
    }
}
