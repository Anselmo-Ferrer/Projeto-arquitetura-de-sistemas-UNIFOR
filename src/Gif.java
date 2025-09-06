public class Gif extends Midia implements IReproduzivel {
    private float duracao;

    public Gif() {
        super();
    }

    public Gif(float duracao) {
        super();
        this.duracao = duracao;
    }

    public Gif(String titulo, String caminho, String formato, String localizacao, float tamanho, boolean favorito, float duracao) {
        super(titulo, caminho, formato, localizacao, tamanho, favorito);
        this.duracao = duracao;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo GIF: " + getTitulo() + " por " + duracao + " segundos.");
    }
}