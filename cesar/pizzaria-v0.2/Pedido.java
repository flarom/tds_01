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
        System.out.println(alinhar("Cliente:", this.cliente));
        System.out.println("________________________________________");
        System.out.println("Setor:");
        System.out.println("________________________________________");
        System.out.println(alinhar("Tipo da pizza:", this.itemDoPedido.getTipo()));
        System.out.println(alinhar("Sabor da pizza:", this.itemDoPedido.getSabor()));
        System.out.println("________________________________________");
        System.out.println(alinhar("Valor:", String.valueOf(this.itemDoPedido.getValor())));
        System.out.println(alinhar("Tx. Entrega:", String.valueOf(this.txEntrega)));
        System.out.println(alinhar("Total:", String.valueOf(this.getTotal())));
        System.out.println("________________________________________");
    }

    private String alinhar(String titulo, String valor){
        String espaços = "";
        int compTitulo = titulo.length();
        int compValor = valor.length();

        for(int i = compValor; i < 40 - compTitulo; i++){
            espaços += " ";
        }

        return titulo + espaços + valor;
    }
}
