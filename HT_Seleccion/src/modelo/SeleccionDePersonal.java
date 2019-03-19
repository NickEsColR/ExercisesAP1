package modelo;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Entidad que representa la sección de recursos humanos encargado de hacer la selección de personal
 */
public class SeleccionDePersonal {
	public final static int MAX_ZONAS = ZonaReclutamiento.PAISES.length;
	
	public final static double PESO_COMUNICACION=0.30;
	public final static double PESO_LABORAL=0.15;
	public final static double PESO_TECNICA=0.35;
	public final static double PESO_ACTITUD=0.2;
	
	public final static double UMBRAL = 3.5;
	
	private ZonaReclutamiento[] zonasRecluta;
	
	public SeleccionDePersonal(){
		zonasRecluta = new ZonaReclutamiento[MAX_ZONAS]; 
	}
	
	public void agregarNuevaZona(int k, String nombrePais){
		zonasRecluta[k] = new ZonaReclutamiento(nombrePais);
	}
	
	public void agregarCandidato(int k, String ident, String nom, String ape, char sx, double hc, double hl, double ct, double a){
		zonasRecluta[k].agregarCandidato(ident, nom, ape, sx, hc, hl, ct, a);
	}
	
	
	public double calcularCalificacionCandidato(Candidato cand){
		//TODO
		return 0;
	}
	
	public int contarCandidatos(){
		//TODO
		int candidatos = 0;
		for (int i = 0; i < MAX_ZONAS;i++){
			candidatos += zonasRecluta[i]. contarCandidatos( ) ;
		}
		return candidatos;
	}
	
	public ZonaReclutamiento encontrarZonaConMasCandidatosSuperanUmbral(){
		//TODO
		ZonaReclutamiento mayor = null;
		mayor = zonasRecluta[0];
		for (int i = 1; i < MAX_ZONAS; i++){
			if(zonasRecluta[i].contarCandidatosSuperanUmbral() > mayor.contarCandidatosSuperanUmbral())
				mayor = zonasRecluta[i];
		}
		return mayor;
	}
		
	
	public double calcularPorcentajeTotalMujeres(){
		//TODO
		double prom = 0;
		for(int i = 0; i < MAX_ZONAS;i++){
			prom += zonasRecluta[i].promedioDeMujeres();
		}
		prom /= MAX_ZONAS;
		return prom;
	}
	
	public int calcularTotalCandidatos(){
		//TODO
		return 0;
	}
	
	public double calcularPromedioTotalCandidatos(){
		//TODO
		double prom = 0;
		for (int i = 0; i < MAX_ZONAS; i++){
			prom += zonasRecluta[i].contarPromedioDeCandidatos();
		}
		prom /= MAX_ZONAS;
		return prom;
	}
	
	public void hacerFiltradoEspecial(){
		for(int i = 0;i<MAX_ZONAS;i++)
		{
			zonasRecluta[i].filtrarPorActitud();
			zonasRecluta[i].aplicarBonificacion();
			zonasRecluta[i].filtrarPorPromedio();
		}		//TODO
		
	}
	
	public ZonaReclutamiento[] darZonaReclutamientos(){
		return zonasRecluta;
		
	}
}
