//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Dispositivo miSmartphone = new Smartphone("Galaxy S24", "Samsung", 899.0, 50, 256 );
Dispositivo miLaptop  =new Laptop("MacBook Pro", "Apple", 2000.0, "Apple M3 Pro", 18 );
    System.out.println("=== FICHAS TÉCNICAS DE DISPOSITIVOS ===");
    System.out.println(miSmartphone.mostrarDatos());
    System.out.println(miLaptop.mostrarDatos());
}


