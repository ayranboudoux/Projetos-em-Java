import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Double> notas = new ArrayList<Double>();

        notas.add(8.5);
        notas.add(7.8);
        notas.add(6.7);
        notas.add(4.8);
        notas.add(9.9);
        notas.add(7.7);
        notas.add(7.4);
        notas.add(6.6);

        System.out.println("Notas:");
        for (Double nota : notas) {
            System.out.println(nota);
        }

        double total = 0;
        for (Double nota : notas) {
            total += nota;
        }
        double media = total / notas.size();

        System.out.println("\nMedia: " + media);

        double maior = notas.get(0);
        double menor = notas.get(0);

        for (Double nota : notas) {
            if(nota > maior){
                maior = nota;
            }
            if(nota < menor){
                menor = nota;
            }
        }
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);

        int notasAcimaMedia = 0;
        for (Double nota : notas) {
            if(nota > media){
                notasAcimaMedia++;
            }
        }
        System.out.println("Notas acima da média: " + notasAcimaMedia);

        for (int i = 0; i < notas.size(); i++) {
            if(notas.get(i) < 5){
                notas.remove(i);
                i--;
            }
        }

        System.out.println("Notas:");
        for (Double nota : notas) {
            System.out.println(nota);
        }
    }
}
