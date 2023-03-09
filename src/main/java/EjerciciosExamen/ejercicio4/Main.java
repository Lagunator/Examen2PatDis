package EjerciciosExamen.ejercicio4;

public class Main {
    public static void main(String[] args) {
        BaseDatos baseDatos = new BaseDatos(new OrdenNombre());

        Estudiante est1 = new Estudiante("411D1DFDS", "Jaime", "2001/08/15", "ICO");
        Estudiante est2 = new Estudiante("DAWD1516", "Jonny", "2002/03/18", "Derecho");
        Estudiante est3 = new Estudiante("1591ASDSAD", "Samuel", "2001/07/20", "Derecho");
        Estudiante est4 = new Estudiante("5161ASDAS", "Javier", "2003/09/14", "Ing. Ambiental");
        Estudiante est5 = new Estudiante("879ASDSD", "Daniel", "2004/01/13", "ICO");

        baseDatos.addEstudiantes(est1);
        baseDatos.addEstudiantes(est2);
        baseDatos.addEstudiantes(est3);
        baseDatos.addEstudiantes(est4);
        baseDatos.addEstudiantes(est5);

        System.out.println("******ORDEN POR NOMBRE******");
        baseDatos.ordenarListaEstudiantes();
        System.out.println("***********************************");

        baseDatos.setOrdenar(new OrdenCI());
        System.out.println("******ORDEN POR CI******");
        baseDatos.ordenarListaEstudiantes();
        System.out.println("************************************");

        System.out.println("******ORDEN POR CARRERA******");
        baseDatos.setOrdenar(new OrdenCarrera());
        baseDatos.ordenarListaEstudiantes();

    }

}

