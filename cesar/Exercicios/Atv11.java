// Leia uma frase e converta para "PascalCase"

public class Atv11{
    public static void main(String[] args) {
        String pascalCase = "";
        for(int i = 0; i < args.length; i++){
            pascalCase = args[i].substring(0,1).toUpperCase() + args[i].substring(1);
            System.out.print(pascalCase);
        }
        System.out.println();
    }
}
