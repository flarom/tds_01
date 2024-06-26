public class Pedido{
    private ItemDoPedido itemDoPedido;
    private String cliente = "";
    private String local = "";
    
    public void setItemDoPedido(ItemDoPedido item){
        this.itemDoPedido = item;
    }
    public void setCliente(String cliente){
        this.cliente = cliente.substring(0 ,1).toUpperCase() + 
        cliente.substring(1).toLowerCase();
    }
    public void setLocal(String local){
        this.local = local;
    }
    public double calcFrete(){
        if(local.equalsIgnoreCase("centro")){
            return 10;
        }
        else if (local.equalsIgnoreCase("periferia")){
            return 15;
        }
        else{
            return 20;
        }
    }
    public double getTotal(){
        return calcFrete() + this.itemDoPedido.getValor();
    }
    public void imprimir(){
        System.out.println("________________________________________");
        System.out.println(" - - - - - Pizzaria Bate-Papo - - - - - ");
        System.out.println("________________________________________");
        System.out.println("Cliente:\t" + this.cliente);
        System.out.println("Localização:\t" + this.local);
        System.out.println("________________________________________");
        System.out.println("Setor:\t\taqui");
        System.out.println("________________________________________");
        System.out.println("Pizzas:\n"+ this.itemDoPedido.getSabores());
        System.out.println("Valor:\t\tR$"+ String.valueOf(this.itemDoPedido.getValor()));
        System.out.println("Tx. Entrega:\tR$"+ calcFrete());
        System.out.println("Total:\t\tR$"+ String.valueOf(this.getTotal()));
        System.out.println("________________________________________");
    }
}
