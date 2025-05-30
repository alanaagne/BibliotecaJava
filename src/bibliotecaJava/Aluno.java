package bibliotecaJava;

public class Aluno extends Usuario {
	//atributos específicos de aluno:
    private int creditos;

    //construtor da classe
    public Aluno(int id, String nome, int creditos) {
        super(id, nome); //para os atributos herdados da classe abstrata usuario
        this.creditos = creditos;
    }

    //get e set
    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

  //metedo herdado da classe object para retornar os dados do objeto em formato de string
    @Override
    public String toString() {
        return "Aluno [id=" + id + ", nome=" + nome + ", creditos=" + creditos + "]";
    }
}
