package Tema5_23_24.Ejercicio_Call_of_Duty;

public class Accesorios {
	
	private String nombre;
	private int peso;
	
	
	public Accesorios(String nombre, int peso) {
		this.nombre = nombre;
		this.peso = peso;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}

}
