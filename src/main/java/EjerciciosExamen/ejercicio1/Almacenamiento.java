package EjerciciosExamen.ejercicio1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Almacenamiento {

    private Map<String, Backup> archivos = new LinkedHashMap<>();

    public void addBackup(String idBackup, Backup backup){
        archivos.put(idBackup, backup);
    }

    public Backup getBackup(String id){
        return archivos.get(id);
    }
}
