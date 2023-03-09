package EjerciciosExamen.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Web implements IPagina{
    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void add(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void remove(Usuario usuario) {
        usuarios.remove(usuario);
    }

    @Override
    public void notificarUsurio(INotificacion notification) {
        System.out.println("****** "+notification.getMsg()+" ******");
        for(Usuario u: usuarios){
            if(notification instanceof Video && u.isSoloVideos()){
                u.getUpdated(notification);
            } else if (!u.isSoloVideos()){
                u.getUpdated(notification);
            }
        }
    }
}
