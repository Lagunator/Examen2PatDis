package EjerciciosExamen.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class ChatEquipo implements IChat{

    private List<Jugador> jugadorList = new ArrayList<>();

    public ChatEquipo addJugador(Jugador jugador) {

        jugadorList.add(jugador);
        return this;

    }


    @Override
    public void send(String msg, Jugador jugador) {

        for(Jugador jugadorColega : jugadorList) {

            if(jugador.getClass().getName().contains("Estudiante")) {

                Estudiante estudiante = (Estudiante) jugador;

                if(!estudiante.getAlias().equals(jugadorColega.getAlias())) {


                    jugadorColega.received(msg);



                }

            } else if(jugador.getClass().getName().contains("Docente")) {

                Docente docente = (Docente) jugador;

                if(!docente.getAlias().equals(jugadorColega.getAlias())) {


                    jugadorColega.received(msg);



                }

            }

        }

    }
}