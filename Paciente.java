public class Paciente {
    private String nome;
    private int idade;
    private String condicao;

    public Paciente(String nome, int idade, String condicao) {
        this.nome = nome;
        this.idade = idade;
        this.condicao = condicao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCondicao() {
        return condicao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Condição: " + condicao;
    }
}
