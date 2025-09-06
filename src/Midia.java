import java.util.Date;
import java.util.UUID;

public abstract class Midia {
    private String id;
    private String titulo;
    private String caminho;
    private Date data;
    private String formato;
    private String localizacao;
    private float tamanho;
    private boolean favorito;

    public Midia() {
        this.id = UUID.randomUUID().toString();
        this.data = new Date();
    }

    public Midia(String titulo, String caminho, String formato, String localizacao, float tamanho, boolean favorito) {
        this.id = UUID.randomUUID().toString();
        this.titulo = titulo;
        this.caminho = caminho;
        this.data = new Date();
        this.formato = formato;
        this.localizacao = localizacao;
        this.tamanho = tamanho;
        this.favorito = favorito;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public void compartilhar() {
        System.out.println("Compartilhando mídia: " + titulo);
    }

    public void editar(String tituloNovo) {
        this.titulo = tituloNovo;
    }

    public void apagar() {
        System.out.println("Mídia apagada: " + titulo);
    }

    public void marcarFavorito() {
        this.favorito = true;
    }

    public void desmarcarFavorito() {
        this.favorito = false;
    }
}