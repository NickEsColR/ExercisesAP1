package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* HOJA DE TRABAJO DINOSAURIOS
*/

import java.util.ArrayList;

public class SerVivo{
	
	//attributes
	
	private int posX;
	private int posY;
	private double calories;
	
	//methods
	
	/**
	* constructor for class SerVivo<br>
	* @param x is the posX of a SerVivo<br>
	* @param y is the posY of a SerVivo<br>
	* @param calories is the calories a SerVivo have<br>
	*/
	
	public SerVivo(int x, int y, double calories){
		posX = x;
		posY = y;
		this.calories = calories;
	}
	
	/**
	* get the posX for a SerVivo<br>
	* @return posX is the posX of a SerVivo<br>
	*/
	
	public int darPosX(){
		return posX;
	}
	
	/**
	* set the posX for a SerVivo<br>
	* <b>Pos:</b> the posX have been modify<br>
	* @param posX is the posX for a SerVivo<br>
	*/
	
	public void modificarPosX(int x){
		posX = x;
	}
	
	public int darPosY(){
		return posY;
	}
	
	public void modificarPosY(int y){
		posY = y;
	}
	
	public double darCalorias(){
		return calories;
	}
	
	public void modificarCalorias(double c){
		calories = c;
	}
}