public class Livro {
    private String titulo;
    private Autor autor;
    private String genero;
    private boolean disponivel;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

        public String Genero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void Validar_Disponivel() {
        if(disponivel) {
                System.out.println( "O livro esta disponivel para emprestimo." );
        } else {
            System.out.println( "O livro NAO esta disponivel para emprestimo." );
        }
    }
}