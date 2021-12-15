package models;

public class Pokemon {
	private Tipos_Pokemon tipo1, tipo2;
	private String nombre, categoria, habilidad;
	private int numeroPokedex;
	private double altura, peso;
	private boolean conocido;

	// Const
	public Pokemon(int numeroPokedex, String nombre, Tipos_Pokemon tipo1, Tipos_Pokemon tipo2, double altura,
			double peso, String habilidad, String categoria, boolean conocido) {
		super();
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.nombre = nombre;
		this.categoria = categoria;
		this.habilidad = habilidad;
		this.numeroPokedex = numeroPokedex;
		this.altura = altura;
		this.peso = peso;
		this.conocido = conocido;
	}

	// Getters - Setters
	public String getTipo1() {
		return tipo1.name();
	}

	public void setTipo1(Tipos_Pokemon tipo1) {
		this.tipo1 = tipo1;
	}
	
	public String getTipo2() {
		return this.tipo2.name();
	}

	public void setTipo2(Tipos_Pokemon tipo2) {
		this.tipo2 = tipo2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public int getNumeroPokedex() {
		return numeroPokedex;
	}

	public void setNumeroPokedex(int numeroPokedex) {
		this.numeroPokedex = numeroPokedex;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public boolean isConocido() {
		return conocido;
	}

	public void setConocido(boolean conocido) {
		this.conocido = conocido;
	}
	// Methods


	// toString
	@Override
	public String toString() {
		return "Pokemon [tipo1=" + tipo1 + ", tipo2=" + tipo2 + ", nombre=" + nombre + ", categoria=" + categoria
				+ ", habilidad=" + habilidad + ", numeroPokedex=" + numeroPokedex + ", altura=" + altura + ", peso="
				+ peso + "]";
	}

}
