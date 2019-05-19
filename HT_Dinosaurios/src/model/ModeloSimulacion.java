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
	
	public void activarAccion(){
		ArrayList<SerVivo> dinos = new ArrayList<SerVivo>();
		ArrayList<SerVivo> plantas = new ArrayList<SerVivo>();
		for (i = 0;i < seresSimulacion.size();i++){
			if(seresSimulacion.get(i) instanceof(Dinosaurio)){
				dinos.add(seresSimulacion.get(i));
			}
			else if(seresSimulacion.get(i) instanceof(Planta)){
				plantas.add(seresSimulacion.get(i));
			}
		}
		for(int j = 0;j < dinos.size();j++){
			dinos.get(j).accion(plantas);
		}
		for(int k = 0;k < plantas.size();k++){
			plantas.get(k).accion(plantas)
		}
	}
}