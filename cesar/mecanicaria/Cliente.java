public class Cliente {
    private String nome = "";
    private String endereco = "";
    private String CPF = "";
    private String contato = "";

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public String getCPF() {
        return CPF;
    }
    public void setContato(String contato) {
        this.contato = contato;
    }
    public String getContato() {
        return contato;
    }
}
