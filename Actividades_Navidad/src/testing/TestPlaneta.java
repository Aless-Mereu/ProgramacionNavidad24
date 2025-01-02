package testing;

import javabean.Planeta;

public class TestPlaneta {

	public static void main(String[] args) {
		Planeta pt1 = new Planeta();
		pt1.setNombre("Tierra");
		pt1.setCantidadSatelites(1);
		pt1.setMasa(5.97E24);
		pt1.setVolumen(1.083E12);
		pt1.setDiametro(13000);
		pt1.setDistanciaSol(150_000_000);
		pt1.setTipo(Planeta.tipoPlaneta.TERRESTRE);
		pt1.setObservableSimpleVista(true);
		
		Planeta pt2 = new Planeta("Jupiter",95,1.9E27,1.43E15,142_984,588_000_000,true,Planeta.tipoPlaneta.GASEOSO);
		
		System.out.println("Planeta1");
		System.out.println(pt1);
		System.out.println("Planeta2");
		System.out.println(pt2);	
		System.out.println("\n \n");
		
		System.out.println("Dimensiones TIERRA");
		System.out.println(pt1.getMasa() +" kg");
		System.out.println(pt1.getVolumen() + " km3");
		pt1.densidad();
		System.out.println(pt1.densidad() + " kg/km3");
		System.out.println("\n\n");
		
		System.out.println("Dimensiones JUPITER");
		System.out.println(pt2.getMasa() +" kg");
		System.out.println(pt2.getVolumen() + " km3");
		pt2.densidad();
		System.out.println(pt2.densidad() + " kg/km3");
		System.out.println("\n\n");

		System.out.println("Distancias TIERRA");
		System.out.println(pt1.getDistanciaSol() + " km hasta el Sol");
		System.out.println("La Tierra es un planeta exterior? " + pt1.exterior());
		System.out.println("\n\n");

		System.out.println("Distancias JUPITER");
		System.out.println(pt2.getDistanciaSol() + " km hasta el Sol");
		System.out.println("Jupiter es un planeta exterior? " + pt2.exterior());
		
	}

}
