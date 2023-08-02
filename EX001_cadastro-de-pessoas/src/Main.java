import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner =  new Scanner(System.in);

    public static void main(String[] args) {
        int escolha = 0;

        do {
            escolha = exibirMenu();

            switch (escolha) {
                case 1: cadastrarPessoa();  break;
                default: {
                    System.out.println("Opção inválida");
                }
            }
        } while (escolha != 4);

//        System.out.println("Bem-vindo ao sistema de cadastro de pessoas!");
//
//        List<Endereco> enderecos001 = new ArrayList<>();
//        Endereco endereco001 = new Endereco("Rua Racini", 42);
//        Endereco endereco002 = new Endereco("Rua dos Anjos", 12);
//        enderecos001.add(endereco001);
//        enderecos001.add(endereco002);
//        Pessoa pessoa001 = new Pessoa("Alice", enderecos001);
//
//        List<Pessoa> pessoas = new ArrayList<>();
//        pessoas.add(pessoa001);
//
////        System.out.printf(pessoas.get(0).getNome() + "\n");
////
////        for (Endereco endereco : pessoas.get(0).getEndereco()) {
////            System.out.printf(endereco.getRua() + " " + endereco.getNumero() + "\n");
//        }
    }

    private static void cadastrarPessoa() {
        System.out.println("Insira o nome da pessoa: ");
        System.out.println("Digite qualquer número para voltar");
        scanner.nextInt();
    }

    private static int exibirMenu() {
        System.out.println("Bem-vindo ao sistema de cadastro de pessoas! \n");

        System.out.println("1. Cadastrar pessoa \n" +
                           "2. Listar pessoas \n" +
                           "3. Buscar uma pessoa \n" +
                           "4. Sair");

        return scanner.nextInt();
    }
}