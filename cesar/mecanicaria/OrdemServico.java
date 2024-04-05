import java.util.ArrayList;

public class OrdemServico {
    private Double total = 0.0d;
    private Cliente cliente;
    private Veiculo veiculo;
    private ArrayList<Servico> servicos = new ArrayList<Servico>();

    public void addTotal(Double valor){
        this.total += valor;
    }
    public Double getTotal() {
        return total;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public void addServico(Servico servico){
        this.servicos.add(servico);
    }
    public String getServicos(){
        String out = "";
        for (int i = 0; i < servicos.size(); i++) {
            out += servicos.get(i).getDescricao()+ "\t"+ servicos.get(i).getValor() + "\n";
            addTotal(servicos.get(i).getValor());
        }
        return out;
    }
    
    public void imprimir(){
        System.out.println("________________________________________");
        System.out.println("- - - - - Mecanicaria do Tião - - - - - ");
        System.out.println("________________________________________");
        System.out.println("VEICULO:\t" + veiculo.getDescricao());
        System.out.println("ANO:\t\t" + veiculo.getAno());
        System.out.println("PLACA:\t\t" + veiculo.getPlaca());
        System.out.println("________________________________________");
        System.out.println("PROPRIETARIO:\t" + cliente.getNome());
        System.out.println("CPF:\t\t" + cliente.getCPF());
        System.out.println("ENDERECO:\t" + cliente.getEndereco());
        System.out.println("CONTATO:\t" + cliente.getContato());
        System.out.println("________________________________________");
        System.out.println("SERVICO\t\tPRECO\n" + getServicos());
        System.out.println("TOTAL A PAGAR:\t" + getTotal());
        System.out.println("________________________________________");
        System.out.println("-------Agradecemos a preferencia!-------");
    }
}
