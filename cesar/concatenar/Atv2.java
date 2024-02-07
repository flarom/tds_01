class Atv2{
    public static void main(String[] args){
        String wrd = "";
        for(String argument : args){
            wrd = argument.toString()  + "-" + wrd;
        }
        System.out.println(wrd.toString());
    }
}