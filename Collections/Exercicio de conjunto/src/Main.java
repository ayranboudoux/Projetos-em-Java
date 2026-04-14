
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Participante> inscritos = new HashSet<>();
        boolean sair = false;
        while(!sair){
            System.out.println("1 - Inscrever-se\n"
                    + "2 - Ver inscritos\n"
                    + "3 - Sair");
            int opcao = new Scanner(System.in).nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite seu nome, cpf e idade");
                    String nome = new Scanner(System.in).nextLine();
                    String cpf = new Scanner(System.in).nextLine();
                    int idade = new Scanner(System.in).nextInt();
                    Participante p = new Participante(nome, cpf, idade);
                    if(inscritos.add(p)){
                        System.out.println("Inscricao realizada");
                    } else {
                        System.out.println("Participante ja inscrito");
                    }
                    break;
                case 2:
                    for (Participante pt : inscritos) {
                        System.out.println(pt);
                    }
                    break;
                case 3:
                    sair = true;
                default:
                    System.out.println("Invalido");
            }
        }
    }

}
