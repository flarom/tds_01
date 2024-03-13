import java.util.ArrayList;
import java.util.List;

public class Pedido{
    private int id = 0;
    private double txEntrega = 0.0;
    private String cliente = "";
    private List<ItemDoPedido> itensDoPedido = new ArrayList();

    public void addItemDoPedido(ItemDoPedido item){
        this.itensDoPedido.add(item);
    }
    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    public void setTxEntrega(Double txEntrega){
        this.txEntrega = txEntrega;
    }
    public double getTotal(){
        double total = 0;
        for(int i = 0; i < this.itensDoPedido; i++){
            ItemDoPedido item = this.itensDoPedido.get(i);
            total += item.getValor();
        }
        return total;
    }
    public void imprimir(){
        System.out.println("Nome:\t" + this.cliente);
        System.out.println("Tx. Entrega:\t" + this.txEntrega);
        System.out.println("Total:\t");
    }
}
