package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	int ventas = 0;
    private static ArrayList<Fabricante> fabricas = new ArrayList<Fabricante>();
    
	public Fabricante(String nombre, Pais pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		fabricas.add(this);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public static ArrayList<Fabricante> getFabricas() {
		return fabricas;
	}
	public static void setFabricas(ArrayList<Fabricante> fabricas) {
		Fabricante.fabricas = fabricas;
	}
	
	public static Fabricante fabricaMayorVentas(){
		Fabricante ganador = new Fabricante(null, null);
		
		for(Fabricante fabricante: fabricas) {
			if(ganador.ventas < fabricante.ventas) {
				ganador = fabricante;
			}
		}
		
		return ganador;
	}
	

    
}
