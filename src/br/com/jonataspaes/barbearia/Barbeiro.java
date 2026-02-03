package br.com.jonataspaes.barbearia;

public class Barbeiro {
	
	private String nome;
	private String email;
	private String celular;
	
	private static int contadorBarbeiros=0;
	
	public Barbeiro (String nome, String email, String celular) {
		this.nome = nome;
		this.email = email;
		this.celular = celular;
		
		contadorBarbeiros++;
		
		
	}
	
	public void infoBarbeiro () {
		System.out.println("= Informações do barbeiro =");
		System.out.println("===========================");
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Celular: " + celular);
		System.out.println("===========================");
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
		
	}
	
	public String getEmail() {
		
		return email;
		
	}
	
	public void setEmail(String email) {
		
		this.email = email;
		
	}
	
	public String getCelular() {
		
		return celular;
		
	}
	
	public void setCelular(String celular) {
		
		this.celular = celular;
		
	}
	
	public static int totalBarbeiro() {
		
		return contadorBarbeiros;
		
	}
	
}
