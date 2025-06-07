
import java.util.*;

public class FuncionarioController {

    private FuncionarioRepository repository;

    public FuncionarioController(FuncionarioRepository repository) {
        this.repository = repository;
    }

    public void criarFuncionario(int id, String nome, String cargo, double salario) {
        Funcionario funcionario = new Funcionario(id, nome, cargo, salario);
        repository.salvar(funcionario);
    }

    public Funcionario buscarFuncionario(int id) {
        return repository.buscarPorId(id);
    }

    public List<Funcionario> listarFuncionarios() {
        return repository.listarTodos();
    }

    public void atualizarFuncionario(int id, String nome, String cargo, double salario) {
        Funcionario funcionario = new Funcionario(id, nome, cargo, salario);
        repository.atualizar(funcionario);
    }

    public void deletarFuncionario(int id) {
        repository.deletar(id);
    }
}
