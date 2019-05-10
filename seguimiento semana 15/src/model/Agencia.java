package model;

/**
* NICOLAS ESTEBAN COLMENARES RUIZ
* UNIVERSIDAD ICESI 
* SEGUIMIENTO SEMANA 15
* 10/05/2019
*/
import java.util.ArrayList;

public class Agencia{
	
	//relations
	
	private ArrayList<Cliente> clientes;
	
	public Agencia(){
		clientes = new ArrayList<Cliente>();
	}
	
	ArrayList<Clientes> darClientes(){
		ArrayList<Clientes> c = new ArrayList<Cliente>();
		for(int i = 0;i < clientes.size();i++){
			c.add(clientes.get(i));
		}
		return c;
	}
	
	void adicionarCliente(Cliente newCliente){
		boolean existe = false;
		for(int i = 0;i < clientes.size() && !existe;i++){
			if(clientes.get(i).igualACliente(newCliente.darId())){
				existe = true;
			}
		}
		if(existe){
			
		}
		else
			clientes.add(newCliente);
	}
	
	Cliente buscarCliente(String id){
		boolean find = false;
		Cliente aBuscar = null;
		for(int i = 0;i < clientes.size() && !find;i++){
			if(clientes.get(i).igualACliente(id)){
				find = true;
				aBuscar = clientes.get(i);
			}
		}
		return aBuscar;
	}
	
	String listarSegunNivel(char nivel){
		String msj = "";
		for(int i = 0;i < clientes.size();i++){
			if(clientes.get(i).getClass() .equals(Deportista)){
				if(clientes.get(i).darNivel() == nivel){
					msj += clientes.get(i).toString();
				}
			}
		}
		return msj;
	}
}