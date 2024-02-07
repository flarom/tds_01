import java.util.Random;

class PosicaoAleatoria{
    public static void main(String[] args){
        Random rnd = new Random();
        String x = args[0];

        System.out.println(x.charAt(rnd.nextInt(x.length() -1 )));
    }
}
