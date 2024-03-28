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
        System.out.println("________________________________________");
        System.out.println(" - - - - - Pizzaria Bate-Papo - - - - - ");
        System.out.println("________________________________________");
        System.out.println("Cliente:\t" + this.cliente);
        System.out.println("________________________________________");
        System.out.println("Setor:\t");
        System.out.println("________________________________________");
        System.out.println("Tipo da pizza:\t"+ this.itemDoPedido.getTipo());
        System.out.println("Sabor da pizza:\t"+ this.itemDoPedido.getSabor());
        System.out.println("Valor:\t\t"+ String.valueOf(this.itemDoPedido.getValor()));
        System.out.println("Tx. Entrega:\t"+ String.valueOf(this.txEntrega));
        System.out.println("Total:\t\t"+ String.valueOf(this.getTotal()));
        System.out.println("________________________________________");
    }
}
