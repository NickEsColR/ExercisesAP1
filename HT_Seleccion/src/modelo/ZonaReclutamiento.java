package modelo;

import java.util.ArrayList;

/**
 * Entidad que representa una zona geográfica de reclutamiento de personal
 */
public class ZonaReclutamiento {
	public final static String[] PAISES = {"COLOMBIA","VENEZUELA","ARGENTINA","BRASIL","MÉXICO","CHILE"};
	
	public final static char FEMENINO = 'F';
	public final static char MASCULINO = 'M';
	
	private String pais;
	
	private ArrayList<Candidato> candidatos;
	
	public ZonaReclutamiento(String p) {
		pais = p;
		candidatos = new ArrayList<>();
	}
	
	public void agregarCandidato(String ident, String nom, String ape, char sx, double hc, double hl, double ct, double a){
		Candidato nuevo = new Candidato(ident, nom, ape, sx, hc, hl, ct, a);
		candidatos.add(nuevo);
	}
	
	public int contarCandidatosSuperanUmbral(){
		int prom = 0;
		//TODO
		for (int i = 1; i < candidatos.size();i++){
			if (candidatos.get(i).promedioDelCantidato() > SeleccionDePersonal.UMBRAL)
				prom++;
		}
		return prom;
	}
	
	public void filtrarPorActitud(){
		//TODO
		for (int i = 0;i<candidatos.size();i++){
			if (candidatos.get(i).darActitud()<SeleccionDePersonal.UMBRAL){
				candidatos.remove(i);
			}
			
		}
	}
	
	public void aplicarBonificacion(){
		//TODO
		for (int i = 0;i<candidatos.size();i++){
			candidatos.get(i).cambiarHabilidadesComunicacion();
			candidatos.get(i). cambiarHistoriaLaboral( );
			candidatos.get(i).cambiarCompetenciaTecnica( );
			candidatos.get(i).cambiarActitud( );
		}
	}
	public void filtrarPorPromedio(){
		for (int i = 0;i<candidatos.size();i++){
			if(candidatos.get(i).promedioDelCantidato()<=SeleccionDePersonal.UMBRAL){
				candidatos.remove(i);
			}
		}
	}
	
	public ArrayList<Candidato> darCandidatos(){
		return candidatos;
	}
	
	public String darPais(){
		return pais;
	}

	public int contarCandidatos( ) {
		//TODO	
		return candidatos.size();
	}
	public double contarPromedioDeCandidatos(){
		double prom = 0;
		for(int i = 0; i < candidatos.size();i++){
			prom += i;
		}
		prom /= candidatos.size();
		return prom;
	}
	public double promedioDeMujeres(){
		double prom = 0;
		for (int i = 0; i < candidatos.size();i++){
		if(candidatos.get(i).darSexo() == FEMENINO)
			prom ++;
		}
		prom /= candidatos.size();
		return prom;
	}
}
