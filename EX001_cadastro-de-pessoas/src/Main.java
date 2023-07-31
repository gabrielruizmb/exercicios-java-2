import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao sistema de cadastro de pessoas!");

        List<Endereco> enderecos001 = new ArrayList<>();
        Endereco endereco001 = new Endereco("Rua Racini", 42);
        Endereco endereco002 = new Endereco("Rua dos Anjos", 12);
        enderecos001.add(endereco001);
        enderecos001.add(endereco002);
        Pessoa pessoa001 = new Pessoa("Alice", enderecos001);

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa001);

        System.out.printf(pessoas.get(0).getNome() + "\n");

        for (Endereco endereco : pessoas.get(0).getEndereco()) {
            System.out.printf(endereco.getRua() + " " + endereco.getNumero() + "\n");
        }
    }
}