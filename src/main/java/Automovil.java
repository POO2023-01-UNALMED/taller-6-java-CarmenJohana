package vehiculos;

public class Automovil extends Vehiculo{

		private int puestos;

		public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {

			super(placa,nombre, precio, peso, fabricante);

			this.puestos=puestos;
			setVelocidadMaxima(100);
			setPuertas(4);
			setTraccion("FWD");
			fabricante.crearVehiculo(this);

		}

		public int getPuestos() {
			return puestos;
		}

		public void setPuestos(int puestos) {
			this.puestos = puestos;
		}


}
