import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Album {
    private String id;
    private String nome;
    private Date dataCriacao;
    private List<Midia> midias;

    public Album() {
        this.id = UUID.randomUUID().toString();
        this.dataCriacao = new Date();
        this.midias = new ArrayList<>();
    }

    public Album(String nome) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.dataCriacao = new Date();
        this.midias = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void adicionarMidia(Midia midia) {
        midias.add(midia);
    }

    public void removerMidia(Midia midia) {
        midias.remove(midia);
    }

    public List<Midia> listarMidias() {
        return midias;
    }
}