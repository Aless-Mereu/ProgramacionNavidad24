package javabean;

public class Automovil {
	private String marca;
	private int modelo;
	private int motor;
	private String combustible;
	private String tipo;
	private int puertas;
	private int asientos;
	private int velMax;
	private String color;
	private int velAct;
	
	
	public Automovil() {
		super();
	}


	public Automovil(String marca, int modelo, int motor, String combustible, String tipo, int puertas, int asientos,
			int velMax, String color, int velAct) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.combustible = combustible;
		this.tipo = tipo;
		this.puertas = puertas;
		this.asientos = asientos;
		this.velMax = velMax;
		this.color = color;
		this.velAct = velAct;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getModelo() {
		return modelo;
	}


	public void setModelo(int modelo) {
		this.modelo = modelo;
	}


	public int getMotor() {
		return motor;
	}


	public void setMotor(int motor) {
		this.motor = motor;
	}


	public String getCombustible() {
		return combustible;
	}


	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getPuertas() {
		return puertas;
	}


	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}


	public int getAsientos() {
		return asientos;
	}


	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}


	public int getVelMax() {
		return velMax;
	}


	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getVelAct() {
		return velAct;
	}


	public void setVelAct(int velAct) {
		this.velAct = velAct;
	}


	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + ", combustible=" + combustible
				+ ", tipo=" + tipo + ", puertas=" + puertas + ", asientos=" + asientos + ", velMax=" + velMax
				+ ", color=" + color + ", velAct=" + velAct + "]";
	}
	
	public boolean acelerarFrenar (int difVel) {
		if (velAct+difVel >= velMax || velAct+difVel<=0)
			return false;
		else {
			velAct+=difVel;
		return true;
	}
}		
	
	
	public double tiempoLlegada (double distancia , double velAct) {
		double tiempoLlegada = distancia/velAct;
		return tiempoLlegada;
	}	
}
