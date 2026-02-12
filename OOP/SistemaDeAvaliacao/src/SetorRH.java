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
        double total = 0;
        for (int i = 0; i < avaliacoes.length; i++) {
            if (avaliacoes[i] != null) {
                total += avaliacoes[i].getPontuacaoFinal();
            }
        }
        return total / avaliacoes.length;
    }

    public int contarExcelentes() {
        int cont = 0;
        int contVazio = 0;
        for (int i = 0; i < avaliacoes.length; i++) {
            if ("Excelente!" == avaliacoes[i].classificarFuncionario()) {
                cont++;
            } else if (avaliacoes[i].classificarFuncionario().isEmpty()) {
                contVazio++;
                if (contVazio == avaliacoes.length) {
                    System.out.println("Sem avaliacoes cadastrada");
                    return 0;
                }
            }
        }
        return cont;
    }

    public int contarInsatisfeitos() {
        int cont = 0;
        int contVazio = 0;
        for (int i = 0; i < avaliacoes.length; i++) {
            if ("Insatisfatorio!" == avaliacoes[i].classificarFuncionario()) {
                cont++;
            } else if (avaliacoes[i].classificarFuncionario().isEmpty()) {
                contVazio++;
                if (contVazio == avaliacoes.length) {
                    System.out.println("Sem avaliacoes cadastrada");
                    return 0;
                }
            }
        }
        return cont;
    }

    public String getAvaliacoes() {
        String getListagem = "";
        for (int i = 0; i < avaliacoes.length; i++) {
            getListagem = avaliacoes[i].getFuncionario() + " - " + avaliacoes[i].getPontuacaoFinal();
        }
        return getListagem;
    }
}
