package EjerciciosExamen.ejercicio2;

public class Docente extends Jugador{
    public Docente(IChat chatJuegos, String alias, String nombre, String ranking) {
        super(chatJuegos, alias, nombre, ranking);
    }

    @Override
    public void send(String msg) {

        chatJuego.send(msg, this);

    }

    @Override
    public void received(String msg) {

        System.out.println("El docente: " +getNombre()+ ", recibe el mensaje: " + msg);

    }
}
