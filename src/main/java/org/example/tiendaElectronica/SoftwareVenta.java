package org.example.tiendaElectronica;

import java.util.ArrayList;

public class SoftwareVenta {
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	private Compra compra;

	public void mostrarProductos() {
		System.out.println("Lista de productos:");
		for (Producto producto : productos) {
			System.out.println("Nombre: " + producto.getNombre());
			System.out.println("Descripción: " + producto.getDescripcion());
			System.out.println("Precio: $" + producto.getPrecio());
			System.out.println("Stock: " + producto.getStock());
			System.out.println("Categoría: " + producto.getCategoria());
			System.out.println("--------------------");
		}
	}

	public ArrayList<Producto> buscarProductoNombre(String nombreBuscado) {
		ArrayList<Producto> productosEncontrados = new ArrayList<>();

		for (Producto producto : productos) {
			if (producto.getNombre().equalsIgnoreCase(nombreBuscado)) {
				productosEncontrados.add(producto);
			}
		}

		return productosEncontrados;
	}

	public ArrayList<Producto> buscarProductoCategoria(String categoriaBuscada) {
		ArrayList<Producto> productosEncontrados = new ArrayList<>();

		for (Producto producto : productos) {
			if (producto.getCategoria().equalsIgnoreCase(categoriaBuscada)) {
				productosEncontrados.add(producto);
			}
		}

		return productosEncontrados;
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}

	public ArrayList<Producto> getProducto() {
		return productos;
	}

	public void eliminarProducto(Producto producto) {
		productos.remove(producto);
	}
}