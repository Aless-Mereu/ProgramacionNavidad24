package testing;

import javabean.Automovil;

public class TestAutomovil {

	public static void main(String[] args) {
		Automovil auto1 = new Automovil("Renault",2007,1500,"gasoil","compacto",3,4,160,"rojo",100);
		
		Automovil auto2 = new Automovil();
		auto2.setMarca("Seat");
		auto2.setModelo(2010);
		auto2.setMotor(1200);
		auto2.setCombustible("gasolina");
		auto2.setTipo("ciudad");
		auto2.setPuertas(5);
		auto2.setAsientos(4);
		auto2.setVelMax(140);
		auto2.setColor("azul");
		auto2.setVelAct(50);
		
		System.out.println("Objetos sin modificar");
		System.out.println(auto1);
		System.out.println(auto2);
		System.out.println("\n\n");
		
		System.out.println("Prueba de metodo acelerar");
		auto1.acelerarFrenar(10); // 110
		System.out.println(auto1.getVelAct());
		auto1.acelerarFrenar(-20);//90
		System.out.println(auto1.getVelAct());
		auto1.acelerarFrenar(-100);// 90 false
		System.out.println(auto1.getVelAct());
		auto1.acelerarFrenar(100);// 90 false
		System.out.println(auto1.getVelAct());
		System.out.println("\n\n");
		
		System.out.println("Prueba metodo tiempoLlegada en horas");
		System.out.println(auto2.tiempoLlegada(400 , 100)); //4
		System.out.println(auto1.tiempoLlegada(234.5 , 120));//1,95
		System.out.println("\n\n");
		
		System.out.println("Prueba metodo acelerar/frenar");
		auto1.setVelAct(100);
		System.out.println(auto1.getVelAct());
		auto1.acelerarFrenar(20);
		System.out.println(auto1.getVelAct());
		auto1.acelerarFrenar(-50);
		System.out.println(auto1.getVelAct());
		
		
		
	}
	

}
