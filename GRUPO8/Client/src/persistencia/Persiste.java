package persistencia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import entidades.Agencia;
import entidades.Contrato;
import entidades.Persona_EmpleadoPretenso;
import entidades.Persona_Empleador;

public class Persiste {
	
	private IPersistencia persistencia;
	 
	public Persiste() {
		this.persistencia = new PersistenciaXML();
	}
	
	public void persistir() {
		try {
			persistencia.abrirOutput("Prueba.xml");
			System.out.println("Crea archivo de escritura");

			persistencia.escribir(Agencia.getInstancia().getEmpleadores());
			persistencia.escribir(Agencia.getInstancia().getEmpleadosPretensos());
			persistencia.escribir(Agencia.getInstancia().getContratos());
			System.out.println("Escribe");
			persistencia.cerrarOutput();
		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}	
	
	public void leer() throws IOException {
		ArrayList<Persona_Empleador> lista = null; 
		ArrayList<Persona_EmpleadoPretenso> listaEmpleados = null;
		ArrayList<Contrato> listaContratos = new ArrayList<Contrato>();
		
		try {
			persistencia.abrirInput("Prueba.xml");
			lista = (ArrayList<Persona_Empleador>) persistencia.leer();
			listaEmpleados = (ArrayList<Persona_EmpleadoPretenso>) persistencia.leer();
			listaContratos = (ArrayList<Contrato>) persistencia.leer();
			persistencia.cerrarInput();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		/*catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//System.out.println(lista);
		//System.out.println(listaEmpleados.get(0).getTicket().getEstado());
		//System.out.println(listaContratos);
		
		Agencia.getInstancia().setEmpleadores(lista);
		Agencia.getInstancia().setEmpleadosPretensos(listaEmpleados);
		Agencia.getInstancia().setContratos(listaContratos);
		
	}
}
