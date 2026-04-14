
import java.util.Scanner;
import java.util.Stack;

public class Editor {
    public static void main(String[] args) {
        Stack<Documento> historico = new Stack<>();
        boolean sair = false;
        while(!sair){
            System.out.println("1 - Digitar texto\n"
                    + "2 - Desfazer\n"
                    + "3 - Exibir texto\n"
                    + "4 - Sair");
            int opcao = new Scanner(System.in).nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Digite o texto");
                    String conteudo = new Scanner(System.in).nextLine();
                    historico.push(new Documento(conteudo));
                    break;
                case 2:
                    if(!historico.isEmpty()){
                        historico.pop();
                        System.out.println("ultima alteracao desfeita");
                    } else {
                        System.out.println("nada para desfazer");
                    }
                    break;
                case 3:
                    if(!historico.isEmpty()){
                        System.out.println("Texto atual: " + historico.peek());
                    } else {
                        System.out.println("Documento vazio");
                    }
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
