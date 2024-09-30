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
        usuario.setNome("Lucas Rafael");
        usuario.setIdade(25);

        Date data = new Date();

        Pessoa pessoa = new Pessoa();
        pessoa.nome_pessoa("Lucas Rodrigo");
        pessoa.livros("Um dia no amanhecer, Pós primavera de outono, Tente rir antes que o mundo chore");
    }
}