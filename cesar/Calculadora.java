import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = 0;
        double y = 0;
        String operador = "";

        while(true){
            System.out.println("Digite o numero 1:");
            x = scan.nextDouble();
            scan.nextLine();

            if(x == 0){
                break; // finalizar caso x for igual a 0
            }

            System.out.println("Digite um operador (+ - / *):");
            operador = scan.nextLine();

            System.out.println("Digite o numero 2:");
            y = scan.nextDouble();
            scan.nextLine();

            switch (operador) {
                case "+":
                    System.out.println(x+y);        
                    break;
                
                case "-":
                    System.out.println(x-y);
                    break;

                case "/":
                    System.out.println(x/y);
                    break;

                case "*":
                    System.out.println(x*y);
                    break;
                default:
                    System.out.println("Operador invalido");
                    break;
            }
        }
        scan.close();
    }
}
