package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI 
* SEGUIMIENTO SEMANA 15
* 10/05/2019
*/

public class Deportista extends Cliente implements GananciaPublicidad{
	
	//constants
	
	private static final int TOPE_GAMA_B = 50000;
	private static final int TOPE_GAMA_C = 10000;
	
	//attributes
	
	private double salario;
	private int spots;
	
	//methods
	
	public Deportista(String nombre, String apellido, String id, double salario, int spots){
		super(nombre,apellido,id);
		this.salario = salario;
		this.spots = spots;
	}
	
	public double darSalario(){
		return salario;
	}
	
	public void modificarSalario(double salario){
		this.salario = salario;
	}
	
	public int darSpots(){
		return spots;
	}
	
	public double darGananciaPublicidad(){
		return salario * spots;
	}
	
	public double calcularIngresosProfesional(){
		return salario + darGananciaPublicidad();
	}
	
	public char darNivel(){
		char nivel = ' ';
		if(darGananciaPublicidad() > TOPE_GAMA_B){
			nivel = GananciaPublicidad.GAMA_A;
		}
		else if(darGananciaPublicidad()> TOPE_GAMA_C){
			nivel = GananciaPublicidad.GAMA_B;
		}
		else if(darGananciaPublicidad() > 0){
			nivel = GananciaPublicidad.GAMA_C;
		}
		return nivel;
	}
	
	public String toString(){
		msj = super.toString()+" con salario de "+salario+" y un numero de spots de "+spots+"\n";
		return msj;
	}
}