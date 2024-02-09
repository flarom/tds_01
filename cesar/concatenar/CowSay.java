class CowSay{
    public static void main(String[] args){
        String wrd = "";
        String supline = "";
        String subline = "";
        String cow = 
        "           __n__n__    \n"+
        "    .------`-\\00/-'   \n"+
        "   /  ##  ## (oo)      \n"+
        "  / \\## __   ./       \n"+
        "     |//YY \\|/        \n"+
        "     |||   |||         \n";
        for(String argument : args){
            wrd = wrd + argument.toString() + " ";
        }
        for(int i = 0; i < wrd.length(); i++){
            supline = supline + "_";
            subline = subline + "-";
        }

        System.out.println(supline + "\n|" +wrd.toString() + "\b|\n" + subline + "\n" + cow);
    }
}