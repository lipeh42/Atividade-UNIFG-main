package EntradaDeDados;

import EntradaDeDados.Eventos;

import java.util.ArrayList;
import java.util.List;

public class CadEvent {
    private List<Eventos> eventos; // Corrigido para "eventos" em vez de "Eventos"

    public CadEvent() {
        this.eventos = new ArrayList<>();
    }

    public void adicionarEvento(Eventos evento) { // Corrigido para "adicionarEvento" e "evento"
        this.eventos.add(evento); // Corrigido para adicionar o parâmetro "evento" à lista "eventos"
    }

    public List<Eventos> listarEventos() { // Corrigido para "listarEventos"
        return eventos;
    }
}
