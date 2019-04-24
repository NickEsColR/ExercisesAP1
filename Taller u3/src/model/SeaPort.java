package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* TALLER REPASO U3
* 08/04/2019
*/

import java.util.ArrayList;

public class SeaPort{
	
	//attributes
	
	private String companyName;
	private String address;
	private String phone;
	private String nit;
	
	//relations
	
	ArrayList<Container> containers;
	
	//methods
	
	/**
	* init seaport with the attributes and init the containers<br>
	* <b>Pos:</b> the sea port has been created<br>
	* @param companyName as String. companyName is the name of the companyName<br>
	* @param address as String. is the address of the company<br>
	* @param phone as String. is the phone of the company<br>
	* @param nit as String. is the nit of the company<br>
	*/
	
	public SeaPort(String companyName,String address,String phone,String nit){
		this.companyName = companyName;
		this.address = address;
		this.phone = phone;
		this.nit = nit;
		containers = new ArrayList<Container>();
	}
	
	/**
	* add a new container<br>
	* <b> Pre:</b> the arraylist containers is init<br>
	* <b> Pos:</b> a new container is added<br>
	* @param id as String. id is the identification code unic <br>
	* @param weight as double. weight is the weight of the container <br>
	* @param type as char. type is the type of the container. 't' for tank container, 'a' for dryvan 20 or 'b' for dryvan 40 <br>
	* @param description as String. description is what the container have <br>
	* @param input as boolean. input is if the container is arriving or not <br>
	* @param days as int. days is the number of days on the port <br>
	*/
	
	public void addContainer(String id, double weight, char type, String description, boolean input, int days){
		containers.add(new Container(id,weight,type,description,input,days));
	}
	
	/**
	* look for how many tank container are arriving<br>
	*<b>Pre:</b> all containers != null<br>
	* @return tank as int. tank is the number of tank containers are arriving <br>
	*/
	
	public int requestTankContainerAmount(){
		int tank = 0;
		for(int i = 0;i<containers.size();i++){
			if(containers.get(i).getType() == Container.TANKCONTAINER && containers.get(i).getInput())
				tank++;
		}
		return tank;
	}
	
	/**
	* get the containers that are leaving<br>
	* @return output as ArrayList of Container . output are the containers that are leaving<br>
	*/
	
	public ArrayList<Container> getOutputContainer(){
		ArrayList<Container> output = new ArrayList<Container>();
		for(int i = 0;i<containers.size();i++){
			if(!containers.get(i).getInput())
				output.add(containers.get(i));
		}
		return output;
	}
}