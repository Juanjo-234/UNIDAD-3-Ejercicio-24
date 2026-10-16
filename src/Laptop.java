public class Laptop extends Dispositivo{
    private String procesador;
    private int memoriaRam;

    public Laptop(String  modelo, String marca, double precioBase, String procesador, int memoriaRam) {
        super(modelo, marca, precioBase);
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
    }

    @Override
    public String mostrarDatos() {
        return"[Laptop] " + super.mostrarDatos() + " | Procesador: " + procesador + " | Memoria RAM: " + memoriaRam + " GB";
    }
}
