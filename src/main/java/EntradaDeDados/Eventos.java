package EntradaDeDados;

public class Eventos implements CadastroDeEventos {
    private String data;
    private String hora; // Corrigido para "hora" em vez de "Hora"
    private String nome; // Corrigido para "nome" em vez de "Nome"
    private String cidade;
    private String categoria; // Corrigido para "categoria" em vez de "Categoria"
    private String descricao; // Corrigido para "descricao" em vez de "Descrição"

    public Eventos(String data, String hora, String nome, String cidade, String categoria, String descricao) {
        this.data = data;
        this.hora = hora;
        this.nome = nome;
        this.cidade = cidade;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) { // Corrigido para "data"
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) { // Corrigido para "hora"
        this.hora = hora;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) { // Corrigido para "nome"
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria){ // Corrigido para "categoria"
        this.categoria = categoria;
    }

    public String getDescricao(){ // Corrigido para "descricao"
        return descricao;
    }

    public void setDescricao(String descricao){ // Corrigido para "descricao"
        this.descricao = descricao;
    }
}
