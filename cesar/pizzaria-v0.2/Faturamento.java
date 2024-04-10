public class Faturamento{
    private double totalGeral = 0;      
    private double totalEntregador = 0;     

    public void addTotalGeral(double valor){
        // soma de tudo
        this.totalGeral += valor;
    }
    public void addTotalEntregador(double valor){
        // soma de todos os fretes
        this.totalEntregador += valor;
    }
    public double getTotalLiquido(){
        // subtração do geral com do entregador
        return totalGeral - totalEntregador;
    }
    public void imprimirRelatorio(){
        System.out.println("________________________________________");
        System.out.println("Total geral:\t" + this.totalGeral);
        System.out.println("Total entregador:\t" + this.totalEntregador);
        System.out.println("LIQUIDO:\t" + getTotalLiquido());
    }
}