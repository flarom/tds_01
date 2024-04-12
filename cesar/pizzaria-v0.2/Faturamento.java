import java.util.ArrayList;

public class Faturamento{
    private ArrayList <ItemDoPedido> pedidos = new ArrayList<ItemDoPedido>();
    private double totalGeral = 0;      
    private double totalEntregador = 0;
    private int pizzasVendidas = 0;
    private int pedidosRealizados = 0;

    public void addPizzasVendidas(){
        this.pizzasVendidas++;
    }
    public void addPedidosRealizados(){
        this.pedidosRealizados++;
    }
    public void addItemDoPedido(ItemDoPedido item){
        this.pedidos.add(item);
    }
    public String getPedidos(){
        String out = "";
        for (ItemDoPedido item : pedidos) {
            out += item.getSabores() + "\n";
        }
        return out;
    }
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
        System.out.println("- - - - - - - -RELATORIO- - - - - - - - ");
        System.out.println("Total geral:\t\t" + this.totalGeral);
        System.out.println("Total entregador:\t" + this.totalEntregador);
        System.out.println("LIQUIDO:\t\t" + getTotalLiquido());
        System.out.println("________________________________________");
        System.out.println("VENDAS:\t\t\t" + this.pizzasVendidas);
        System.out.println("PEDIDOS REALIZADOS:\t" + this.pedidosRealizados);
        System.out.println("PEDIDOS:\n"+getPedidos());
        System.out.println("________________________________________");
    }
}