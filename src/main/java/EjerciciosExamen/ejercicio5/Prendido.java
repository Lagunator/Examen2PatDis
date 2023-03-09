package EjerciciosExamen.ejercicio5;

import java.util.Random;

public class Prendido implements IEstado {
    @Override
    public void setStateComputadora(Computadora computadora) throws InterruptedException {

        int programasAbiertos = new Random().nextInt(10);

        for(int i = 0; i< programasAbiertos; i++) {
            computadora.getProgramasAbiertos()[i] = "Programa " + (i+1);

        }

        System.out.println("Se abrieron: " + programasAbiertos + " programas");
        System.out.println("Los recursos aumentan un: " + 5*programasAbiertos + "% ");

        while(computadora.getConsumoCPU() < 5*programasAbiertos && computadora.getConsumoRam() < 5*programasAbiertos) {

            computadora.setConsumoCPU(computadora.getConsumoCPU() + 5);
            computadora.setConsumoRam(computadora.getConsumoRam() + 5);

            computadora.showComputadora();

            Thread.sleep(2000);


        }
    }
}
