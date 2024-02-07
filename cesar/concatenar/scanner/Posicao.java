import java.util.Scanner;

class Posicao{
    public static void main(String[] args){
        String v1;
        Scanner scr = new Scanner(System.in);

        System.out.println("Entre o valor: ");
        v1 = scr.next();

        System.out.println(v1.charAt(2));
        scr.close();
    }
}