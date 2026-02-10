public class Empresa {
    public Funcionario[] funcionarios;

    public Empresa(){
        funcionarios = new Funcionario[5];
    }


    public void adicionarFuncionario(Funcionario f){
        boolean cheio = true;
        for(int i=0;i< funcionarios.length;i++){
            if(funcionarios[i] == null){
                funcionarios[i] = f;
                cheio = false;
                break;
            }
        }
        if(cheio){
            System.out.println("A empresa não possui vagas no momento");
        }
    }

    public double[] calcularSalarios(){

        double[] salarioFuncionarios = new double[funcionarios.length];

        for (int i=0;i< funcionarios.length;i++){
            if(funcionarios[i] != null){
                salarioFuncionarios[i] = funcionarios[i].calculaSalario();
            }
        }
        return salarioFuncionarios;
    }

    public Funcionario[] getFuncionarios(){
        return funcionarios;
    }
}
