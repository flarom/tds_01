class Atv2{
    public static void main(String[] args){
        String palavra = "";
        String separador = "";

        for (int i = 0; i < args.length; i++){
            palavra =(args[i] + separador) + palavra;
            separador = "-";
        }

        System.out.println(palavra);
    }
}
