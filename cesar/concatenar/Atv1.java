class Atv1{
    public static void main(String[] args){
        String palavra = "";
        String separador = "";

        for (int i = 0; i < args.length; i++){
            palavra +=(separador + args[i]);
            separador = "-";
        }

        System.out.println(palavra);
    }
}
