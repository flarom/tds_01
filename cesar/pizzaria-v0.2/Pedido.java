public class Pedido{
    private ItemDoPedido itemDoPedido;
    private String cliente = "";
    private double txEntrega = 0.0;
    
    public void addItemDoPedido(ItemDoPedido item){
        this.itemDoPedido = item;
    }
    public void setCliente(String cliente){
        this.cliente = cliente.substring(0 ,1).toUpperCase() + 
        cliente.substring(1).toLowerCase();
    }
    public void setTxEntrega(Double txEntrega){
        this.txEntrega = txEntrega;
    }
    public double getTotal(){
        return this.txEntrega + this.itemDoPedido.getValor();
    }
    public void imprimir(){
        System.out.println("________________________________________\n");
        System.out.println(" - - - - - Pizzaria Bate-Papo - - - - - ");
        System.out.println("________________________________________\n");
        System.out.println("Cliente:\t" + this.cliente);
        System.out.println("________________________________________\n");
        System.out.println("Setor:\t\taqui");
        System.out.println("________________________________________\n");
        System.out.println("Sabor da pizza:\t"+ this.itemDoPedido.getSabor());
        System.out.println("Valor:\t\tR$"+ String.valueOf(this.itemDoPedido.getValor()));
        System.out.println("Tx. Entrega:\tR$"+ String.valueOf(this.txEntrega));
        System.out.println("Total:\t\tR$"+ String.valueOf(this.getTotal()));
        System.out.println("________________________________________\n");
    }
}
