public abstract class Funcionario {
    private String nome;

    public Funcionario(String nome){
        this.nome = nome;
    }

    //realizarFuncao()
    public abstract void realizarFuncao();

    //baterPonto()
    public abstract void baterPonto();

    public String getNome(){
        return this.nome;
    }
}
