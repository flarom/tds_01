// Ler uma string e converta todos os caracteres para maiúsculo.

public class Atv05{
    public static void main(String[] args) {
        String palavras = "";

        for(int pos = 0; pos < args.length; pos++){
            palavras += args[pos].toUpperCase();
            if(pos < args.length -1){
                palavras += " ";
            }
        }

        System.out.println(palavras);
    }
}
