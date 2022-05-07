package entidades;

import java.util.ArrayList;

public class Persona_Empleador extends Persona {

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

	
}
