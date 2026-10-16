public class Dispositivo {
    String modelo;
    String marca;
    double precioBase;

    public Dispositivo(String modelo, String marca, double precioBase) {
        this.modelo = modelo;
        this.marca = marca;
        this.precioBase = precioBase;
    }


    public String mostrarDatos() {
        System.out.println("Modelo del dispositivo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Precio base: " + precioBase);
        return "";
    }
}



