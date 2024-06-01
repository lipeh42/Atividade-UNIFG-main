package EntradaDeDados;

public class Usuarios implements CadastroDeUsuarios{
    private String nome;
    private int idade;
    private String cidade;

    // Construtor
    public Usuarios(String nome, int idade, String cidade) {
        this.nome = this.nome;
        this.idade = this.idade;
        this.cidade = cidade;
    }

    // Getters e Setters
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

    public String getCurso() {
        return cidade;
    }

    public void setCurso(String Cidade) {
        this.cidade = Cidade;
    }
}



