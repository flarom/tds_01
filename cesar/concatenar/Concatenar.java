import java.util.Arrays;

class Concatenar{
    public static void main(String[] args){
        System.out.println(Arrays.deepToString(args));
        
        String x = args[1];
        String y = args[2];
        System.out.println(x+y);
    }
}
