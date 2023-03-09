package EjerciciosExamen.ejercicio5;

public class Computadora {
    private String[] programasAbiertos;
    private int consumoRam;
    private int consumoCPU;

    private IEstado estado;

    public Computadora() {
        programasAbiertos = new String[10];
        consumoRam = 50;
        consumoCPU = 50;
    }

    public String[] getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(String[] programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public int getConsumoRam() {
        return consumoRam;
    }

    public void setConsumoRam(int consumoRam) {
        this.consumoRam = consumoRam;
    }

    public int getConsumoCPU() {
        return consumoCPU;
    }

    public void setConsumoCPU(int consumoCPU) {
        this.consumoCPU = consumoCPU;
    }

    public IEstado getEstado() {
        return estado;
    }

    public void setEstado(IEstado estado) {
        this.estado = estado;
    }

    public void computadoraResourceManager() throws InterruptedException {
        estado.setStateComputadora(this);
    }

    public void showComputadora() {

        System.out.println("Computadora: ");
        System.out.print("Programas abiertos: ");

        for(String programa : programasAbiertos) {
            System.out.println(programa + ", ");
        }

        System.out.println("Consumo CPU: " + consumoCPU) ;
        System.out.println("Consumo RAM: " + consumoRam);

    }
}
