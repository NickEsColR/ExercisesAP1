package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* TALLER REPASO U3
* 08/04/2019
*/

public class Container{
	
	//constants
	
	public static final char TANKCONTAINER = 't';
	public static final char DRYVAN20 = 'a';
	public static final char DRYVAN40 = 'b';
	public static final double BASECOST = 2000000;
	public static final double DAYCOSTBYARRIVING = 100000;
	public static final double DAYCOSTBYLEAVING = 150000;
	
	//attributes 
	
	private String id;
	private double weight;
	private char type;
	private String description;
	private boolean arriving;
	private int days;
	private double cost;
	
	//methods
	
	/**
	* init container with the attributes <br>
	* <b>Pos:</b> a new container has been created <br>
	* @param id as String. id is the identification code unic <br>
	* @param weight as double. weight is the weight of the container <br>
	* @param type as char. type is the type of the container. 't' for tank container, 'a' for dryvan 20 or 'b' for dryvan 40 <br>
	* @param description as String. description is what the container have <br>
	* @param input as boolean. input is if the container is arriving or not <br>
	* @param days as int. days is the number of days on the port <br>
	*/
	
	public Container(String id, double weight, char type, String description, boolean input, int days){
		this.id = id;
		this.weight = weight;
		this.type = type;
		this.description = description;
		arriving = input;
		this.days = days;
		cost = calculateCost();
	}
	
	/**
	* calculate the cost of the container
	* @return theCost as double. theCost is the calculate for cost of the container <br>
	*/
	
	public double calculateCost(){
		double theCost = days;
		if(arriving){
			theCost *= DAYCOSTBYLEAVING;
		}
		else{
			theCost *= DAYCOSTBYARRIVING;
			theCost += BASECOST * days;
		}
		return cost;
	}
	
	/**
	* get the weight <br>
	* @return weight as double. weight is the attribute weight <br>
	*/
	
	public double getWeight(){
		return weight;
	}
	
	/**
	* get the input <br>
	* @return input as boolean. input is the attribute input <br>
	*/
	
	public boolean getInput(){
		return arriving;
	}
	
	/**
	* get the days <br>
	* @return days as int. days is the attribute days <br>
	*/
	
	public int getDays(){
		return days;
	}
	
	/**
	* get the type <br>
	* @return type as char. type is the attribute type <br>
	*/
	
	public char getType(){
		return type;
	}
	
	/**
	* make the type char on a String <br>
	* @return typeString as String. typeString is the attribute type converted on a String name <br>
	*/
	
	public String toString(){
		String typeString = "";
		if(type == TANKCONTAINER)
			typeString = "Tank container";
		else if(type ==DRYVAN20)
			typeString = "Dry van 20";
		else if(type ==DRYVAN40)
			typeString = "Dry van 40";
		return typeString;
	}
	
	
}