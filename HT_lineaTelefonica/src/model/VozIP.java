package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* HOJA DE TRABAJO LINEA TELEFONICA
* 24/04/2019
*/

public class VozIP extends Local{

	//constants
	
	public final static int PRICE_LONG_DISTANCE = 80;
	public final static int PRICE_PHONE_MINUTES = 7;
	
	//attributes
	
	private double longDistanceMinutes;
	private double phoneMinutes;
	
	//methods
	
	/**
	* init VozIP attributes <br>
	* @param madeCalls is how many calls the line do <br>
	* @param localMinutes is the duration of all calls to a local call <br>
	* @param phoneMinutes is the duration of all calls to a phone call<br>
	* @param ldm is the the duration of all calls to a long distance call<br>
	*/
	
	public VozIP(int madeCalls, double localMinutes, double phoneMinutes, double ldm){
		super(madeCalls,localMinutes);
		this.phoneMinutes = phoneMinutes;
		longDistanceMinutes = ldm;
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
	* get the long distance minutes of all calls made<br>
	* @return the LongDistanceMinutes of calls was making <br>
	*/	
	public double getLongDistanceMinutes(){
		return phoneMinutes;
	}
	
	/**
	* add more minutes for long distance calls to the counter <br>
	* <b>Pos:</b> a new long distance call was do and the counter add the duration of the call<br>
	* @param minutes is the duration of the new call<br>
	*/
	
	public void addLongDistanceMinutes(double minutes){
		longDistanceMinutes += minutes;
	}
	
	/**
	* calculate the cost of the phone calls was taking<br>
	* @return  the cost of all phone calls<br> 
	*/
	
	public double calculatePhoneCost(){
		return phoneMinutes * PRICE_PHONE_MINUTES;
	}
	
	/**
	* calculate the cost of the long distance calls was taking<br>
	* @return  the cost of all long distance calls<br> 
	*/
	
	public double calculateLongDistanceCost(){
		return longDistanceMinutes * PRICE_LONG_DISTANCE;
	}
	
	/**
	* override the methd setCost()<br>
	*/
	
	@Override
	public double setCost(){
		cost = super.setCost() + calculatePhoneCost() + calculateLongDistanceCost();
		return cost;
	}
}