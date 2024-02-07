import java.util.Scanner;
import java.util.Random;

class PosicaoAleatoria{
    public static void main(String[] args){
        String v1;
        Scanner scr = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Entre o valor: ");
        v1 = scr.next();
        
        System.out.println(v1.charAt(rnd.nextInt(v1.length() -1 )));
        scr.close();
    }
}