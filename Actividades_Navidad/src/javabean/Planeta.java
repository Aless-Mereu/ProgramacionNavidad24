package javabean;

public class Planeta {
	private String nombre;
	private int cantidadSatelites;
	private double masa;
	private double volumen;
	private int diametro;
	private int distanciaSol;
	public enum tipoPlaneta{
		GASEOSO,
		TERRESTRE,
		ENANO;
	}
	private tipoPlaneta tipo;
	private boolean observableSimpleVista;
		
	
	public Planeta() {
		super();
	}

	public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaSol,
			boolean observableSimpleVista, tipoPlaneta tipo) {
		super();
		this.nombre = nombre;
		this.cantidadSatelites = cantidadSatelites;
		this.masa = masa;
		this.volumen = volumen;
		this.diametro = diametro;
		this.distanciaSol = distanciaSol;
		this.observableSimpleVista = observableSimpleVista;
		this.tipo = tipo;
	}

	public tipoPlaneta getTipo() {
		return tipo;
	}

	public void setTipo(tipoPlaneta tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadSatelites() {
		return cantidadSatelites;
	}

	public void setCantidadSatelites(int cantidadSatelites) {
		this.cantidadSatelites = cantidadSatelites;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public int getDistanciaSol() {
		return distanciaSol;
	}

	public void setDistanciaSol(int distanciaSol) {
		this.distanciaSol = distanciaSol;
	}

	public boolean isObservableSimpleVista() {
		return observableSimpleVista;
	}

	public void setObservableSimpleVista(boolean observableSimpleVista) {
		this.observableSimpleVista = observableSimpleVista;
	}

	
	
	@Override
	public String toString() {
		return "Planeta [nombre=" + nombre + ", cantidadSatelites=" + cantidadSatelites + ", masa=" + masa
				+ ", volumen=" + volumen + ", diametro=" + diametro + ", distanciaSol=" + distanciaSol + ", tipo="
				+ tipo + ", observableSimpleVista=" + observableSimpleVista + "]";
	}

	public double densidad () {
		double densidad = masa/volumen;
		return densidad;
	}
	
	/*public double cambioUnidades () {
		double distanciaUA = distanciaSol/149_597_870;  
		return distanciaUA;
	}
	
	public boolean exterior (int distanciaEnUA) {
		if (distanciaEnUA <= 2.1)
			return false;
		else {
			return true;
		}*/
		
	public boolean exterior () {
		if (distanciaSol <= 300_000_000) {
			return false;
		}else {
			return true;
		}
		
	
	
	
	}

	
	
}
