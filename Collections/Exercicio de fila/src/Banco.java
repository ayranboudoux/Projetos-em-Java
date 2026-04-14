
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Queue<Cliente> fila = new LinkedList<>();
        boolean sair = false;
        while(!sair){
            System.out.println("1 - Adicionar\n"
                    + "2 - Atender\n"
                    + "3 - Exibir\n"
                    + "4 - Sair");
            int opcao = new Scanner(System.in).nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Digite nome");
                    String nome = new Scanner(System.in).nextLine();
                    fila.add(new Cliente(nome));
                    break;
                case 2:
                    if(!fila.isEmpty()){
                        System.out.println("Atendendo: " + fila.poll());
                    } else {
                        System.out.println("Sem clientes");
                    }
                    break;
                case 3:
                    System.out.println("Fila atual: " + fila);
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    System.out.println("invalido");
            }
        }
    }
}
