package modelo;

/**
 * Entidad que representa a una persona que aspira a ser contratada por una empresa a través de un proceso de selección
 */
public class Candidato {
	public final static double BONIFICACION =0.5;
	private String id;
	private String nombres;
	private String apellidos;
	private char sexo;
	private double habilidadesComunicacion;
	private double historiaLaboral;
	private double competenciaTecnica;
	private double actitud;
	
	public Candidato(String ident, String nom, String ape, char sx, double hc, double hl, double ct, double a){
		id = ident;
		nombres = nom;
		apellidos = ape;
		sexo = sx;
		habilidadesComunicacion = hc;
		historiaLaboral = hl;
		competenciaTecnica = ct;
		actitud = a;
	}
	
	public String darId() {
		return id;
	}
	
	public String darNombres() {
		return nombres;
	}
	
	public String darApellidos() {
		return apellidos;
	}
	
	public char darSexo(){
		return sexo;
	}
	
	public double darHabilidadesComunicacion() {
		return habilidadesComunicacion;
	}
	
	public double darHistoriaLaboral() {
		return historiaLaboral;
	}
	
	public double darCompetenciaTecnica() {
		return competenciaTecnica;
	}
	
	public double darActitud() {
		return actitud;
	}
	
	public void cambiarHabilidadesComunicacion(){
		habilidadesComunicacion += BONIFICACION;
		if(habilidadesComunicacion>5){
			habilidadesComunicacion = 5;
		}
	}
	
	public void cambiarHistoriaLaboral( ){
		historiaLaboral += BONIFICACION;
		if(historiaLaboral>5){
			historiaLaboral = 5;
		}
	}
	
	public void cambiarCompetenciaTecnica( ){
		competenciaTecnica += BONIFICACION;
		if(competenciaTecnica>5){
			competenciaTecnica = 5;
		}
	}
	
	public void cambiarActitud( ){
		actitud += BONIFICACION;
		if(actitud>5){
			actitud = 5;
		}
	}
	
	public double promedioDelCantidato(){
		double prom = 0;
		prom += darHabilidadesComunicacion() * SeleccionDePersonal.PESO_COMUNICACION;
		prom += darHistoriaLaboral() * SeleccionDePersonal.PESO_LABORAL;
		prom += darCompetenciaTecnica() * SeleccionDePersonal.PESO_TECNICA;
		prom += darActitud() * SeleccionDePersonal.PESO_ACTITUD;
		return prom;
	}
}
