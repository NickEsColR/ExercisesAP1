package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* HOJA DE TRABAJO DINOSAURIOS
*/

import java.util.ArrayList;

public class Dinosaurio extends SerVivo implements Simulable, Alimentable{
	
	//constants
	
	public final static int CARNIVORO = 10;
	public final static int HERBIVORO = 20;
	
	//attributes
	
	private int tipo;
	
	//methods
	
	public Dinosaurio(int x, int y, double calories, int tipo){
		super(x, y, calories);
		this.tipo = tipo;
	}
	
	public void accion(ArrayList<SerVivo> plantas){
		Comestible p = null;
		for(int i = 0;i < plantas.size();i++){
			if(distancia(darPosX(),darPosY(),plantas.get(i).darPosX(),plantas.get(i).darPosY()) == 1){
				p = (Comestible)plantas.get(i);
				comer(p);
			}
			
		}
	}
	
	public void comer(Comestible planta){
		Planta p = (Planta)planta;
		modificarCalorias(darCalorias() * 0.1);
		modificarCalorias( p.darCalorias()) ;
	}
	
	public int distancia(int posXD,int posYD,int posXP, int posYP){
		int distancia = 0;
		int distanciaX = posXD - posXP;
		int distanciaY = posYD - posYP;
		if(distanciaX < 0){
			distanciaX *= -1;
		}
		if(distanciaY < 0){
			distanciaY *= -1;
		}
		if(distanciaX < 100 && distanciaY < 100){
			distancia = 1;
		}
		return distancia;
	}
	
	public int darTipo(){
		return tipo;
	}
	
	public void modificarTipo(int tipo){
		this.tipo = tipo;
	}
}