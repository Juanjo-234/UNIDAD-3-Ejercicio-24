Este programa está diseñado para modelar un catálogo de productos electrónicos y dispositivos tecnológicos aplicando los pilares de la programación orientada a objetos en Java: herencia, encapsulamiento, reutilización de atributos mediante la palabra clave super y polimorfismo / sobrescritura de métodos (@Override) para la visualización de fichas técnicas especializadas.

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase base Dispositivo: Concentra los atributos comunes a cualquier equipo tecnológico (marca, modelo y precioBase), provee un constructor centralizado y define un método base para reportar la información general.

Desarrolla las subclases Smartphone y Laptop: Extienden de Dispositivo incorporando atributos particulares y especializados (megapíxeles de cámara y almacenamiento interno para el teléfono; procesador y memoria RAM para el ordenador portátil).

Sobrescribe el método de visualización: Cada clase hija utiliza la anotación @Override para extender el comportamiento del método heredado, imprimiendo tanto los datos generales como las especificaciones técnicas particulares.

Ejecuta la prueba en el main: Instancia objetos de ambas subclases, invoca la impresión de sus respectivas fichas técnicas por consola y muestra los resultados formateados.
