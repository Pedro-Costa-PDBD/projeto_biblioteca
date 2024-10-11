package com.mycompany.app;
import org.junit.Test;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Pessoa;

import static org.junit.Assert.*;
public class PessoaTest {
    @Test
    public void testGetNome() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jess");
        assertEquals("Jess", pessoa.getNome());
    }

    @Test
    public void testSetNome() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jess");
        assertEquals("Jess", pessoa.getNome());
    }

    @Test
    public void testGetLivros() {
        Pessoa pessoa = new Pessoa();
        Autor autor = new Autor();

        // Define uma lista de livros para a pessoa
        Livro[] livros = new Livro[2];
        livros[0] = new Livro();
        livros[1] = new Livro();
        pessoa.setLivros(livros);
        
        assertArrayEquals(livros, pessoa.getLivros());
    }

    @Test
    public void testSetLivros() {
        Pessoa pessoa = new Pessoa();
        
        // Setta uma lista de livros para a pessoa
        Livro[] livros = new Livro[2];
        livros[0] = new Livro();
        livros[1] = new Livro();
        pessoa.setLivros(livros);

        assertArrayEquals(livros, pessoa.getLivros());
    }
}