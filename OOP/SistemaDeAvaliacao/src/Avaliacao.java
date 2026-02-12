public class Avaliacao {
    private String funcionario;
    private double produtividade;
    double qualidade;

    public Avaliacao(String funcionario, double produtividade, double qualidade) {
        this.funcionario = funcionario;
        this.produtividade = produtividade;
        this.qualidade = qualidade;
    }

    public double calcularPontuacaoFinal() {
        return (produtividade * 0.6) + (qualidade * 0.4);
    }

    public String classificarFuncionario() {
        String classificacao;
        if (calcularPontuacaoFinal() >= 8) {
            classificacao = "Excelente!";
        } else if (calcularPontuacaoFinal() >= 6) {
            classificacao = "Bom!";
        } else {
            classificacao = "Insatisfatorio!";
        }
        return classificacao;
    }

    public double getPontuacaoFinal() {
        return calcularPontuacaoFinal();
    }

    public String getFuncionario(){
        return funcionario;
    }
}
