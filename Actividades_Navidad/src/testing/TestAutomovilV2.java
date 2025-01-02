package testing;

import javabean.Automovil;

public class TestAutomovilV2 {
	private static Automovil auto1 = new Automovil("Renault",2007,1500,"gasoil","compacto",3,4,160,"rojo",100);
	private static Automovil auto2 = new Automovil("Seat",2010,1200,"gasolina","ciudad",5,4,140,"azul",50);

	public static void main(String[] args) {
		acelerarFrenar();
		tiempoLlegada();
		
	

	}
	public static void acelerarFrenar() {
		System.out.println("Metodo acelerarFrenar");
		System.out.println(auto1.acelerarFrenar(20));//true
		System.out.println(auto1.getVelAct());//120
		System.out.println(auto1.acelerarFrenar(100));// false
		System.out.println(auto2.acelerarFrenar(50)); //true
		System.out.println(auto2.getVelAct()); //100
		System.out.println(auto2.acelerarFrenar(-100));//false
		System.out.println("\n");
		
	}
	
	public static void tiempoLlegada() {
		System.out.println("metodo tiempoLLegada");
		System.out.println(auto2.tiempoLlegada(200, 100));//2
		System.out.println(auto2.tiempoLlegada(100, 0));//Infinity
		System.out.println(auto2.tiempoLlegada(234.3, 89.5)); // 2.61...
		
		
	}
	
	
}
