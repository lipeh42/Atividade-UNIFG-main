package EntradaDeDados;

import EntradaDeDados.Usuarios;

import java.util.ArrayList;
import java.util.List;

public class CadUser {
    private List<Usuarios> usuarios; // Corrigido para "usuarios" em vez de "Usuarios"

    public CadUser() {
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuarios usuario) { // Corrigido para "adicionarUsuario" e "usuario"
        this.usuarios.add(usuario); // Corrigido para adicionar o parâmetro "usuario" à lista "usuarios"
    }

    public List<Usuarios> listarUsuarios() {
        return usuarios;
    }
}
