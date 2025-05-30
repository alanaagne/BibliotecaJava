package bibliotecaJava;

public class Professor extends Usuario {

    public Professor(int id, String nome) {
        super(id, nome); //para os atributos herdados da classe abstrata usuario
    }

  //metedo herdado da classe object para retornar os dados do objeto em formato de string
    @Override
    public String toString() {
        return "Professor [id=" + id + ", nome=" + nome + "]";
    }
}

