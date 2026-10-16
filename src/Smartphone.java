public class Smartphone extends  Dispositivo{
    private int megapixelesCamara;
    private int almacenamiento;

    public Smartphone(String modelo, String marca, double precioBase, int megapixelesCamara, int almacenamiento){
        super(modelo, marca, precioBase);
        this.megapixelesCamara = megapixelesCamara;
        this.almacenamiento = almacenamiento;
    }


    @Override
    public String mostrarDatos() {
        return "Smartphone: " + super.mostrarDatos() + " | Cámara: " + megapixelesCamara + " MP | Almacenamiento: " + almacenamiento + " GB";
    }
}
