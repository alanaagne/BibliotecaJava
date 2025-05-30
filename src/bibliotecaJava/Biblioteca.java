package bibliotecaJava;

//importações das bibliotecas necessárias
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros; //lista representando a lista de livros da biblioteca

    //construtor
    public Biblioteca() { 
        this.livros = new ArrayList<>();
    }

    //metodo para adiocionar livros a biblioteca
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    //metodo get
    public List<Livro> getLivros() {
        return livros;
    }

    //metodo para retornar livros disponiveis
    public List<Livro> listarLivrosDisponiveis() {
        List<Livro> disponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                disponiveis.add(livro);
            }
        }
        return disponiveis;
    }

    //metodo para buscar livros pelo id
    public Livro buscarLivroPorId(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id)
                return livro;
        }
        return null;
    }
}

