package bibliotecaJava;

import java.util.List;

//Para demonstrar o funcionamento, essa classe principal mostrando a utilização das outras classes, simulando dentro da main os métodos requiridos.

public class App {
    public static void main(String[] args) {
        // Criação da biblioteca e adição de livros
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro(1, "Java Básico", 1);
        Livro livro2 = new Livro(2, "Padrões de Projeto", 2);
        Livro livro3 = new Livro(3, "Estruturas de Dados", 1);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Criação dos usuários
        Aluno aluno = new Aluno(1, "João", 2);
        Professor professor = new Professor(2, "Maria");

        // Listar livros disponíveis antes dos empréstimos (opcional aqui – pois já será listado no use case)
        System.out.println("Consulta inicial dos livros disponíveis:");
        List<Livro> disponiveis = biblioteca.listarLivrosDisponiveis();
        for (Livro livro : disponiveis) {
            System.out.println(livro);
        }

        // Realizando empréstimos
        EmprestarLivroUseCase emprestarUseCase = new EmprestarLivroUseCase();
        System.out.println("\nTentando emprestar o livro 1 para o aluno " + aluno.getNome());
        emprestarUseCase.emprestarLivro(biblioteca, livro1, aluno);

        System.out.println("\nTentando emprestar o livro 2 para a professora " + professor.getNome());
        emprestarUseCase.emprestarLivro(biblioteca, livro2, professor);

        // Listar livros disponíveis após os empréstimos
        System.out.println("\nLivros disponíveis após os empréstimos:");
        disponiveis = biblioteca.listarLivrosDisponiveis();
        for (Livro livro : disponiveis) {
            System.out.println(livro);
        }

        // Processa a devolução do livro emprestado pelo aluno
        System.out.println("\nAluno " + aluno.getNome() + " devolvendo o livro 1.");
        DevolverLivroUseCase devolverUseCase = new DevolverLivroUseCase();
        devolverUseCase.devolverLivro(biblioteca, livro1, aluno);

        // Listar livros disponíveis finais (a listagem já foi feita dentro do use case)
    }
}
