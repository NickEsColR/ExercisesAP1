package model;

/**
*NICOLAS ESTEBAN COLMENARES RUIZ
*UNIVERSIDAD ICESI
*2/04/2019
*EJERCICIO ESTETICA
*/

public class Esthetic{

	//Relations
	
	private Employ employ1;
	private Employ employ2;
	
	//methods
	
	//init
	public Esthetic(Employ employ1, Employ employ2){
		this.employ1 = employ1;
		this.employ2 = employ2;
	}
	
	public Employ getEmploy1(){
		return employ1;
	}
	
	public Employ getEmploy2(){
		return employ2;
	}
	
	public void setEmploy1(Employ employ){
		employ1 = employ;
	}
	
	public void setEmploy2(Employ employ){
		employ2 = employ;
	}
	
	//calculate the averange of all earning of all ServiceType 
	
	public double calculateAverangeServiceEarning(){
		double  ave = 0;
		ave = employ1.calculateEarningAverange() + employ2.calculateEarningAverange();
		ave /= 2;
		return ave;
	}
	
	public String reportPedicureEmploy1(){
		String msj = "";
		int realization = 0;
		if(employ1.isPedicure() == 0)
			msj = "El empleado "+ employ1.getName() +" no presta el servicio de pedicure";
		else{
			switch(employ1.isPedicure()){
				case 1:
					realization = employ1.getSt1().getRealization();
					if(realization < 10){
						msj = "El empleado "+ employ1.getName()+" tiene "+ employ1.getSt1().getEarningIva()+" pesos de impuestos acumulados por concepto de pedicure";
					}
					else if(realization > 9 && realization < 21){
						msj = "El empleado "+ employ1.getName()+" con el servicio "+ employ1.getSt1().getName()+" tiene "+ employ1.getSt1().getEarning()+" pesos de ingresos acumulados";
					}
					else if(realization > 20 && realization%10 == 0){
						msj = "Felicitaciones a "+ employ1.getName()+" !!! La sala cubrira el valor del impuesto";
					}
				break;
				case 2:
					realization = employ1.getSt2().getRealization();
					if(realization < 10){
						msj = "El empleado "+ employ1.getName()+" tiene "+ employ1.getSt2().getEarningIva()+" pesos de impuestos acumulados por concepto de pedicure";
					}
					else if(realization > 9 && realization < 21){
						msj = "El empleado "+ employ1.getName()+" con el servicio "+ employ1.getSt1().getName()+" tiene "+ employ1.getSt2().getEarning()+" pesos de ingresos acumulados";
					}
					else if(realization > 20 && realization%10 == 0){
						msj = "Felicitaciones a "+ employ1.getName()+" !!! La sala cubrira el valor del impuesto";
					}
				break;
				case 3:
					realization = employ1.getSt3().getRealization();
					if(realization < 10){
						msj = "El empleado "+ employ1.getName()+" tiene "+ employ1.getSt3().getEarningIva()+" pesos de impuestos acumulados por concepto de pedicure";
					}
					else if(realization > 9 && realization < 21){
						msj = "El empleado "+ employ1.getName()+" con el servicio "+ employ1.getSt1().getName()+" tiene "+ employ1.getSt3().getEarning()+" pesos de ingresos acumulados";
					}
					else if(realization > 20 && realization%10 == 0){
						msj = "Felicitaciones a "+ employ1.getName()+" !!! La sala cubrira el valor del impuesto";
					}
				break;
			}
		}
		return msj;
	}
	
	public String reportPedicureEmploy2(){
		String msj = "";
		int realization = 0;
		if(employ2.isPedicure() == 0)
			msj = "El empleado "+ employ2.getName() +" no presta el servicio de pedicure";
		else{
			switch(employ2.isPedicure()){
				case 1:
					realization = employ2.getSt1().getRealization();
					if(realization < 10){
						msj = "El empleado "+ employ2.getName()+" tiene "+ employ2.getSt1().getEarningIva()+" pesos de impuestos acumulados por concepto de pedicure";
					}
					else if(realization > 9 && realization < 21){
						msj = "El empleado "+ employ2.getName()+" con el servicio "+ employ2.getSt1().getName()+" tiene "+ employ2.getSt1().getEarning()+" pesos de ingresos acumulados";
					}
					else if(realization > 20 && realization%10 == 0){
						msj = "Felicitaciones a "+ employ2.getName()+" !!! La sala cubrira el valor del impuesto";
					}
				break;
				case 2:
					realization = employ2.getSt2().getRealization();
					if(realization < 10){
						msj = "El empleado "+ employ2.getName()+" tiene "+ employ2.getSt2().getEarningIva()+" pesos de impuestos acumulados por concepto de pedicure";
					}
					else if(realization > 9 && realization < 21){
						msj = "El empleado "+ employ2.getName()+" con el servicio "+ employ2.getSt1().getName()+" tiene "+ employ2.getSt2().getEarning()+" pesos de ingresos acumulados";
					}
					else if(realization > 20 && realization%10 == 0){
						msj = "Felicitaciones a "+ employ2.getName()+" !!! La sala cubrira el valor del impuesto";
					}
				break;
				case 3:
					realization = employ2.getSt3().getRealization();
					if(realization < 10){
						msj = "El empleado "+ employ2.getName()+" tiene "+ employ2.getSt3().getEarningIva()+" pesos de impuestos acumulados por concepto de pedicure";
					}
					else if(realization > 9 && realization < 21){
						msj = "El empleado "+ employ2.getName()+" con el servicio "+ employ2.getSt1().getName()+" tiene "+ employ2.getSt3().getEarning()+" pesos de ingresos acumulados";
					}
					else if(realization > 20 && realization%10 == 0){
						msj = "Felicitaciones a "+ employ2.getName()+" !!! La sala cubrira el valor del impuesto";
					}
				break;
			}
		}
		return msj;
	}
}