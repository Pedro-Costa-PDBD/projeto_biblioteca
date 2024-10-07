package com.mycompany.app;
public class Autor extends Pessoa {
    private String nacionalidade;
    private Livro[] obrasPublicadas;
    
    // Construtor com nome e nacionalidade
    public Autor(String nome, String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Livro[] getObras_Publicadas() {
        return obras_publicadas;
    }

    public void setObras_Publicadas(Livro[] obras_publicadas) {
        this.obras_publicadas = obras_publicadas;
    }

    public Livro[] getObras_Publicadas_Por_Genero(String genero) {
        return obras_publicadas_por_genero;
    }

    public void setObras_Publicadas_Por_Genero( Livro[] obras_publicadas_por_genero) {
        this.obras_publicadas_por_genero = obras_publicadas_por_genero;
    }
}