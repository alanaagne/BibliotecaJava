package bibliotecaJava;

public abstract class Usuario {
	//declaração dos atributos abstratos
    protected int id;
    protected String nome;

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

  //metedo herdado da classe object para retornar os dados do objeto em formato de string
    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nome=" + nome + "]";
    }
}

