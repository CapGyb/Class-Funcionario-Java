
public class FuncionarioDAO {

    private FuncionarioRepository repository;

    public FuncionarioDAO(FuncionarioRepository repository) {
        this.repository = repository;
    }

    public void criar(Funcionario funcionario) {
        repository.salvar(funcionario);
    }

    public Funcionario ler(int id) {
        return repository.buscarPorId(id);
    }

    public void atualizar(Funcionario funcionario) {
        repository.atualizar(funcionario);
    }

    public void deletar(int id) {
        repository.deletar(id);
    }
}
