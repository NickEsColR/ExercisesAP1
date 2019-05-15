package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* HOJA DE TRABAJO DINOSAURIOS
*/


public class Planta extends SerVivo implements Simulable, Comestible{
	
	//methods
	
	public Planta(int x, int y, double calories){
		super(x, y, calories);
	}
	
	public void accion(ArrayList<SerVivo>){
		hacerFotosintesis();
	}
	
	public void hacerFotosintesis(){
		calories += 50; //modificar
	}
}