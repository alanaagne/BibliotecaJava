package bibliotecaJava;

public class EmprestarLivroUseCase {

	//metodo para emprestar livros
    public boolean emprestarLivro(Biblioteca biblioteca, Livro livro, Usuario usuario) {
        System.out.println("Livros disponíveis antes do empréstimo:"); //listar os livros disponiveis
        for (Livro l : biblioteca.listarLivrosDisponiveis()) {
            System.out.println(l);
        }
        
        if (livro == null) { //verificação se o livro existe
            System.out.println("Livro não encontrado.");
            return false;
        }
        if (!livro.isDisponivel()) { //verificação se está disponível
            System.out.println("Livro não está disponível para empréstimo.");
            return false;
        }
        if (usuario instanceof Aluno) { //verificação se o usuário é aluno
            Aluno aluno = (Aluno) usuario;
            if (aluno.getCreditos() <= 0) { //verificação dos créditos
                System.out.println("Aluno não possui créditos para realizar o empréstimo.");
                return false;
            }
            aluno.setCreditos(aluno.getCreditos() - 1); //decremento dos créditos se for aluno
        }
        // Se for professor, não há restrição de crédito.
        livro.setDisponivel(false);
        livro.setEmprestadoPara(usuario);
        System.out.println("Empréstimo realizado com sucesso para " + usuario.getNome() + ".");
        return true;
    }
}
