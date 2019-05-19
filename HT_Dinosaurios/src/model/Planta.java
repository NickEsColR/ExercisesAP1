package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* HOJA DE TRABAJO DINOSAURIOS
*/


public class Planta extends SerVivo implements Simulable, Comestible{
	
	//attributes
	
	private int numFrutas;
	
	//methods
	
	public Planta(int x, int y, double calories, int frutas){
		super(x, y, calories);
		numFrutas = frutas;
	}
	
	public void accion(ArrayList<SerVivo> p){
		int caloriaConstante = darCalorias();
		modificarCalorias((darCalorias() * 10)/100);
		darFrutos();
		hacerFotosintesis(caloriaConstante);
	}
	
	public void hacerFotosintesis(int caloriaConstante){
		calories = caloriaConstante; 
	}
	
	public void darFrutos(){
		numFrutas += 10;
	}
}