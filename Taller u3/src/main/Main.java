package main;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* TALLER REPASO U3
* 08/04/2019
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import model.*; 

public class Main{

	//mehtods
	
	/**
	* method for make the main begins<br>
	*/
	
	public static void main (String[]args){
		Main m = new Main();
	}
	
	/**
	* init main <br>
	* <b>Pos:</b> main is created<br>
	*/
	
	public Main(){
		Scanner option = new Scanner(System.in);
		SeaPort sp = new SeaPort("Camaron que se duerme", "av 4b #35-18","3158765432","C597301PM");
		int cont = 0;
		while(cont != 4){
			int election = option.nextInt();
			option.nextLine();
			switch(election){
				case 1:
					System.out.println("*************************************************************************");
					System.out.println("Digite el id del contenedor");
					String id = option.nextLine();
					System.out.println("Digite el peso del contenedor");
					double weight = option.nextInt();
					option.nextLine();
					System.out.println("Digite 1 para contenedor tipo tanque, 2 para contenedor tipo dry van 20 o 3 para contenedor tipo dry van 40");
					int num = option.nextInt();
					option.nextLine();
					char type = ' ';
					switch(num){
						case 1:
							type = Container.TANKCONTAINER;
						break;
						case 2:
							type = Container.DRYVAN20;
						break;
						case 3:
							type = Container.DRYVAN40;
						break;
					}
					System.out.println("Digite la descripcion del contenedor");
					String description = option.nextLine();
					System.out.println("Digite 1 si esta llegando o 2 si se va");
					int num1 = option.nextInt();
					option.nextLine();
					boolean input = num == 1 ? true : false;
					System.out.println("Digite los dias que lleva en el puerto");
					int days = option.nextInt();
					option.nextLine();
					sp.addContainer(id,weight,type,description,input,days);
					System.out.println("*************************************************************************");
				break;
				case 2:
					System.out.println("*************************************************************************");
					System.out.println(sp.requestTankContainerAmount());
					System.out.println("*************************************************************************");
				break;
				case 3:
					
					System.out.println("*************************************************************************");
					System.out.println(sp.getOutputContainer());
					System.out.println("*************************************************************************");
				
				break;
				case 4:
					System.out.println("*************************************************************************");
					System.out.println("que vuelva pronto");
					System.out.println("*************************************************************************");
					cont = 4;
				break;
				default:
					System.out.println("*************************************************************************");
					System.out.println("Porfavor elija una opcion valida");
					System.out.println("*************************************************************************");
				break;
			}
		}
	}
	
	/**
	* menu for the client<br>
	*/
	
	public void showMenu(){
		System.out.println("digite el numero de la opcion que desea");
		System.out.println("1. Agregar un nuevo contenedor");
		System.out.println("2. Ver contenedores que van a salir del puerto");
		System.out.println("3. Ver cuantos contenedores tipo tanque,y que entraron hay");
		System.out.println("4. Salir del programa ");
	}
}