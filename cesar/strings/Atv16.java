// Ler n strings e printar as posições das vogais encontradas

public class Atv16{
    public static void main(String[] args) {
        String palavra = "";

        for(int x = 0; x < args.length; x++){
            palavra = args[x];
            
            for (int y = 0; y < palavra.length(); y++) {
                if(temVogal(palavra.charAt(y))){
                    System.out.println("'" + corHighlight + palavra.charAt(y) + corDefault+ "' na " + corHighlight + (y + 1) + "°" + corDefault + " letra da palavra \"" + corHighlight + palavra + corDefault+ "\".");
                }
            }
        }
    }
    private static boolean temVogal(char letra) {
        return "aeiouAEIOU".indexOf(letra) != -1;
    }

    // corzinhas
    public static final String corHighlight = "\u001B[35m";
    public static final String corDefault = "\u001B[0m";
}
