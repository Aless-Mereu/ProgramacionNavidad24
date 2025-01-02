package testing;

import javabean.Planeta;

public class TestPlanetaV2 {

	private static Planeta pt1 = new Planeta("Tierra",1,5.97E24,1.083E12,13000,150_000_000,true,Planeta.tipoPlaneta.TERRESTRE);
	private static Planeta pt2 = new Planeta("Jupiter",95,1.9E27,1.43E15,142_984,588_000_000,true,Planeta.tipoPlaneta.GASEOSO);

	public static void main(String[] args) {
		System.out.println(pt1);
		System.out.println(pt2);
		System.out.println("");
		
		densidad();
		exterior();
	}
	
	public static void densidad() {
		System.out.println("Metodo densidad");
		System.out.println("La densidad de la Tierra es: " + pt1.densidad() + " kg/km3");//5,5E12
		System.out.println("la densidad e Jupiter es: " + pt2.densidad() + " kg/km3");//1,3E12
		System.out.println("");
	}
	public static void exterior() {
		System.out.println("Metodo exterior");
		System.out.println("El planeta Tierra es un planeta exterior: " + pt1.exterior());//false
		System.out.println("El planeta Jupiter es un planeta exterior: " + pt2.exterior());//true
	}

}
