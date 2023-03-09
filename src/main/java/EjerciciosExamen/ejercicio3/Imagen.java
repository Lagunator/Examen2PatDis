package EjerciciosExamen.ejercicio3;

public class Imagen  implements INotificacion {

    private String msg = "Nueva imagen disponible";

    @Override
    public String getMsg() {
        return msg;
    }
}
