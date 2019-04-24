package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* HOJA DE TRABAJO LINEA TELEFONICA
* 24/04/2019
*/

public class Local extends Telephony{

	//constants
	
	public final static int PRICE_LOCAL_MINUTE = 35;
	
	//attributes
	
	private double localMinutes;
	
	//methods
	
	/**
	* init Local attributes <br>
	* @param madeCalls is how many calls the line do <br>
	* @param localMinutes is the duration of all calls to a local call<br>
	*/
	
	public Local(int madeCalls, double localMinutes){
		
		this.localMinutes = localMinutes;
		this.madeCalls = madeCalls;
	}
	
	/**
	* get the local minutes of all calls made<br>
	* @return the localMinutes of calls was making <br>
	*/	
	
	public double getLocalMinutes(){
		return localMinutes;
	}
	
	/**
	* add more minutes for local calls to the counter <br>
	* <b>Pos:</b> a new local call was do and the counter add the duration of the call<br>
	* @param minutes is the duration of the new call<br>
	*/
	
	public void addLocalMinutes(double minutes){
		localMinutes += minutes;
	}
	
	/**
	* calculate the cost of the local calls was taking<br>
	* @return  the cost of all local calls<br> 
	*/
	
	public double calculateLocalCost(){
		return localMinutes * PRICE_LOCAL_MINUTE;	
	}
	
	/**
	* override the methd setCost()<br>
	*/
	
	@Override
	public double setCost(){
		cost = calculateLocalCost();
		return cost;
	}
}