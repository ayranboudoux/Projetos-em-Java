
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<Aluno, Double> alunos = new HashMap<>();
        boolean sair = false;
        while (!sair) {
            System.out.println("1 - Cadastrar Aluno\n"
                    + "2 - Registrar nota\n"
                    + "3 - Consultar nota\n"
                    + "4 - Exibir notas\n"
                    + "5 - Sair");
            int opcao = new Scanner(System.in).nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite matricula e nome");
                    String matricula = new Scanner(System.in).nextLine();
                    String nome = new Scanner(System.in).nextLine();
                    Aluno a = new Aluno(matricula, nome);
                    if (!alunos.containsKey(a)) {
                        alunos.put(a, null);
                    } else {
                        System.out.println("Aluno ja cadastrado");
                    }
                    break;
                case 2:
                    System.out.println("Digite a matricula");
                    matricula = new Scanner(System.in).nextLine();
                    for (Aluno al : alunos.keySet()) {
                        if (al.getMatricula().equals(matricula)) {
                            System.out.println("Digite a nota");
                            double nota = new Scanner(System.in).nextDouble();
                            alunos.put(al, nota);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite a matricula");
                    matricula = new Scanner(System.in).nextLine();
                    for (Aluno al : alunos.keySet()) {
                        if (al.getMatricula().equals(matricula)) {
                            System.out.print("Nome: " + al.getNome());
                            if (alunos.get(al) != null) {
                                System.out.println(" Nota: " + alunos.get(al));
                            } else {
                                System.out.println(" Nota: Nao cadastrada");
                            }
                        }
                    }
                    break;
                case 4:
                    for (Aluno al : alunos.keySet()) {
                        if (alunos.get(al) != null) {
                            System.out.println(" Nota: " + alunos.get(al));
                        } else {
                            System.out.println(" Nota: Nao cadastrada");
                        }
                    }
                    break;
                case 5:
                    sair = true;
                    break;
                default:
                    System.out.println("invalido");
            }
        }
    }
}
