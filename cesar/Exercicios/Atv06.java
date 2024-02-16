// Ler uma string e converta todos os caracteres para minúsculo.

public class Atv06{
    public static void main(String[] args) {
        String palavras = "";

        for(int pos = 0; pos < args.length; pos++){
            palavras += args[pos].toLowerCase();
            if(pos < args.length){
                palavras += " ";
            }
        }

        System.out.println(palavras);
    }
}
