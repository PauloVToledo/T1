package org.example.tiendaElectronica;

public class Compra {
	private SoftwareVenta softwareVenta;
	private Cliente cliente;

	public Compra(SoftwareVenta softwareVenta, Cliente cliente) {
		this.softwareVenta = softwareVenta;
		this.cliente = cliente;
	}

	public boolean realizarCompra(String nombreProducto) {
		for (Producto producto : softwareVenta.getProducto()) {
			if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
				if (producto.getStock() > 0) {
					producto.setStock(producto.getStock() - 1);
					return true; // Compra exitosa
				} else {
					return false; // No hay suficiente stock
				}
			}
		}
		return false; // Producto no encontrado
	}

	public int obtenerStockProducto(String nombreProducto) {
		for (Producto producto : softwareVenta.getProducto()) {
			if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
				return producto.getStock();
			}
		}
		return -1; // Valor de retorno para indicar que el producto no se encontró
	}
}
