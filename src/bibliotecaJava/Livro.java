package bibliotecaJava;

public class Livro {
	//declaração dos atributos
    private int id;
    private String titulo;
    private int valorCredito;
    private boolean disponivel;
    private Usuario emprestadoPara; //null quando está disponível

    //construtor da classe
    public Livro(int id, String titulo, int valorCredito) {
        this.id = id;
        this.titulo = titulo;
        this.valorCredito = valorCredito;
        this.disponivel = true; //por padrão, o livro inicia disponível
    }

    // Getters e setters

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getValorCredito() {
        return valorCredito;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Usuario getEmprestadoPara() {
        return emprestadoPara;
    }

    public void setEmprestadoPara(Usuario emprestadoPara) {
        this.emprestadoPara = emprestadoPara;
    }

    //metedo herdado da classe object para retornar os dados do objeto em formato de string
    @Override
    public String toString() {
        return "Livro [id=" + id + ", titulo=" + titulo + ", valorCredito=" + valorCredito 
                + ", disponivel=" + disponivel + "]";
    }
}
