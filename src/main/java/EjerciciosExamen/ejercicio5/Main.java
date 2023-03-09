package EjerciciosExamen.ejercicio5;

public class Main {
    public static void main(String[] args) {
        Computadora computadora = new Computadora();
        computadora.setEstado(new Apagado());

        computadora.computadoraResourceManager();
        computadora.showComputadora();

        System.out.println(">>>>>>>>>>>>>><<<<<<<<<<<<");

        computadora.setEstado(new Reiniciar());
        computadora.computadoraResourceManager();
        computadora.showComputadora();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");

        computadora.setEstado(new Prendido());
        computadora.computadoraResourceManager();
    }
    }
}
