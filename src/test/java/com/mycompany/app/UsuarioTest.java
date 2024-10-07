package com.mycompany.app;
public class Usuario extends Pessoa {
    private int idade;
    private Emprestimo[] historicoEmprestimos;
    
    // Construtor com nome, idade e histórico de empréstimos
    public Usuario(String nome, int idade) {
        super(nome);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Emprestimo[] getHistorico_Emprestimo() {
        return historico_emprestimo;
    }

    public void setHistorico_Emprestimo(Emprestimo[] historico_emprestimo) {
        this.historico_emprestimo = historico_emprestimo;
    }

    public String getNome_Usuario() {
        return nome_usuario;
    }

    public void setNome_Usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }
}