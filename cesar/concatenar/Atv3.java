class Atv3{
    public static void main(String[] args){
        String palavra = "";
        String separador = "";
        int pos = 0;

        while (args.length > pos){
            palavra +=(separador + args[pos]);
            separador = "-";
            pos++;
        }

        System.out.println(palavra);
    }
}
