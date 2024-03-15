// Escreva uma calculadora orientada a objeto com 4 operações usando os valores de args, sem usar static

public class Atv14 {
    public static void main(String[] args) {
            Double x = Double.parseDouble(args[0]);
            Double y = Double.parseDouble(args[2]);
            
            Double res = 0.0;
            calcular calc = new calcular(x, y);
            
            switch (args[1]) {
                case "+":
                    res = calc.somar(x,y);
                    break;
                case "-":
                    res = calc.subtrair(x,y);
                    break;
                case "x":
                    res = calc.multiplicar(x,y);
                    break;
                case "/":
                    if (y != 0) {
                        res = calc.dividir(x,y);
                    }
                    else {
                        System.out.println("Não é possível dividir por zero!");
                    }
                    break;
                case "^":
                    res = calc.potenciar(x,y);
                    break;
                case "§":
                    res = calc.raiz(x);
                    break;
                case "!":
                    break;
                default:
                    System.out.println("Operador invalido!");
                    break;
            }

            System.out.println(res);
    }
}

class calcular {
    private Double x = 0.0;
    private Double y = 0.0;

    // metodo construtor de calcular
    calcular(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double somar(double x, double y) {
        return (this.x + this.y);
    }

    public double subtrair(double x, double y) {
        return (this.x - this.y);
    }

    public double multiplicar(double x, double y) {
        return (this.x * this.y);
    }

    public double dividir(double x, double y) {
        return (this.x / this.y);
    }

    public double potenciar(double x, double y) {
        return (Math.pow(x, y));
    }

    public double raiz(double x) {
        return (Math.sqrt(x));
    }
    public double fatorial(double x){
        return (Math.fatorial(x));
    }
}
