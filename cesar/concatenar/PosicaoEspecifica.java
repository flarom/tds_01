class PosicaoEspecifica{
    public static void main(String[] args){
        Integer pos = Integer.parseInt(args[0]);
        String x = args[1];
        System.out.println(x.charAt(pos -1));
    }
}
