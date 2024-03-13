public class ItemDoPedido{
    private String tipo = "";
    private String sabor = "";
    private double valor = 0.0;

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setSabor(String sabor){
        this.sabor = sabor;
    }
    public void setValor(Double valor){
        this.valor = valor;
    }
    public double getValor(){
        return this.valor();
    }
}
