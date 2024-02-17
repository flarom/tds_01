// Leia uma frase e converta para "pascalCase"

public class Atv11{
    public static void main(String[] args) {
        String palavra = "";

        for(int i = 0; i < args.length; i++){
            palavra += paraPascalCase(args[i]);
        }
        System.out.println(palavra);
    }

    public static String paraPascalCase(String palavra) {
        StringBuilder pascalCase = new StringBuilder();
        boolean proxPascalCase = true;

        for(char c : palavra.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                if(proxPascalCase){
                    pascalCase.append(Character.toUpperCase(c));
                    proxPascalCase = false;
                }
                else{
                    pascalCase.append(Character.toLowerCase(c));
                }
            }
            else{
                proxPascalCase = true;
            }
        }

        return pascalCase.toString();
    }
}
