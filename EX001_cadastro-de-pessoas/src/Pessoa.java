import java.util.List;

public class Pessoa {
    private String nome;
    private List<Endereco> endereco;

    public Pessoa(String nome, List<Endereco> endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }
    public List<Endereco> getEndereco() {
        return this.endereco;
    }
}
