public class Medico {
    private String nome;
    private int idade;
    private String especializacao;

    public Medico(String nome, int idade, String especializacao) {
            this.nome = nome;
            this.idade = idade;
            this.especializacao = especializacao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    @Override
    public String toString() {
        return "Dr. " + nome + ", Idade: " + idade + ", Especialização: " + especializacao;
    }
}


