package ui;

/**
*NICOLAS ESTEBAN COLMENARES RUIZ
*UNIVERSIDAD ICESI
*2/04/2019
*EJERCICIO ESTETICA
*/
import model.*;
import java.util.Scanner;

public class Main{
	
	//attributes
	
	Scanner option = new Scanner(System.in);

	//relations
	
	private Esthetic esthetic;
	
	//methods
	
	public static void main(String[]args){
		Main m = new Main();
	}
	public Main(){
		int election = 0;
		Employ e1 = new Employ("Juan Velez", "98643412","Empleado", 2016 );
		Employ e2 = new Employ("Jea Eun Kim", "48647410", "Empleada", 2017);
		Esthetic e = new Esthetic(e1,e2);
		ServiceType st = new ServiceType(ServiceType.HAIR_CUT, 15, 200000);
		e1.setSt1(st);
		st = new ServiceType(ServiceType.MANICURE,17, 242000);
		e2.setSt1(st);
		st = new ServiceType(ServiceType.PEDICURE,12, 180000);
		e2.setSt2(st);
		while(election != 5){
			showMenu();
			
			election = option.nextInt();
			option.nextLine();
			switch(election){
				case 1:
					System.out.println("*************************************************************************");
					System.out.println("Digite el numero del empleado que presto el servicio");
					System.out.println("1. Juan velez");
					System.out.println("2. Jea Eun Kim");
					int election2 = option.nextInt();
					option.nextLine();
					System.out.println("digite el nombre del servicio prestado");
					String service = option.nextLine();
					System.out.println("digite cuanto cobro por el servicio");
					int cost = option.nextInt();
					option.nextLine();
					int sNumber = esthetic.findService(election2,service);
					switch(election2){
						case 1:
						switch(sNumber){
							case 1:	
								cost += e1.getSt1().getEarning();
								e1.getSt1().setEarning(cost);
								e1.getSt1().setRealization(e1.getSt1().getRealization()+ 1);
							break;
							case 2:
								cost += e1.getSt2().getEarning();
								e1.getSt2().setEarning(cost);
								e1.getSt2().setRealization(e1.getSt2().getRealization()+1);
							break;
							case 3:
								cost += e1.getSt3().getEarning();
								e1.getSt3().setEarning(cost);
								e1.getSt3().setRealization(e1.getSt3().getRealization()+1);
							break;
							case 0:
								st = new ServiceType(service,1,cost);
							break;
						}
						break;
						case 2:
						switch(sNumber){
							case 1:	
								cost += e1.getSt1().getEarning();
								e1.getSt1().setEarning(cost);
								e1.getSt1().setRealization(e1.getSt1().getRealization()+ 1);
							break;
							case 2:
								cost += e1.getSt2().getEarning();
								e1.getSt2().setEarning(cost);
								e1.getSt2().setRealization(e1.getSt2().getRealization()+1);
							break;
							case 3:
								cost += e1.getSt3().getEarning();
								e1.getSt3().setEarning(cost);
								e1.getSt3().setRealization(e1.getSt3().getRealization()+1);
							break;
							case 0:
								st = new ServiceType(service,1,cost);
							break;
						}
						break;
						default:
							System.out.println("*************************************************************************");
							System.out.println("Porfavor elija una opcion valida");
							System.out.println("*************************************************************************");
						break;
					}
					System.out.println("*************************************************************************");
				break;
				case 2:
					System.out.println("*************************************************************************");
					System.out.println(esthetic.calculateAverangeServiceEarning());
					System.out.println("*************************************************************************");
				break;
				case 3:
					System.out.println("*************************************************************************");
					System.out.println("Digite el numero del empleado que presto el servicio");
					System.out.println("1. Juan velez");
					System.out.println("2. Jea Eun Kim");
					election2 = option.nextInt();
					option.nextLine();
					System.out.println(esthetic.calculateWinnig(election2));
					System.out.println("*************************************************************************");
				break;
				case 4:
					System.out.println("*************************************************************************");
					System.out.println(esthetic.reportPedicureEmploy1());
					System.out.println(esthetic.reportPedicureEmploy2());
					System.out.println("*************************************************************************");
				break;
				case 5:
					System.out.println("*************************************************************************");
					System.out.println("que vuelva pronto");
					System.out.println("*************************************************************************");
					election = 5;
				break;
				case 6:
					System.out.println(esthetic.findService(1,"corte de pelo"));
				break;
				default:
					System.out.println("*************************************************************************");
					System.out.println("Porfavor elija una opcion valida");
					System.out.println("*************************************************************************");
				break;
			}
		}
	}
	public void showMenu(){
		System.out.println("digite el numero de la opcion que desea");
		System.out.println("1. registrar un nuevo servicio");
		System.out.println("2. ver el promedio de ingresos");
		System.out.println("3. ver las ganancias de un empleado");
		System.out.println("4. generar un reporte del empleado");
		System.out.println("5. salir del programa");
	}
}