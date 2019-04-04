package model;

/**
*NICOLAS ESTEBAN COLMENARES RUIZ
*UNIVERSIDAD ICESI
*2/04/2019
*EJERCICIO ESTETICA
*/

public class ServiceType{
	
	//constants
	
	public static final double IVA = 0.19;
	public static final String HAIR_CUT = "corte de cabello";
	public static final String MANICURE = "Manicure";
	public static final String PEDICURE = "Pedicure";
	public static final double GIFT = 1.13;
	
	
	//Attributes
	
	private String name;
	private int realization;
	private double earning;
	private double earningIva;
	
	//methods
	
	//init
	
	public ServiceType(String name, int realization, double earning){
		this.name = name;
		this.realization = realization;
		this.earning = earning;
		setEarningIva();
		addGift();
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setRealization(int realization){
		this.realization = realization;
	}
	
	public void setEarning(double earning){
		this.earning = earning;
	}
	
	public void setEarningIva(){
		earningIva = earning * IVA;
	}
	
	public String getName(){
		return name;
	}
	
	public int getRealization(){
		return realization;
	}
	
	public double getEarning(){
		return earning;
	}
	
	public double getEarningIva(){
		return earningIva;
	}
	
	public void addGift(){
		earning *= GIFT; 
	}
}