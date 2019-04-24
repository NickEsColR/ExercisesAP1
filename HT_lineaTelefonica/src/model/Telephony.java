package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* HOJA DE TRABAJO LINEA TELEFONICA
* 24/04/2019
*/

public abstract class Telephony{
	
	//attributes
	
	protected int madeCalls;
	protected double cost;
	
	//methods
	
	/**
	* init Telephony attributes <br>
	* @param madeCalls is how many calls the line do <br>
	*/
	
	public Telephony(){
		madeCalls = 0;
		cost = 0;
	}
	
	/**
	* get the number of calls made<br>
	* @return the number of calls was making <br>
	*/
	
	public int getMadeCalls(){
		return madeCalls;
	}
	
	/**
	* add a new made call to the counter <br>
	* <b>Pos:</b> a new call was do and the counter add it<br>
	*/
	
	public void addMadeCall(){
		madeCalls ++;
	}
	
	/**
	* get the cost of all calls <br>
	* @return cost is the cost of all calls made<br>
	*/
	
	public double getCost(){
		return cost;
	}
	
	/**
	* set the cost of all calls made<br>
	*/
	
	public  abstract double  setCost();
}