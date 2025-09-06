public class Video extends Midia implements IReproduzivel {
    private float duracao;

    public Video() {
        super();
    }

    public Video(float duracao) {
        super();
        this.duracao = duracao;
    }

    public Video(String titulo, String caminho, String formato, String localizacao, float tamanho, boolean favorito, float duracao) {
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
        System.out.println("Reproduzindo vídeo: " + getTitulo());
    }

    public void pausar() {
        System.out.println("Pausando vídeo: " + getTitulo());
    }

    public void acelerar() {
        System.out.println("Acelerando vídeo: " + getTitulo());
    }
}