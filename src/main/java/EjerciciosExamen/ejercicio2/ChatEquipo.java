package EjerciciosExamen.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class ChatEquipo implements IChat{
    private List<Jugador> jugadorList = new ArrayList<>();
    public ChatEquipo addjuagador(Jugador jugador){
        jugadorList.add(jugador);
        return this;
    }
    @Override
    public void send(String msg, Jugador jugador){
        for (Jugador jugadorColega : jugadorList){
            if(Jugador.getClass().getName().contains("Docente")){
                if (jugadorColega.getClass().getName().contains("Estudiante")){
                    jugadorColega.received((msg));
                }
            }
        }
    }

}
