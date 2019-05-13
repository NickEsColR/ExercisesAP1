package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI 
* SEGUIMIENTO SEMANA 15
* 10/05/2019
*/

public class Artista extends Cliente{
	
	//attributes
	
	private int numEventos;
	private double costoPorEvento;
	
	//methods
	
	public Artista(String nombre,String apellido, String id, int numE, double costoE){
		super(nombre,apellido,id);
		numEventos = numE;
		costoPorEvento = costoE;
	}
	
	public int darNumEventos(){
		return numEventos;
	}
	
	public void modificarNumEventos(int numE){
		numEventos = numE;
	}
	
	public double darCostoPorEvento(){
		return costoPorEvento;
	}
	
	public void modificarCostoPorEvento(double costoE){
		costoPorEvento = costoE;
	}
	
	public double calcularIngresosProfesional(){
		return numEventos * costoPorEvento;
	}
}