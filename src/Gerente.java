public class Gerente extends Funcionario {


    //Gerente(String)
    public Gerente(String nome){
        super(nome);
    }

    //realizarFuncao()
    @Override
    public void realizarFuncao(){
        System.out.println("Realizar função de gerente");
    }

    //baterPonto()
    @Override
    public void baterPonto(){
        System.out.println("Bater ponto as 10:00 pelo celular");
    }

    //supervisionarFuncionarios()
    public void supervisionarFuncionarios(){
        System.out.println("Supervisionar funcionarios da loja no momento");
    }

    //supervisionarFuncionarios(Funcionario)
    public void supervisionarFuncionarios(Funcionario funcionario){
        System.out.println("Supervisionar funcionario: "+funcionario.getNome());
    }
}
