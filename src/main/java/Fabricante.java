package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	
	private int ventas;
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante>listaFabricantes=new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais){
		
		this.nombre=nombre;
		this.pais=pais;
		listaFabricantes.add(this);
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
	
	public void crearVehiculo(Vehiculo vehiculo) {
		ventas++;
		pais.setVentas(pais.getVentas()+1);
		
		if (vehiculo instanceof Camion) {

			Vehiculo.getCamiones().add((Camion)vehiculo);
		}
		else if(vehiculo instanceof Camioneta) {
			Vehiculo.getCamionetas().add((Camioneta)vehiculo);
		}
		else if(vehiculo instanceof Automovil) {
			Vehiculo.getAutomoviles().add((Automovil)vehiculo);
		}		
	}


	public int getVentas() {
		return ventas;
	}


	public void setVentas(int ventas) {
		this.ventas = ventas;
	}


	public ArrayList<Fabricante> getListaFabricantes() {
		return listaFabricantes;
	}


	public void setListaFabricantes(ArrayList<Fabricante> listaFabricantes) {
		Fabricante.listaFabricantes = listaFabricantes;
	}
	
	public static Fabricante fabricaMayorVentas() {
		if (listaFabricantes.size()!=0) {
			Fabricante min=listaFabricantes.get(0);
			for (Fabricante i: listaFabricantes)
			{
				if (i.ventas>min.ventas) {
					min=i;	
				}
			}
			
			return min;
		}
		else {
			return null;
		}
		
	}
}

