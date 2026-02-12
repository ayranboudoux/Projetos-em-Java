
import java.util.Scanner;

public class InterfaceUsuario {
    public static void main(String[] args) {

        SetorRH strh = new SetorRH();
        boolean sair = false;
        System.out.println("Bem vindo!");

        while(!sair){
            System.out.println("1 - Cadastrar avaliação");
            System.out.println("2 - Listar funcionarios e classificação");
            System.out.println("3 - Mostrar média geral de desempenho");
            System.out.println("4 - Mostrar quantidade de excelentes");
            System.out.println("5 - Mostrar quantidade de insatisfatorios");
            System.out.println("6 - Sair");
            int opcao = new Scanner(System.in).nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do funcionario");
                    String funcionario = new Scanner(System.in).nextLine();

                    System.out.println("Digite uma nota de 0 a 10 para a produtividade do funcionario: ");
                    double produtividade = new Scanner(System.in).nextDouble();

                    System.out.println("Digite uma nota de 0 a 10 para a qualidade do funcionario: ");
                    double qualidade = new Scanner(System.in).nextDouble();

                    Avaliacao av = new Avaliacao(funcionario, produtividade, qualidade);

                    strh.adicionarAvaliacao(av);
                    break;
                case 2:

                    for (int i = 0; i< strh.getAvaliacoes().length; i++) {
                        if (strh.getAvaliacoes()[i] == null) {
                            System.out.println("Sem avaliacoes cadastrada");
                        } else {
                            System.out.println("Funcionario: " + strh.getAvaliacoes()[i].getFuncionario() + " - Classificação: " + strh.getAvaliacoes()[i].classificarFuncionario());
                        }
                    }
                    break;
                case 3:
                    if(strh.calcularMediaPontuacoes() == 0){
                        System.out.println("Sem avaliacoes cadastrada!");
                    }else {
                    System.out.println("Media geral: " + strh.calcularMediaPontuacoes());}
                    break;
                case 4:
                    if(strh.contarExcelentes() == 0){
                        System.out.println("Sem avaliacoes excelentes!");
                    }else {
                    System.out.println("Quantidade de excelentes: " + strh.contarExcelentes());}
                    break;
                case 5:
                    if(strh.contarInsatisfeitos() == 0){
                        System.out.println("Sem avaliacoes insatisfatorias!");
                    } else{
                    System.out.println("Quantidade de insatisfatorios: " + strh.contarInsatisfeitos());}
                    break;
                case 6:
                    System.out.println("Encerrando...");
                    sair = true;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
    }
}
