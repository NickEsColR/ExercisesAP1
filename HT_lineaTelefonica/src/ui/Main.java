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
		company.addPhones(20, 450,0,0,1);
		company.addPhones(25, 200,1200,0,2);
		company.addPhones(35, 100,30,0,2);
		company.addPhones(20, 165,0,0,1);
		company.addPhones(40, 55,39,75,3);
		System.out.println(company.calculateCost());
	}
	
	
}
