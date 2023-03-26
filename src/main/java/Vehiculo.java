package vehiculos;

import java.util.ArrayList;

public class Vehiculo {
	private static ArrayList<Camioneta> camionetas=new ArrayList <Camioneta>();
	private static ArrayList<Camion> camiones= new ArrayList<Camion>();
	private static ArrayList<Automovil> automoviles=new ArrayList<Automovil>();


	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int CantidadVehiculos;


	public Vehiculo() {

		CantidadVehiculos++;

	}
	public Vehiculo(String placa, String nombre, int precio, int peso, Fabricante fabricante) {
		this();
		this.placa=placa;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.fabricante=fabricante;

	}

	public Vehiculo(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante) {

		this(placa, nombre, precio, peso, fabricante);
		this.puertas=puertas;


	}
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {

		this(placa, puertas, nombre, precio, peso, fabricante);
		this.velocidadMaxima=velocidadMaxima;
		this.traccion=traccion;


	}

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		CantidadVehiculos = cantidadVehiculos;
	}
	public static ArrayList<Camioneta> getCamionetas() {
		return camionetas;
	}
	public static void setCamionetas(ArrayList<Camioneta> camionetas) {
		Vehiculo.camionetas = camionetas;
	}
	public static ArrayList<Camion> getCamiones() {
		return camiones;
	}
	public static void setCamiones(ArrayList<Camion> camiones) {
		Vehiculo.camiones = camiones;
	}
	public static ArrayList<Automovil> getAutomoviles() {
		return automoviles;
	}
	public static void setAutomoviles(ArrayList<Automovil> automoviles) {
		Vehiculo.automoviles = automoviles;
	}


	public static final String vehiculosPorTipo() {

		return String.format("Automoviles: %d\nCamionetas: %d\nCamiones: %d",automoviles.size(),camionetas.size(),camiones.size());

	}
}
