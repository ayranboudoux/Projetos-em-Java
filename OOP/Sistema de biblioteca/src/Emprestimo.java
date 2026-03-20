public class Emprestimo extends Livro {
    private String nomeUsario;
    private int diasEmprestados;

    public Emprestimo(String titulo, String autor, int numeroPaginas, String nomeUsario, int diasEmprestados) {
        super(titulo, autor, numeroPaginas);
        this.nomeUsario = nomeUsario;
        this.diasEmprestados = diasEmprestados;
    }

    @Override
    public String toString() {
        return "nomeUsario='" + nomeUsario + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", diasEmprestados=" + diasEmprestados;
    }

    public String getNomeUsario() {
        return nomeUsario;
    }

    public void setNomeUsario(String nomeUsario) {
        this.nomeUsario = nomeUsario;
    }

    public int getDiasEmprestados() {
        return diasEmprestados;
    }

    public void setDiasEmprestados(int diasEmprestados) {
        this.diasEmprestados = diasEmprestados;
    }

    public double calculaMulta(){
        double multa = 0;
        int dias = diasEmprestados;
        if(dias>7){
            multa = 2;
            dias -= 7;
            return dias * multa;
        }else if(dias > 0){
            return multa;
        }else{
            System.out.println("Quantidade de dias invalido!");
        }
        return 0;
    }
}
