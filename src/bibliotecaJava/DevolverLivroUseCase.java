package bibliotecaJava;

public class DevolverLivroUseCase {

	//metodo para devolver livro
    public boolean devolverLivro(Biblioteca biblioteca, Livro livro, Usuario usuario) {
        System.out.println("Livros disponíveis antes da devolução:"); //listar livros disponiveis antes da devolução
        for (Livro l : biblioteca.listarLivrosDisponiveis()) {
            System.out.println(l);
        }
        
        if (livro == null) {
            System.out.println("Livro não encontrado."); //verificação se o livro existe
            return false;
        }
        if (livro.isDisponivel()) { //verificação se está disponível
            System.out.println("Livro já está disponível na biblioteca.");
            return false;
        }
        if (livro.getEmprestadoPara() == null || livro.getEmprestadoPara().getId() != usuario.getId()) {
        	//verificação se o usuário está com o livro
            System.out.println("Esse usuário não efetuou o empréstimo deste livro.");
            return false;
        }
        
        livro.setDisponivel(true);
        livro.setEmprestadoPara(null);
        if (usuario instanceof Aluno) { //verificação se é aluno
            Aluno aluno = (Aluno) usuario;
            aluno.setCreditos(aluno.getCreditos() + 1); //incremento nos créditos do aluno
        }
        
        System.out.println("Devolução realizada com sucesso por " + usuario.getNome() + ".");
        
        System.out.println("Livros disponíveis após a devolução:"); //listando os livros disponíveis após a devolução
        for (Livro l : biblioteca.listarLivrosDisponiveis()) {
            System.out.println(l);
        }
        
        return true;
    }
}
