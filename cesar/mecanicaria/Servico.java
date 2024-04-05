import java.time.LocalDateTime;

public class Servico {
    private Double valor = 0.0d;
    private LocalDateTime data = LocalDateTime.now();
    private String descricao = "";
    private String tempo = "";

    public void addValor(Double valor) {
        this.valor += valor;
    }
    public Double getValor() {
        return valor;
    }
    public String getData() {
        return data.toString();
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
    public String getTempo() {
        return tempo;
    }
}
