package persistencia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import entidades.Administrador;
import entidades.Agencia;
import entidades.Contrato;
import entidades.Persona_EmpleadoPretenso;
import entidades.Persona_Empleador;
import entidades.Usuario;
import excepciones.ErrorCodigoException;
import excepciones.UsuarioYaRegistradoException;
import sistema.Sistema;

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
			
            persistencia.escribir(UtilAdministrador.AdministradorDtoFromAdministrador(Administrador.getInstancia()));	// patron DTO
			persistencia.escribir(Agencia.getInstancia().getEmpleadores());
			persistencia.escribir(Agencia.getInstancia().getEmpleadosPretensos());
			persistencia.escribir(Agencia.getInstancia().getContratos());
			Agencia.getInstancia().getUsuarios().remove(Administrador.getInstancia());
            persistencia.escribir(Agencia.getInstancia().getUsuarios());
            Agencia.getInstancia().getUsuarios().put(Administrador.getInstancia().getCuenta().getUsuario(), Administrador.getInstancia());
			
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
		HashMap <String, Usuario> usuarios = new HashMap <>(); 
		AdministradorDto adminDto = null;
		
		try {
			persistencia.abrirInput("Prueba.xml");
			
			adminDto = (AdministradorDto) persistencia.leer();
			lista = (ArrayList<Persona_Empleador>) persistencia.leer();
			listaEmpleados = (ArrayList<Persona_EmpleadoPretenso>) persistencia.leer();
			listaContratos = (ArrayList<Contrato>) persistencia.leer();
			usuarios = (HashMap<String, Usuario>) persistencia.leer();
			
			persistencia.cerrarInput();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		/*catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		Administrador admin = UtilAdministrador.AdministradorFromAdministradorDto(adminDto);
		
		Agencia.getInstancia().setEmpleadores(lista);
		Agencia.getInstancia().setEmpleadosPretensos(listaEmpleados);
		Agencia.getInstancia().setContratos(listaContratos);
		Agencia.getInstancia().setUsuarios(usuarios);
		
		try {
			Sistema.registrarAdministrador(admin);
		} catch (ErrorCodigoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UsuarioYaRegistradoException e1) {
			System.out.println(e1.getMessage());
		}
		
	}
}
