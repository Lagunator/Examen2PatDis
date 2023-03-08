package EjerciciosExamen.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Versionador versionador = new Versionador();
        Almacenamiento almacenamiento = new Almacenamiento();

        Archivo archivo;
        archivo = new Archivo("EXEXEX02", "este documento es una prueba","es una prueba");
        versionador.setArchivo(archivo);
        almacenamiento.addBackup("version1",versionador.createBackupArchivo());
        archivo = new Archivo(archivo.getId(),archivo.getContenido() + "el exito solo depende de tu esfuerzo","el exito solo depende de tu esfuerzo");
        versionador.setArchivo(archivo);
        almacenamiento.addBackup("version 2",versionador.createBackupArchivo());

        archivo = new Archivo(archivo.getId(), archivo.getContenido()+ " prologo", "prologp");
        versionador.setArchivo(archivo);

        archivo =new Archivo(archivo.getId(),archivo.getContenido()+ "actualizaste el documento","actualizado");
        versionador.setArchivo(archivo);
        almacenamiento.addBackup("version 3", versionador.createBackupArchivo());
        archivo.showInfo();

        System.out.println("$$$$$$$$$$   RESTARANDO");
        archivo = versionador.restoreArchivo(almacenamiento.getBackup("version1"));
        archivo.showInfo();
    }
}
