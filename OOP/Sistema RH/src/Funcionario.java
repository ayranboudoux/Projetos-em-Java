public class Funcionario {
    private String nome;
    private double valorHora;
    private int horasTrabalhadas;

    public Funcionario(String nome, double valorHora, int horasTrabalhadas){
        this.nome = nome;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calculaSalario(){
        return valorHora * horasTrabalhadas;
    }

    public String getNome(){
        return nome;
    }
}
