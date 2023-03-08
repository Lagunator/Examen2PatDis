package EjerciciosExamen.ejercicio1;

public class Versionador {
    private Archivo archivo;

    public void setArchivo(Archivo archivo){
        if(archivo.getNuevoConatenido().split("").length >=5){
            this.archivo = archivo;
            System.out.println("El Backup se actualizo");
        }else{
            System.out.println("Este archivo contiene mas de 5 palabras");
        }
    }
    public Backup createBackupArchivo(){
        return new Backup(archivo);
    }
    public Archivo restoreArchivo(Backup backup){
        this.archivo = backup.getArchivo();
        return this.archivo;
    }
}
