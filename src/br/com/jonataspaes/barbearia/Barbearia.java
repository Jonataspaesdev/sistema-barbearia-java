package br.com.jonataspaes.barbearia;

import java.util.ArrayList;

public class Barbearia {
	
	private ArrayList<Barbeiro> barbeiros;
	private ArrayList<Cliente> clientes;
	
	public Barbearia () {
		
		barbeiros = new ArrayList<>();
		clientes = new ArrayList<>();
		
	}
	
	public void addBarbeiro(Barbeiro barber) {
		
		barbeiros.add(barber);
		
	}
	
	public void addCliente(Cliente client) {
		
		clientes.add(client);
		
	}
	
	public ArrayList<Barbeiro> getBarbeiros() {
		
		return barbeiros;
		
	}
	
	public ArrayList<Cliente> getClientes() {
		
		return clientes;
	}

}
