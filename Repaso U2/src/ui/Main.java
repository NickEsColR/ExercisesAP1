package ui;

/**
*NICOLAS ESTEBAN COLMENARES RUIZ
*UNIVERSIDAD ICESI
*2/04/2019
*EJERCICIO ESTETICA
*/
import model.*;

public class Main{

	//relations
	
	private Esthetic esthetic;
	
	//methods
	
	public static void main(String[]args){
		Main m = new Main();
	}
	public Main(){
		Employ e1 = new Employ("Juan Velez", "98643412","“Empleado", 2016 );
		Employ e2 = new Employ("Jea Eun Kim", "48647410", "Empleada", 2017);
		Esthetic e = new Esthetic(e1,e2);
		ServiceType st = new ServiceType(ServiceType.HAIR_CUT, 15, 200000);
		e1.setSt1(st);
		st = new ServiceType(ServiceType.MANICURE,17, 242000);
		e2.setSt1(st);
		st = new ServiceType(ServiceType.PEDICURE,12, 180000);
		e2.setSt2(st);
		System.out.println(esthetic.reportPedicureEmploy1());
		System.out.println(esthetic.reportPedicureEmploy2());
	}

}