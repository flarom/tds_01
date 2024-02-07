class Atv1{
    public static void main(String[] args){
        String wrd = "";
        for(String argument : args){
            wrd = wrd + argument.toString() + "-";
        }
        System.out.println(wrd.toString());
    }
}