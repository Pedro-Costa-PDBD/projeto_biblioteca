public class Pessoa {
    private String nome_pessoa;
    private Livro[] livros;

    public String getNome_pessoa() {
        return nome_pessoa;
    }

    public void setNome_pessoa(String nome_pessoa) {
        this.nome_pessoa = nome_pessoa;
    }

    public Livro[] getLivro() {
        return livros;
    }

    public void setLivro(Livro[] livros) {
        this.livros = livros;
    }
}