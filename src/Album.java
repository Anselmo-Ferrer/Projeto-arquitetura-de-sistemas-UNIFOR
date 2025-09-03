import java.util.Date;
import java.util.List;

public class Album {
    private int id;
    private String nome;
    private Date dataCriacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    }

    public void removerMidia(Midia midia) {

    }

//    public List<Midia> listarMidias() {
//
//    }
}
