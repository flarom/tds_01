import java.util.ArrayList;

public class ItemDoPedido{
    private String tipo = "";
    private ArrayList <String> sabores = new ArrayList <String>();
    private double valor = 0.0;

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void addSabor(String sabor){
        this.sabores.add(sabor);
    }
    public void addValor(Double valor){
        this.valor += valor;
    }
    public String getTipo(){
        return this.tipo;
    }
    public String getSabor(){
        //return this.sabores.toString();
        String listaSabores ="";
        for(int i = 0; i < sabores.size(); i++){
            listaSabores = listaSabores + (sabores.get(i).toString()) + ";\n\t\t";
        }
        return listaSabores;
    }
    public double getValor(){
        return this.valor;
    }
}
