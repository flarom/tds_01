// Leia uma frase e converta para "Tile Case"

public class Atv07{
    public static void main(String[] args) {
        String palavra = "";

        for(int i = 0; i < args.length; i++){
            palavra += paraTitleCase(args[i]);
        }
        System.out.println(palavra);
    }

    public static String paraTitleCase(String palavra) {
        StringBuilder titleCase = new StringBuilder(palavra.length());
        boolean proxTitleCase = true;
    
        for (char c : palavra.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                proxTitleCase = true;
            } 
            else if (proxTitleCase) {
                c = Character.toTitleCase(c);
                proxTitleCase = false;
            }
    
            titleCase.append(c);
        }
    
        return titleCase.toString();
    }
}
