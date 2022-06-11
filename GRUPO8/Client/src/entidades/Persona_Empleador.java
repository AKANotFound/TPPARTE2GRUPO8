package entidades;

import java.util.ArrayList;

import tablas.ILocacion;
import tablas.Locacion_HomeOffice;
import tablas.Locacion_Indistinto;
import tablas.Locacion_Presencial;

public class Persona_Empleador extends Persona implements Runnable {

	private String razonSocial;

    /**
     * @aggregation composite
     */
    private IRubro rubro;
    private double puntajeAspectos[]=new double[7];

    /**
     * @aggregation shared
     */
    private ArrayList<PersonaElegida> empleadosElegidos = new ArrayList<PersonaElegida>();
    private String tipoPersona;
    private ArrayList<Persona_EmpleadoPretenso>empleadosContratados=new ArrayList<Persona_EmpleadoPretenso>();
    
    private BolsaDeTrabajo bolsaDeTrabajo = BolsaDeTrabajo.getInstancia();
    
    public Persona_Empleador(Cuenta cuenta) 
    {
    	super(cuenta);
    }
     
    public void addEmpleadoContratado(Persona_EmpleadoPretenso empleado)
    {
    	empleadosContratados.add(empleado);
    }
    
    public ArrayList<Persona_EmpleadoPretenso> getEmpleadosContratados() {
		return empleadosContratados;
	}


	public void setEmpleadosContratados(ArrayList<Persona_EmpleadoPretenso> empleadosContratados) {
		this.empleadosContratados = empleadosContratados;
	}


	public Persona_Empleador(Cuenta cuenta, String razonSocial, String tipoPersona, IRubro rubro,double[] puntajeAspectos)
    {
		super(cuenta);
		this.razonSocial = razonSocial;
		this.rubro = rubro;
		this.tipoPersona = tipoPersona;
		this.puntajeAspectos=puntajeAspectos;
	}
    
	public double[] getPuntajeAspectos() {
		return puntajeAspectos;
	}
	

	public void setPuntajeAspectos(double[] puntajeAspectos) {
		this.puntajeAspectos = puntajeAspectos;
	}

	public void agregaEmpleadosElegidos (PersonaElegida personaElegida)
	{
		this.empleadosElegidos.add(personaElegida);
	}

	public ArrayList<PersonaElegida> getEmpleadosElegidos() {
		return empleadosElegidos;
	}

	public IRubro getRubro() {
		return rubro;
	}
 
	public String getTipoPersona() {
		return tipoPersona;
	}

	@Override
	public String toString() {
		return "Empleador: " + razonSocial +" "+super.toString();
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	@Override
	public void run() {
		TicketSimplificado ticketSimplificado = null;
		ILocacion locacion = null;
		IRubro rubro = null;
		int opcion = 0;
		
		for(int i = 0; i < 3; i++) {
			opcion = (int)(Math.random()*3+1);
			
			switch(opcion) {
			case 1: locacion = new Locacion_Presencial();
				break;
			case 2: locacion = new Locacion_HomeOffice();
				break;
			case 3: locacion = new Locacion_Indistinto();
				break;
			}
			
			opcion = (int)(Math.random()*3+1);
			
			switch(opcion) {
			case 1: rubro = new Rubro_ComercioLocal();
				break;
			case 2: rubro = new Rubro_ComercioInternacional();
				break;
			case 3: rubro = new Rubro_Salud();
				break;
			}
			
			ticketSimplificado = new TicketSimplificado(locacion, rubro, this);
			
			bolsaDeTrabajo.poneTicketSimplificado(ticketSimplificado);
		}
	}

	
}
