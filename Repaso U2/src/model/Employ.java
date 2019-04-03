package model;

/**
*NICOLAS ESTEBAN COLMENARES RUIZ
*UNIVERSIDAD ICESI
*2/04/2019
*EJERCICIO ESTETICA
*/

public class Employ{
	
	//constants
	
	public static final double HAIR_CUT_PERCENTAGE = 0.20;
	public static final double MANICURE_PERCENTAGE = 0.35;
	public static final double PEDICURE_PERCENTAGE = 0.25;
	
	//Attributes
	
	private String name;
	private String id;
	private String charge;
	private int enterYear;
	
	//relations
	
	private ServiceType st1;
	private ServiceType st2;
	private ServiceType st3;
	
	//methods
	
	//init
	
	public Employ(String name, String id, String charge, int enterYear){
		this.name = name;
		this.id = id;
		this.charge = charge;
		this.enterYear = enterYear;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public void setCharge(String charge){
		this.charge = charge;
	}
	
	public void setEnterYear(int year){
		enterYear = year;
	}
	
	public void setSt1(ServiceType st){
		st1 = st;
	}
	
	public void setSt2(ServiceType st){
		st2 = st;
	}
	
	public void setSt3(ServiceType st){
		st3 = st;
	}
	
	public String getName(){
		return name;
	}
	
	public String getId(){
		return id;
	}
	
	public String getCharge(){
		return charge;
	}
	
	public int getEnterYear(){
		return enterYear;
	}
	
	public ServiceType getSt1(){
		return st1;
	}
	
	public ServiceType getSt2(){
		return st2;
	}
	
	public ServiceType getSt3(){
		return st3;
	}
	
	//calculate winning from earning of services exist and percentage the win of that
	
	public double calculateWinnig(){
		double win = 0;
		if(isHairCut(1)){
			win += st1.getEarning() * HAIR_CUT_PERCENTAGE;
		}
		else if(isManicure(1)){
			win += st1.getEarning() * MANICURE_PERCENTAGE;
		}
		else {
			win += st1.getEarning() * PEDICURE_PERCENTAGE;
		}
		if(st2 != null){
			if(isHairCut(2)){
			win += st2.getEarning() * HAIR_CUT_PERCENTAGE;
			}
			else if(isManicure(2)){
			win += st2.getEarning() * MANICURE_PERCENTAGE;
			}
			else {
			win += st2.getEarning() * PEDICURE_PERCENTAGE;
			}
		}
		if(st3 != null){
			if(isHairCut(3)){
			win += st3.getEarning() * HAIR_CUT_PERCENTAGE;
			}
			else if(isManicure(3)){
			win += st3.getEarning() * MANICURE_PERCENTAGE;
			}
			else {
			win += st3.getEarning() * PEDICURE_PERCENTAGE;
			}
		}
		
		return win;
	}
	
	public boolean isHairCut(int pos){
		boolean hairCut = false;
		switch(pos){
			case 1: 
				if(st1.getName() .equals(ServiceType.HAIR_CUT))
					hairCut = true;
			break;
			case 2:
				if(st2.getName() .equals(ServiceType.HAIR_CUT))
					hairCut = true;
			break;
			case 3:
				if(st3.getName() .equals(ServiceType.HAIR_CUT))
					hairCut = true;
			break;
		}
		return hairCut;
	}
	
	public boolean isManicure(int pos){
		boolean manicure = false;
		switch(pos){
			case 1: 
				if(st1.getName() .equals(ServiceType.MANICURE))
					manicure = true;
			break;
			case 2:
				if(st2.getName() .equals(ServiceType.MANICURE))
					manicure = true;
			break;
			case 3:
				if(st3.getName() .equals(ServiceType.MANICURE))
					manicure = true;
			break;
		}
		return manicure;
	}
	
	//calculate earning averange from all services exist
	
	public double calculateEarningAverange(){
		double ave = st1.getEarning();
		if(st2 != null)
			ave += st2.getEarning();
		if(st3 != null)
			ave += st3.getEarning();
		return ave;
	}
	
	public int isPedicure(){
		int pedicure = 0;
		if(st1.getName().equals(ServiceType.PEDICURE))
			pedicure = 1;
		else if(st2 != null){
			if(st2.getName().equals(ServiceType.PEDICURE))
			pedicure = 2;
		}
		else if(st3 != null){
			if(st3.getName().equals(ServiceType.PEDICURE))
			pedicure = 3;
		}
		return pedicure;
	}
}