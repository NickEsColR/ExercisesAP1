package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* HOJA DE TRABAJO DINOSAURIOS
*/

import java.util.ArrayList;

public class ModeloSimulacion{
	
	//relations
	ArrayList<SerVivo> seresSimulacion;
	
	//methods
	
	public ModeloSimulacion(){
		seresSimulacion = new ArrayList<SerVivo>();
	}
	
	public ArrayList<SerVivo> darSeresSimulacion(){
		return seresSimulacion;
	}
	
	public void modificarSeresSimulacion(ArrayList<SerVivo> s){
		seresSimulacion = s;
	}
	
	public void agregarSerVivo(SerVivo nuevo){
		seresSimulacion.add(nuevo);
	}

}