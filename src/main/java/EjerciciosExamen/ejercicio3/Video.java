package EjerciciosExamen.ejercicio3;

public class Video implements INotificacion {

    private String msg = "Nuevo video disponible";

    @Override
    public String getMsg() {
        return msg;
    }
}
