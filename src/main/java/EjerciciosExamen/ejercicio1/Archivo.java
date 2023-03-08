package EjerciciosExamen.ejercicio1;

public class Archivo {

    private String id;
    private String contenido;
    private String nuevoConatenido;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getNuevoConatenido() {
        return nuevoConatenido;
    }

    public void setNuevoConatenido(String nuevoConatenido) {
        this.nuevoConatenido = nuevoConatenido;
    }

    public Archivo(String id, String contenido, String nuevoConatenido){

    }

    public void showInfo(){
        System.out.println("ID del archivo:" + id);
        System.out.println("Contenido del archivo:"+ contenido);
    }
}
