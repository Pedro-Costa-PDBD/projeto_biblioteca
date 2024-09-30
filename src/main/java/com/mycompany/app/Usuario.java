public class Usuario extends Pessoa{
    private String nome;
    private int idade;
    private Emprestimo[] historico_emprestimo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Emprestimo[] getEMprestimo() {
        return historico_emprestimo;
    }

    public void setEMprestimo(Emprestimo[] historico_emprestimo) {
        this.historico_emprestimo = historico_emprestimo;
    }
}