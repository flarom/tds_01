import java.util.ArrayList;

public class ItemDoPedido{
    private ArrayList <String> tipos = new ArrayList <String>();
    private ArrayList <String> sabores = new ArrayList <String>();

    public void addTipo(String tipo){
        this.tipos.add(tipo);
    }
    public void addSabor(String sabor){
        this.sabores.add(sabor);
    }

    public String getSabor(){
        String listaSabores = "";
        for(int i = 0; i < sabores.size(); i++){
            listaSabores = listaSabores + (sabores.get(i)) + "\t" + (tipos.get(i)) + ";\n\t\t";
        }
        return listaSabores;
    }
    public double getValor(){
        double total = 0;
        for (int i = 0; i < tipos.size(); i++) {
            if (this.tipos.get(i).equals("tradicional")){
                total += 40;
            }
            else {
                total += 50;
            }
        }
        return total;
    }
}
