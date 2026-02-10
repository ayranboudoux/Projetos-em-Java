import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {


        System.out.println("Digite o primeiro numero:");
        double num1 = new Scanner(System.in).nextDouble();

        System.out.println("Digite o segundo numero:");
        double num2 = new Scanner(System.in).nextDouble();

        System.out.println("Digite o operador (+, -, /, X:");
        String operador = new Scanner(System.in).nextLine();

        if(operador.equals("+")){
            double result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        } else if(operador.equals("-")){
            double result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        }else if(operador.equals("/")){
            if(num2 != 0){
            double result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);}
            else{
                System.out.printf("Não e possivel dividir por zero");
            }
        }else if("x".equalsIgnoreCase(operador)){
            double result = num1 * num2;
            System.out.println(num1 + " X " + num2 + " = " + result);
        } else {
            System.out.println("Operador invalido!");
        }
    }
}
