package EjerciciosExamen.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Web web = new Web();
        Usuario user1 = new Usuario("Joaquin", true);
        Usuario user2 = new Usuario("Arturo", true);
        Usuario user3 = new Usuario("Jonathan", false);
        Usuario user4 = new Usuario("Samuel", false);
        Usuario user5 = new Usuario("Ratón", true);

        web.add(user1);
        web.add(user2);
        web.add(user3);
        web.add(user4);
        web.add(user5);

        web.notificarUsurio(new Video());
        System.out.println("****************************");
        web.notificarUsurio(new Imagen());
    }
    }

