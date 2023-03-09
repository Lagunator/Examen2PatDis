package EjerciciosExamen.ejercicio3;

public class Usuario implements IUser{

    private String name;
    private boolean isSoloVideos;

    public Usuario(String name, boolean isSoloVideos) {
        this.name = name;
        this.isSoloVideos = isSoloVideos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getUpdated(INotificacion notificacion) {
        System.out.println(getName()+" recibe el mensaje: "+notificacion.getMsg());
    }

    @Override
    public boolean isSoloVideos() {
        return isSoloVideos;
    }
}
