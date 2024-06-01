import EntradaDeDados.CadUser;

public class Main {
    public static void main(String[] args) {
        // Inicialização do cadastro de alunos
        CadUser cadastro = new CadUser();

        // Inicialização do menu de cadastro
        MenuDeCadastro menu = new MenuDeCadastro(cadastro);

        // Exibição do menu
        menu.exibirMenu();
    }
}
