// versão superior da Atv12
import java.util.Random;
import java.util.Arrays;

public class Atv12a{
    public static void main(String[] args) {
        int[] numeros = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        int passo = 0;

        Random rand = new Random();
        while (!taOrdenado(numeros)) {
            for (int i = 0; i < numeros.length; i++) {
                int proxRandom = rand.nextInt(numeros.length);
                int temp = numeros[proxRandom];
                numeros[proxRandom] = numeros[i];
                numeros[i] = temp;
            }
            passo++;
            System.out.println(passo +".\t"+Arrays.toString(numeros));
        }
    }
    public static boolean taOrdenado(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
