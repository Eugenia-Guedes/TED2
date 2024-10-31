public class Enfermeiro {
    private String nome;
    private int idade;
    private String profissao;

    public Enfermeiro(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getProfissao() {
        return profissao;
    }

    @Override
    public String toString() {
        return "Profissional: " + nome + ", Idade: " + idade + ", Profissão: " + profissao;
    }
}
