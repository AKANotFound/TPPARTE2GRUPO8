package persistencia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import entidades.Agencia;
import entidades.Contrato;
import entidades.Persona_EmpleadoPretenso;
import entidades.Persona_Empleador;
import entidades.Usuario;

public class Persiste {
	
	private IPersistencia persistencia = new PersistenciaXML();
	private static Persiste instancia = null;
	

	public static Persiste getInstancia() {
		if(instancia == null)
			instancia = new Persiste();
		return instancia;
	}
	
	public void persistir() {
		try {
			persistencia.abrirOutput("Prueba.xml");
			System.out.println("Crea archivo de escritura");

			persistencia.escribir(Agencia.getInstancia().getEmpleadores());
			persistencia.escribir(Agencia.getInstancia().getEmpleadosPretensos());
			persistencia.escribir(Agencia.getInstancia().getContratos());
			persistencia.escribir(Agencia.getInstancia().getUsuarios());
			
			System.out.println("Escribe");
			persistencia.cerrarOutput();
		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}	
	
	public void leer() {
		ArrayList<Persona_Empleador> lista = null; 
		ArrayList<Persona_EmpleadoPretenso> listaEmpleados = null;
		ArrayList<Contrato> listaContratos = new ArrayList<Contrato>();
		HashMap <String, Usuario> usuarios = new HashMap <>(); 
		
		try {
			persistencia.abrirInput("Prueba.xml");
			lista = (ArrayList<Persona_Empleador>) persistencia.leer();
			listaEmpleados = (ArrayList<Persona_EmpleadoPretenso>) persistencia.leer();
			listaContratos = (ArrayList<Contrato>) persistencia.leer();
			usuarios = (HashMap<String, Usuario>) persistencia.leer();
			
			persistencia.cerrarInput();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(Agencia.getInstancia().getUsuarios());
		System.out.println(usuarios);
		Agencia.getInstancia().setEmpleadores(lista);
		Agencia.getInstancia().setEmpleadosPretensos(listaEmpleados);
		Agencia.getInstancia().setContratos(listaContratos);
		Agencia.getInstancia().setUsuarios(usuarios);
		
	}
}
