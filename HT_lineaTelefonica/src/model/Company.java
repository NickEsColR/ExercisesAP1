package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* HOJA DE TRABAJO LINEA TELEFONICA
* 24/04/2019
*/

import java.util.ArrayList;

public class Company{

	//relations
		
	private ArrayList<Telephony> phones;
	
	//methods
	
	/**
	* init VozIP relations <br>
	* <b>Pos:</b> the ArrayList phones is initialized <br>
	*/
	
	public Company(){
		phones = new ArrayList<Telephony>();
	}
	
	/**
	* get all the phones exist <br>
	* @return phones are all the phones exist<br>
	*/
	
	public ArrayList<Telephony> getPhones(){
		return phones;
	}
	
	/**
	* add a new phone<br>
	*  @param madeCalls is how many calls the line do <br>
	* @param localMinutes is the duration of all calls to a local call <br>
	* @param phoneMinutes is the duration of all calls to a phone call<br>
	* @param ldm is the the duration of all calls to a long distance call<br>
	*/
	
	public void addPhones(int madeCalls, double localMinutes, double phoneMinutes, double ldm){
		// phones.add(); // no se como hacerlo, polimorfismo
	}
	
}
