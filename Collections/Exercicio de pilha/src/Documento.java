public class Documento {
    private String conteudo;

    public Documento(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return conteudo;
    }
}
