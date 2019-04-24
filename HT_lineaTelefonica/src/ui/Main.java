package ui;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI
* ALGORITMOS Y PROGRAMACION 1
* HOJA DE TRABAJO LINEA TELEFONICA
* 24/04/2019
*/

import model.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{

	//relations
	
	private Company company;
	
	//methods
	
	public static void main (String[]args){
		Main m = new Main(new Company());
	}
	
	//init
	
	public Main(Company company){
		this. company = company;
		
	}
}
