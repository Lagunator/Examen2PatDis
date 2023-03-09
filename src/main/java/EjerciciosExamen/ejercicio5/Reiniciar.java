package EjerciciosExamen.ejercicio5;

import java.util.Arrays;

public class Reiniciar implements IEstado {
    @Override
    public void setStateComputadora(Computadora computadora) {

        System.out.println("*******REINICIANDO***********");

        computadora.setConsumoRam(0);
        computadora.setConsumoCPU(0);
        Arrays.fill(computadora.getProgramasAbiertos(), "Cerrado");

        System.out.println("Reincio completo.");

    }
}
