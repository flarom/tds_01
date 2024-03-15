// Escreva uma calculadora com 4 operações usando os valores de args


public class Atv13 {
    public static void main(String[] args) {
        if (args.length == 3) {
            Double x = Double.parseDouble(args[0]);
            Double y = Double.parseDouble(args[2]);
            double res = 0;

            switch (args[1]) {
                case "+":
                    res = somar(x,y);
                    break;
                case "-":
                    res = subtrair(x,y);
                    break;
                case "x":
                    res = multiplicar(x,y);
                    break;
                case "/":
                    if (y != 0) {
                        res = dividir(x,y);
                    }
                    else {
                        System.out.println("Não é possível dividir por zero!");
                    }
                    break;
                default:
                    System.out.println("Operador invalido!");
                    break;
            }
            System.out.println(res);
        } else {
            System.out.println("Insira 3 argumentos!");
        }
    }

    public static double somar(double x, double y){
        return(x+y);
    }
    public static double subtrair(double x, double y){
        return(x-y);
    }
    public static double multiplicar(double x, double y){
        return(x*y);
    }
    public static double dividir(double x, double y){
        return(x/y);
    }
}
