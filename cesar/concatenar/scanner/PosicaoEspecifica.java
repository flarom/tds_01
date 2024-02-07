import java.util.Scanner;

class PosicaoEspecifica{
    public static void main(String[] args){
        String v1;
        int pos;
        Scanner scr = new Scanner(System.in);

        System.out.println("Entre o valor: ");
        v1 = scr.next();
        System.out.println("Entre a posição: ");
        pos = scr.nextInt();

        System.out.println(v1.charAt(pos -1));
        scr.close();
    }
}