import java.util.Scanner;

public class InterfaceUsuario {
    public static void main(String[] args) {

        Empresa em = new Empresa();
        boolean sair = false;

        System.out.println("\n===Bem vindo ao sistema de RH===\n");
        while(!sair){
            System.out.println("Escolha uma opção abaixo\n");
            System.out.println("1 - Cadastrar Funcionario");
            System.out.println("2 - Listar funcionarios e salarios");
            System.out.println("3 - Sair");
            int opcao = new Scanner(System.in).nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome:");
                    String nome = new Scanner(System.in).nextLine();

                    System.out.println("Digite o valor da hora:");
                    double valorHora = new Scanner(System.in).nextDouble();

                    System.out.println("Digite as horas trabalhadas:");
                    int horasTrabalhadas = new Scanner(System.in).nextInt();

                    Funcionario f = new Funcionario(nome, valorHora, horasTrabalhadas);

                    em.adicionarFuncionario(f);
                    break;
                case 2:

                    for(int i=0;i<em.funcionarios.length;i++) {
                        if (em.getFuncionarios()[i] != null) {
                            System.out.println(em.getFuncionarios()[i].getNome() + " - " + em.calcularSalarios()[i]);
                        }else if(em.getFuncionarios()[i] == null){
                            System.out.println("Nenhum funcionario registrado!\n");
                            break;
                        }
                    }

                    break;
                case 3:
                    System.out.println("Encerrando...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;

            }
        }
    }
}
