import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor= new Autor();
        autor.setNome("Joao da Silva");
        autor.setNacionalidade("Brasileiro");

        Livro livro= new Livro();
        livro.setTitulo("Java para iniciantes");
        livro.setAutor(autor);
        livro.setGenero("Tecnologia");
        livro.Validar_Disponivel();

        Usuario usuario= new usuario();
        usuario.setNome_pessoa("Lucas Rafael");
        usuario.setIdade(25);

        Emprestimo emprestimo= new Emprestimo();
        emprestimo.setData_retirada(new Date());
        emprestimo.setData_devolucao(new Date());
        emprestimo.setLIvro(livro);
        emprestimo.setUsuario(usuario);

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome_pessoa());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de retirada: " + emprestimo.getData_retirada());
        System.out.println("Data de devolução: " + emprestimo.getData_devolucao());
    }
}