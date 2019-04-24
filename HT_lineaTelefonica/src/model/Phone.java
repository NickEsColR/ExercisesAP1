package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* HOJA DE TRABAJO LINEA TELEFONICA
* 24/04/2019
*/

public class Phone extends Local{

	//constants
	
	public final static int PRICE_PHONE_MINUTES = 10;
	
	//attributes
	
	private double 	phoneMinutes;
	
	//methods
	
	/**
	* init Phone attributes <br>
	* @param madeCalls is how many calls the line do <br>
	* @param localMinutes is the duration of all calls to a local call <br>
	* @param phoneMinutes is the duration of all calls to a phone call<br>
	*/
	
	public Phone(int madeCalls, double localMinutes, double phoneMinutes){
		super(madeCalls,localMinutes);
		this.phoneMinutes = phoneMinutes;
	}
	
	/**
	* get the phone minutes of all calls made<br>
	* @return the phoneMinutes of calls was making <br>
	*/	
	public double getPhoneMinutes(){
		return phoneMinutes;
	}
	
	/**
	* add more minutes for phone calls to the counter <br>
	* <b>Pos:</b> a new phone call was do and the counter add the duration of the call<br>
	* @param minutes is the duration of the new call<br>
	*/
	
	public void addPhoneMinutes(double minutes){
		phoneMinutes += minutes;
	}
	
	/**
	* calculate the cost of the phone calls was taking<br>
	* @return  the cost of all phone calls<br> 
	*/
	
	public double calculatePhoneCost(){
		return phoneMinutes * PRICE_PHONE_MINUTES;
	}
	
	/**
	* override the methd setCost()<br>
	*/
	
	@Override
	public double setCost(){
		cost = super.setCost() + calculatePhoneCost();
		return cost;
	}
}