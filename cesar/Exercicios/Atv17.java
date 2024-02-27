// Crie um programa que substitua todas letras "a" por "@" e exiba as novas strings no terminal

public class Atv17 {
    public static void main(String[] args) {
        String palavra = "";

        for (int x = 0; x < args.length; x++) {
            palavra = args[x];
            for (int y = 0; y < palavra.length(); y++) {
                if (palavra.charAt(y) == 'a' || palavra.charAt(y) == 'A') {
                    palavra = palavra.substring(0, y) + "@" + palavra.substring(y + 1);
                    if(y > 0){
                        palavra = palavra + " ";
                    }
                }
            }
            System.out.print(palavra);
        }
        System.out.println();
    }
}
