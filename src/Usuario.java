import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Usuario {
    private String id;
    private String nome;
    private String email;
    private List<Album> albuns;

    public Usuario() {
        this.id = UUID.randomUUID().toString();
        this.albuns = new ArrayList<>();
    }

    public Usuario(String nome, String email) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.email = email;
        this.albuns = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAlbuns(List<Album> albuns) {
        this.albuns = albuns;
    }

    public List<Album> getAlbuns() {
        return albuns;
    }

    public Album criarAlbum(String nome) {
        Album album = new Album(nome);
        albuns.add(album);
        return album;
    }

    public void apagarAlbum(Album album) {
        albuns.remove(album);
    }

    public List<Midia> visualizarMidia(Album album) {
        return album != null ? album.listarMidias() : new ArrayList<>();
    }
}