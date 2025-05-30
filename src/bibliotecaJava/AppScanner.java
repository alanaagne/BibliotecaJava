package bibliotecaJava;

import java.util.Scanner;

//classe para demonstração de interação com o usuário por linha de comando utilizando a biblioteca scanner

public class AppScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        
        // Adicionando alguns livros à biblioteca
        biblioteca.adicionarLivro(new Livro(1, "Java Básico", 1));
        biblioteca.adicionarLivro(new Livro(2, "Padrões de Projeto", 2));
        biblioteca.adicionarLivro(new Livro(3, "Estruturas de Dados", 1));
        biblioteca.adicionarLivro(new Livro(4, "Algoritmos", 1));
        
        System.out.println("Bem-vindo à Biblioteca!");
        
        // Instanciando o usuário de acordo com o tipo informado
        Usuario usuario = null;
        while (usuario == null) {
            System.out.println("\nEscolha o tipo de usuário:");
            System.out.println("1 - Aluno");
            System.out.println("2 - Professor");
            System.out.print("Opção: ");
            int tipo = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            if (tipo == 1) {
                System.out.print("Digite o ID do Aluno: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Digite o nome do Aluno: ");
                String nome = scanner.nextLine();
                System.out.print("Digite a quantidade de créditos do Aluno: ");
                int creditos = scanner.nextInt();
                scanner.nextLine();
                usuario = new Aluno(id, nome, creditos);
            } else if (tipo == 2) {
                System.out.print("Digite o ID do Professor: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Digite o nome do Professor: ");
                String nome = scanner.nextLine();
                usuario = new Professor(id, nome);
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
        // Instanciando os casos de uso
        EmprestarLivroUseCase emprestarLivroUseCase = new EmprestarLivroUseCase();
        DevolverLivroUseCase devolverLivroUseCase = new DevolverLivroUseCase();
        
        // Menu de operações
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Listar livros disponíveis");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcao) {
                case 1:
                    // Listar livros disponíveis
                    System.out.println("\nLivros disponíveis:");
                    for (Livro l : biblioteca.listarLivrosDisponiveis()) {
                        System.out.println(l);
                    }
                    break;
                case 2:
                    // Emprestar livro
                    System.out.print("\nDigite o ID do livro que deseja emprestar: ");
                    int idEmprestar = scanner.nextInt();
                    scanner.nextLine();
                    Livro livroEmprestimo = biblioteca.buscarLivroPorId(idEmprestar);
                    // O use case já exibe os livros disponíveis antes de emprestar
                    emprestarLivroUseCase.emprestarLivro(biblioteca, livroEmprestimo, usuario);
                    break;
                case 3:
                    // Devolver livro
                    System.out.print("\nDigite o ID do livro que deseja devolver: ");
                    int idDevolver = scanner.nextInt();
                    scanner.nextLine();
                    Livro livroDevolucao = biblioteca.buscarLivroPorId(idDevolver);
                    devolverLivroUseCase.devolverLivro(biblioteca, livroDevolucao, usuario);
                    break;
                case 0:
                    System.out.println("\nEncerrando a aplicação. Até logo!");
                    break;
                default:
                    System.out.println("\nOperação inválida. Tente novamente.");
                    break;
            }
        }
        
        scanner.close();
    }
}
