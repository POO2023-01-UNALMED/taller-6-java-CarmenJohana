package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private int ventas;
	private static ArrayList<Pais>listaPaises=new ArrayList<Pais>();

	public Pais(String nombre){
		
		this.nombre=nombre;
		this.ventas=0;
		//if (!listaPaíses.contains(this)) {
		listaPaises.add(this);
			
		//}	
	}
	
	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}
	
	
	
	
	public static ArrayList<Pais> getListaPaises() {
		return listaPaises;
	}

	public static void setListaPaises(ArrayList<Pais> listaPaises) {
		Pais.listaPaises = listaPaises;
	}

	public static Pais paisMasVendedor() {
		
		if (listaPaises.size()!=0) {
			Pais min=listaPaises.get(0);
			for (Pais i: listaPaises)
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
