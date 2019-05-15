package ui;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI 
* SEGUIMIENTO SEMANA 15
* 10/05/2019
*/
import model.*;
import java.util.Scanner;

public class Main{
	
	//attributes
	
	private Scanner board;
	
	//relations
	
	private Agencia agencia;
	
	//methods
	
	public final static main(String[]args){
		Main m = new Main();
	}
	
	public Main(){
		board = new Scanner(System.in);
		agencia = new Agencia();
		Cliente c = null;
		String nombre = "";
		String apellido = "";
		String id = "";
		int numEventosOSpots = 0;
		double salarioOCosto = 0;
		int option = 0;
		System.out.println("Digite el nombre del cliente");
		nombre = board.nextLine();
		System.out.println("Digite el apellido del cliente");
		apellido = board.nextLine();
		System.out.println("Digite el numero de identificacion del cliente");
		id = board.nextLine();
		System.out.println("Digite 1 si el cliente es un artista y 2 si el cliente es un deportista");
		option = board.nextInt();
		board.nextLine();
		switch(option){
			case 1:
				System.out.println("Digite el numero de eventos en los que ha participado");
				numEventosOSpots = board.nextInt();
				board.nextLine()
				System.out.println("Digite el costo por participar en un evento");
				salarioOCosto = board.nextInt();
				board.nextLine()
				c = new Artista(nombre,apellido,id,numEventosOSpots,salarioOCosto);
			break;
			case 2:
				System.out.println("Digite el numero de spots en los que ha participado");
				numEventosOSpots = board.nextInt();
				board.nextLine()
				System.out.println("Digite el salario que gana el deportista");
				salarioOCosto = board.nextInt();
				board.nextLine()
				c = new Deportista(nombre,apellido,id,numEventosOSpots,salarioOCosto);
			break;
		}
		
	}
	
}