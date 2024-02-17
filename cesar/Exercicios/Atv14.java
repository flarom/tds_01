// ler uma frase e imprima-a sem as vogais.

public class Atv14{
    public static void main(String[] args) {
        StringBuilder palavraSemVogal = new StringBuilder();

        for(int x = 0; x < args.length; x++){
            String palavra = args[x];

            for (int y = 0; y < palavra.length(); y++) {
                char letra = palavra.charAt(y);
                
                if (!temVogal(letra)) {
                    palavraSemVogal.append(letra);
                }
            }

            if(x < args.length -1){
                palavraSemVogal.append(" ");
            }
        }

        System.out.println(palavraSemVogal);
    }
    private static boolean temVogal(char letra) {
        return "aeiouAEIOU".indexOf(letra) != -1;
    }
}
