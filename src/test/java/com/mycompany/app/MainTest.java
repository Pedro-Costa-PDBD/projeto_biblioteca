import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jess", "Brasileira");

        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        livro.validarDisponibilidade();

        Usuario usuario = new Usuario("Gabriel", 21);

        Emprestimo emprestimo = new Emprestimo((new Date()), (new Date()), livro, usuario);
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + pessoa.getNome());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome_Usuario());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de retirada: " + emprestimo.getData_retirada());
        System.out.println("Data de devolução: " + emprestimo.getData_devolucao());
    }
}