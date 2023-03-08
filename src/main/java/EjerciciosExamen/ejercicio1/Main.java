package EjerciciosExamen.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Versionador versionador = new Versionador();
        Almacenamiento almacenamiento = new Almacenamiento();

        Archivo archivo;
        archivo = new Archivo("EXEXEX02", "este documento es una prueba","es una prueba");
        versionador.setArchivo(archivo);
        almacenamiento.addBackup("version1",versionador.createBackupArchivo());
        archivo = new Archivo(archivo.getId()archivo.getContenido() + "me gusta hacer ejercicio todos los dias","soy fuerte");
        versionador.setArchivo(archivo);
        almacenamiento.addBackup("version 2",versionador.createBackupArchivo());

        archivo = new Archivo(archivo.getId(),)
    }
}
