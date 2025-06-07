
import java.util.*;

public class FuncionarioView {

    private Scanner scanner = new Scanner(System.in);

    public int lerId() {
        System.out.print("ID: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String lerNome() {
        System.out.print("Nome: ");
        return scanner.nextLine();
    }

    public String lerCargo() {
        System.out.print("Cargo: ");
        return scanner.nextLine();
    }

    public double lerSalario() {
        System.out.print("Salário: ");
        return Double.parseDouble(scanner.nextLine());
    }

    public void exibirFuncionario(Funcionario funcionario) {
        if (funcionario != null) {
            System.out.println("Funcionário: " + funcionario);
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    public void exibirLista(List<Funcionario> lista) {
        for (Funcionario f : lista) {
            System.out.println(f);
        }
    }

    public int exibirMenu() {
        limparTela();
        System.out.println("\n1 - Criar Funcionário");
        System.out.println("2 - Buscar Funcionário");
        System.out.println("3 - Listar Funcionários");
        System.out.println("4 - Atualizar Funcionário");
        System.out.println("5 - Deletar Funcionário");
        System.out.println("6 - Sair");
        System.out.print("Escolha uma opção: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void limparTela() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Não foi possível limpar a tela.");
        }
    }

    public void pausar() {
        System.out.println("\nPressione ENTER para continuar...");
        scanner.nextLine();
    }
}
