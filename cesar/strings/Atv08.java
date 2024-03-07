// Leia uma frase e converta para "snake_case"

public class Atv08{
    public static void main(String[] args) {
        String palavra = "";

        for(int i = 0; i < args.length; i++){
            palavra += args[i].toLowerCase();
            if(i < args.length -1){
                palavra += "_";
            }
        }
        System.out.println(palavra);
    }
}
