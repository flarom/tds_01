// Ler uma string e imprimier as primeiras 3 letras

public class Atv12{
    public static void main(String[] args) {
        char x[] = args[0].toCharArray();
        String y = "";
        for(int i = 0; i < 3; i++){
            y += x[i];
        }
        System.out.println(y);
    }
}
