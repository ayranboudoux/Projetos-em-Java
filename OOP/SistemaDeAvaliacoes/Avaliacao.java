public class Avaliacao {
    private String funcionario;
    private double produtividade, qualidade;

    public Avaliacao(String funcionario, double produtividade, double qualidade) {
        this.funcionario = funcionario;
        this.produtividade = produtividade;
        this.qualidade = qualidade;
    }

    public double calcularPontuacaoFinal() {
        return (produtividade * 0.6) + (qualidade * 0.4);
    }

    public String classificarFuncionario() {
        if (calcularPontuacaoFinal() >= 8) {
            return "Excelente!";
        } else if (calcularPontuacaoFinal() >= 6) {
            return "Bom!";
        } else {
            return "Insatisfatorio!";
        }
    }

    public String getFuncionario(){
        return funcionario;
    }

}
