package vehiculos;

public class Camioneta extends Vehiculo{

	private boolean volco;
	public Camioneta( String placa, int puertas, String nombre, double precio, double peso, Fabricante fabricante, boolean volco) {

		super(placa, puertas, nombre, precio, peso, fabricante);
		this.volco=volco;
		setVelocidadMaxima(90);
		setTraccion("4X4");
		fabricante.crearVehiculo(this);

	}
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}


}
