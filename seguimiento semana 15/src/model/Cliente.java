package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI 
* SEGUIMIENTO SEMANA 15
* 10/05/2019
*/

public abstract class Cliente{

	//attributes
	
	private String nombre;
	private String apellido;
	private String id;
	
	//methods
	
	public Cliente(String nombre, String apellido, String id){
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
	}
	
	public String darNombre(){
		return nombre;
	}
	
	public void modificarNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String darApellido(){
		return apellido;
	}
	
	public void modificarApellido(String apellido){
		this.apellido = apellido;
	}
	
	public String darId(){
		return id;
	}
	
	public void modificarId(String id){
		this.id = id;
	}
	
	public  boolean igualACliente(String id){
		boolean igual = false;
		if(darId().equals(id)){
			igual = true;
		}
		return igual;
	}
	
	public abstract double calcularIngresosProfesional();
	
	public String toString(){
		String msj = "Nombre: "+nombre+" Apellido: "+apellido+" Numero de identificacion "+id;
		return msj;
	}
}