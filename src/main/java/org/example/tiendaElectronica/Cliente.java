package org.example.tiendaElectronica;


import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private ArrayList<Compra> compras = new ArrayList<Compra>();

	public Cliente(String nombre) {
		this.nombre=nombre;
		throw new UnsupportedOperationException();
	}
}