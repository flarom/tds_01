// ler n string e imprima-os de trás-para-frente:
// "Boa noite turma" -> "amrut etion aoB"

public class Atv15{
    public static void main(String[] args){
        String fraseInvertida = "";
        for(int x = args.length -1; x >= 0; x--){
            String inverter = "";
            for(int y = 0; y < args[x].length(); y++){
                inverter = args[x].charAt(y) + inverter;
            }
            fraseInvertida = fraseInvertida + inverter;
            if(x > 0){
                fraseInvertida = fraseInvertida + " ";
            }
        }
        System.out.println(fraseInvertida);
    }
}
