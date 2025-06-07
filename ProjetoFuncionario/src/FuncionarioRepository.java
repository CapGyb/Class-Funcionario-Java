
import java.io.*;
import java.util.*;

public class FuncionarioRepository {

    private Map<Integer, Funcionario> funcionarios = new HashMap<>();
    private static final String ARQUIVO = "funcionarios.txt";

    public FuncionarioRepository() {
        carregarDoArquivo();
    }

    public void salvar(Funcionario funcionario) {
        funcionarios.put(funcionario.getId(), funcionario);
        salvarNoArquivo();
    }

    public Funcionario buscarPorId(int id) {
        return funcionarios.get(id);
    }

    public List<Funcionario> listarTodos() {
        return new ArrayList<>(funcionarios.values());
    }

    public void atualizar(Funcionario funcionario) {
        if (funcionarios.containsKey(funcionario.getId())) {
            funcionarios.put(funcionario.getId(), funcionario);
            salvarNoArquivo();
        }
    }

    public void deletar(int id) {
        funcionarios.remove(id);
        salvarNoArquivo();
    }

    private void carregarDoArquivo() {
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                String cargo = dados[2];
                double salario = Double.parseDouble(dados[3]);
                Funcionario funcionario = new Funcionario(id, nome, cargo, salario);
                funcionarios.put(id, funcionario);
            }
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado ou erro ao carregar. Será criado novo ao salvar.");
        }
    }

    private void salvarNoArquivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Funcionario f : funcionarios.values()) {
                bw.write(f.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar no arquivo: " + e.getMessage());
        }
    }
}
