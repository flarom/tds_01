import java.util.ArrayList;

public class ItemDoPedido{
    private ArrayList <String> tipos = new ArrayList <String>();
    private ArrayList <String> sabores = new ArrayList <String>();

    public void setTipo(String tipo){
        this.tipos.add(tipo);
    }
    public void setSabor(String sabor){
        this.sabores.add(sabor);
    }

    public String getSabores(){
        String listaSabores = "";
        for(int i = 0; i < sabores.size(); i++){
            listaSabores = listaSabores + (sabores.get(i)) + " " + (tipos.get(i)) + ";\n";
        }
        return listaSabores;
    }
    public double getValor(){
        double total = 0;
        for (int i = 0; i < tipos.size(); i++) {
            if (this.tipos.get(i).equalsIgnoreCase("tradicional")){
                total += 40;
            }
            else {
                total += 50;
            }
        }
        return total;
    }
}
