public class Main {
    //Equipe: Job Nunes, José Guilherme, Ivana
    public static void main(String[] args) {
        System.out.println(" ----- loja de sapato ----- ");

        Gerente gerente = new Gerente("Ivana");

        Atendente atendente1 = new Atendente("Guilherme");
        Atendente atendente2 = new Atendente("Job");

        gerente.baterPonto();
        atendente1.baterPonto();

        gerente.realizarFuncao();
        atendente2.realizarFuncao();

        atendente1.buscarCalcados();
        atendente1.buscarCalcados(39);
        atendente1.buscarCalcados("Nike");
        atendente1.buscarCalcados("Adidas",44);

        gerente.supervisionarFuncionarios();
        gerente.supervisionarFuncionarios(atendente1);

    }
}