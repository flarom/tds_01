// Ler uma frase e calcular quantas vogais possui

public class Atv13{
    public static void main(String[] args) {
        String palavra = "";
        int vogais = 0;

        for(int x = 0; x < args.length; x++){
            palavra = args[x].toLowerCase();
            
            for (int y = 0; y < palavra.length(); y++) {
                if(temVogal(palavra.charAt(y))){
                    vogais++;
                }
            }
        }

        System.out.println(vogais);
    }
    private static boolean temVogal(char letra) {
        return "aeiouAEIOU".indexOf(letra) != -1;
    }
}

