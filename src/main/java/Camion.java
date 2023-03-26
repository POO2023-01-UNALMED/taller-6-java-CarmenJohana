package vehiculos;

public class Camion extends Vehiculo {

	private int ejes;

	public Camion( String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {

		super(placa,nombre, precio, peso, fabricante);
		this.ejes=ejes;
		setPuertas(2);
		setVelocidadMaxima(80);
		setTraccion("4X2");
		fabricante.crearVehiculo(this);


	}
}
