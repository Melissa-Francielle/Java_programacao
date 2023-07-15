package Exercicio_7;

public class CarroCaracteristica {
	private String marca;
	private String modelo;
	private int ano;
	private Carro car;
	
	public CarroCaracteristica() {
		
	}
	
	public CarroCaracteristica(Carro car) {
		car = new Carro();
	}
	
	public CarroCaracteristica(String marca, String modelo, int ano, Carro car) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.car = car;
	}
	
	public void setMarca(String m) {
		this.marca = m;
	}
	
	public void setModelo(String model) {
		this.modelo = model;
	}
	
	public void setAno(int a) {
		this.ano = a;
	}
	
	public void setCar(Carro car) {
		this.car = car;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public Carro getCarro() {
		return car;
	}
}
