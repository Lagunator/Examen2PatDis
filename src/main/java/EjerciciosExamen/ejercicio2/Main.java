package EjerciciosExamen.ejercicio2;

public class Main {

    ChatEquipo chatEquipo = new ChatEquipo();
    ChatGlobal chatGlobal = new ChatGlobal();

    Estudiante estudiante1 = new Estudiante(chatEquipo, "Dalas", "Daniel", "8");
    Estudiante estudiante2 = new Estudiante(chatEquipo, "Javi", "Javier", "5");
    Estudiante estudiante3 = new Estudiante(chatEquipo, "Lada", "Laura", "4");
    Estudiante estudiante4 = new Estudiante(chatEquipo, "Nauter", "Marcos", "1");

    Docente docente1 = new Docente(chatEquipo, "Pepe", "Jose", "5");
    Docente docente2 = new Docente(chatEquipo, "Wismichu", "Ismael", "9");
    Docente docente3 = new Docente(chatEquipo, "Miare", "Maria", "7");
    Docente docente4 = new Docente(chatEquipo, "Jason", "Jorge", "1");

        chatEquipo.addJugador(estudiante1).addJugador(estudiante2).addJugador(estudiante3).addJugador(estudiante4)
                .addJugador(docente1).addJugador(docente2).addJugador(docente3).addJugador(docente4);


        estudiante1.send("Hola a mis amigos!");
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");
        docente2.send("Hola a mis colegas docentes!");



        estudiante1.setChatJuegos(chatGlobal);
        estudiante2.setChatJuegos(chatGlobal);
        estudiante3.setChatJuegos(chatGlobal);
        estudiante4.setChatJuegos(chatGlobal);

        docente1.setChatJuegos(chatGlobal);
        docente2.setChatJuegos(chatGlobal);
        docente3.setChatJuegos(chatGlobal);
        docente4.setChatJuegos(chatGlobal);


        chatGlobal.addJugador(estudiante1).addJugador(estudiante2).addJugador(estudiante3).addJugador(estudiante4)
                .addJugador(docente1).addJugador(docente2).addJugador(docente3).addJugador(docente4);

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

        docente1.send("Hola a todos!");
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");
        estudiante4.send("Hola a todos!");




    }




}


