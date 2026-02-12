public class SetorRH {
    private Avaliacao[] avaliacoes;

    public SetorRH() {
        avaliacoes = new Avaliacao[5];
    }

    public void adicionarAvaliacao(Avaliacao a) {
        boolean cheio = true;
        for (int i = 0; i < avaliacoes.length; i++) {
            if (avaliacoes[i] == null) {
                avaliacoes[i] = a;
                cheio = false;
                break;
            }
        }
        if (cheio) {
            System.out.println("Todas as avaliações ja foram feitas");
        }
    }

    public double calcularMediaPontuacoes() {
        double soma = 0;
        int cont = 0;
        for (int i = 0; i < avaliacoes.length; i++) {
            if (avaliacoes[i] != null) {
                cont++;
                soma += avaliacoes[i].calcularPontuacaoFinal();
            }
        }
        return soma / cont;
    }

    public int contarExcelentes() {
        int cont = 0;
        for (int i = 0; i < avaliacoes.length; i++) {
            if(avaliacoes[i] != null) {
                if (avaliacoes[i].classificarFuncionario().equals("Excelente!")) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public int contarInsatisfeitos() {
        int cont = 0;
        for (int i = 0; i < avaliacoes.length; i++) {
            if (avaliacoes[i] != null) {
                if ("Insatisfatorio!" == avaliacoes[i].classificarFuncionario()) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public Avaliacao[] getAvaliacoes() {
        return avaliacoes;
    }
}
