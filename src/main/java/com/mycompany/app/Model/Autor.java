package com.mycompany.app.Model;

public class Autor extends Pessoa {
    private String nacionalidade;

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private Livro[] obras_publicadas;

    public Livro[] getObras_Publicadas() {
        return obras_publicadas;
    }

    public void setObras_Publicadas(Livro[] obras_publicadas) {
        this.obras_publicadas = obras_publicadas;
    }

    private Livro[] obras_publicadas_por_genero;

    public Livro[] getObras_Publicadas_Por_Genero(String genero) {
        return obras_publicadas_por_genero;
    }

    public void setObras_Publicadas_Por_Genero( Livro[] obras_publicadas_por_genero) {
        this.obras_publicadas_por_genero = obras_publicadas_por_genero;
    }
}