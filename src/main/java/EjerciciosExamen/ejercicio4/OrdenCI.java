package EjerciciosExamen.ejercicio4;

import java.util.Comparator;
import java.util.List;

public class OrdenCI extends IOrden {
    @Override
    public void ordenar(List<Estudiante> estudianteList) {
        estudianteList.sort(Comparator.comparing(Estudiante::getCi));
        for(Estudiante estudiante : estudianteList) {
            estudiante.showInfo();
        }
    }
}
