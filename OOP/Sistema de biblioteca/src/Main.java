import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean sair = false;
        ArrayList <Emprestimo> emprestimos = new ArrayList<>();

        System.out.println("Bem vindo!");
        while(!sair){
            System.out.println("Escolha uma opção:\n" +
                    "1 - Cadastrar empréstimo\n" +
                    "2 - Listar empréstimos\n" +
                    "3 - Mostrar total de multas\n" +
                    "4 - Mostrar quantidade de atrasados\n" +
                    "5 - Sair");
            int opcao = new Scanner(System.in).nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Nome: ");
                    String nome = new Scanner(System.in).nextLine();
                    System.out.print("Quantidade de dias: ");
                    int diasEmprestados = new Scanner(System.in).nextInt();
                    System.out.print("Titulo do livro: ");
                    String titulo = new Scanner(System.in).nextLine();
                    System.out.print("Autor: ");
                    String autor = new Scanner(System.in).nextLine();
                    System.out.println("Nº de paginas: ");
                    int numeroPaginas = new Scanner(System.in).nextInt();

                    Emprestimo e = new Emprestimo(titulo, autor, numeroPaginas, nome, diasEmprestados);

                    emprestimos.add(e);
                    break;
                case 2:
                    if(emprestimos.isEmpty()){
                        System.out.println("Nenhum livro emprestado!");
                    }else {
                        for (Emprestimo emprestimo : emprestimos) {
                            if (emprestimo != null) {
                                System.out.println(emprestimo);
                            }
                        }
                    }
                    break;
                case 3:
                    double totalMultas = 0;
                    if(emprestimos.isEmpty()){
                        System.out.println("Nenhum livro emprestado!");
                    }else{
                        for (Emprestimo emprestimo : emprestimos) {
                            totalMultas += emprestimo.calculaMulta();
                        }
                        System.out.println("Total: R$ " + totalMultas);
                    }
                    break;
                case 4:
                    int qtdAtrasados = 0;
                    if(emprestimos.isEmpty()){
                        System.out.println("Nenhum livro emprestado!");
                    }else{
                        for (Emprestimo emprestimo : emprestimos) {
                            if(emprestimo.getDiasEmprestados() > 7){
                                qtdAtrasados++;
                            }
                        }
                        System.out.println("Quantidade de atrasados: " + qtdAtrasados);
                    }
                    break;
                case 5:
                    System.out.println("Encerrando...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        }
    }
}
