public class Atendente extends Funcionario{

    //Atendente(String)
    public Atendente(String nome) {
        super(nome);
    }

    //realizarFuncao()
    @Override
    public void realizarFuncao(){
        System.out.println("Realizar atendimento ao cliente");
    }

    //baterPonto()
    @Override
    public void baterPonto(){
        System.out.println("Bater ponto sempre as 8:00, com a digital");
    }

    //buscarCalcados()
    public void buscarCalcados(){
        System.out.println("Bucar 5 calçados diferentes");
    }

    //buscarCalcados(int)
    public void buscarCalcados(int numero){
        System.out.println("Buscar calçados de todas as marcas tamanho "+numero);
    }

    //buscarCalcados(String)
    public void buscarCalcados(String marca){
        System.out.println("Buscar calçados da marca "+ marca +" todos os tamanho ");

    }

    //buscarCalcados(String, int)
    public void buscarCalcados(String marca , int numero){
        System.out.println("Buscar calçados da marca "+ marca +" tamanho "+numero);
    }

}
