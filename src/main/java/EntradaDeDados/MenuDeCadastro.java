package EntradaDeDados;

import EntradaDeDados.CadEvent;
import EntradaDeDados.CadUser;
import EntradaDeDados.Usuarios;

import java.util.Scanner;

public class MenuDeCadastro {
    private CadUser cadastroDeUsuario;
    private CadEvent cadastroDeEvento;

    public MenuDeCadastro(CadUser cadastroDeUsuario, CadEvent cadastroDeEvento) {
        this.cadastroDeUsuario = cadastroDeUsuario;
        this.cadastroDeEvento = cadastroDeEvento;
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("======= Serviço De Eventos LTDA =======");
            System.out.println("1. Adicionar Usuario");
            System.out.println("2. Listar Usuarios");
            System.out.println("3. Adicionar Evento");
            System.out.println("4. Listar Eventos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    AdicionarUsuario();
                    break;
                case 2:
                    ListarUsuarios();
                    break;
                case 3:
                    AdicionarEventos();
                    break;
                case 4:
                    listarEventos();
                    break;
                case 0:
                    System.out.println("Saindo....");
                    break;
                default:
                    System.out.println("Opção Invalida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    private void AdicionarEventos() {
        // Implementar a lógica para adicionar eventos.
    }

    private void ListarUsuarios() {
        for (Usuarios usuario : cadastroDeUsuario.listarUsuarios()) {
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Idade: " + usuario.getIdade());
            System.out.println("cidade: " + usuario.getcidade());
            System.out.println("-----------------------------");
        }
    }

    private void listarEventos() {
        for (Eventos evento : cadastroDeEvento.listarEventos()) {
            System.out.println("Nome: " + evento.getNome());
            System.out.println("Data: " + evento.getData());
            System.out.println("Hora: " + evento.getHora());
            System.out.println("Cidade: " + evento.getCidade());
            System.out.println("Categoria: " + evento.getCategoria());
            System.out.println("Descrição: " + evento.getDescricao());
            System.out.println("-----------------------------");
        }
    }

    private void AdicionarUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Adicionar um Novo Usuario =====");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();

        Usuarios usuario = new Usuarios(nome, idade, cidade);
        cadastroDeUsuario.adicionarUsuario(usuario); // Corrigido para usar o método correto.
        System.out.println("Usuario Adicionado com sucesso, parabéns!!");
    }
}
