public class App {
    public static void main(String[] args) throws Exception {
        FuncionarioRepository repository = new FuncionarioRepository();
        FuncionarioController controller = new FuncionarioController(repository);
        FuncionarioView view = new FuncionarioView();

        boolean executando = true;
        while (executando) {
            int opcao = view.exibirMenu();
            switch (opcao) {
                case 1 ->
                    controller.criarFuncionario(
                            view.lerId(),
                            view.lerNome(),
                            view.lerCargo(),
                            view.lerSalario()
                    );
                case 2 ->
                    view.exibirFuncionario(
                            controller.buscarFuncionario(view.lerId())
                    );
                case 3 ->
                    view.exibirLista(controller.listarFuncionarios());
                case 4 ->
                    controller.atualizarFuncionario(
                            view.lerId(),
                            view.lerNome(),
                            view.lerCargo(),
                            view.lerSalario()
                    );
                case 5 ->
                    controller.deletarFuncionario(view.lerId());
                case 6 ->
                    executando = false;
                default ->
                    System.out.println("Opção inválida.");
            }
            if (executando) {
                view.pausar();
            }
            view.limparTela();
        }
    }
}
