package org.example.tiendaElectronica;

class Main {
    public static void main(String[] args) {
        SoftwareVenta tienda = new SoftwareVenta();

        // Crear el producto Objeto1 con stock predefinido de 10 unidades
        Producto objeto1 = new Producto("Objeto1", "Descripción del Objeto1", 100, 10, "Categoría1");
        tienda.agregarProducto(objeto1);

        // Mostrar la lista de productos
        tienda.mostrarProductos();
    }
}