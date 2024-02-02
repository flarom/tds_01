import java.util.Scanner;

class Inverter{
    public static void main(String[] args){
        String n1, n2;

        Scanner scr = new Scanner(System.in);
        System.out.println("Entre o nome 1: ");
        n1 = scr.next();
        System.out.println("Entre o nome 2:");
        n2 = scr.next();

        System.out.println(n2 + n1);
        scr.close();
    }
}