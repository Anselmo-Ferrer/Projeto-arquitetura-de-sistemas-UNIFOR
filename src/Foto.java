public class Foto extends Midia {

    public Foto() {
        super();
    }

    public Foto(String titulo, String caminho, String formato, String localizacao, float tamanho, boolean favorito) {
        super(titulo, caminho, formato, localizacao, tamanho, favorito);
    }

    public void exibir() {
        System.out.println("Exibindo foto: " + getTitulo());
    }
}