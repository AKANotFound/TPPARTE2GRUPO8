package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import entidades.Agencia;
import entidades.FormularioDeBusqueda;
import tablas.CargaHoraria_Completa;
import tablas.CargaHoraria_Extendida;
import tablas.CargaHoraria_Media;
import tablas.EstudiosCursados_Primario;
import tablas.ExperienciaPrevia_Nada;
import tablas.ICargaHoraria;
import tablas.IEstudiosCursados;
import tablas.IExperienciaPrevia;
import tablas.ILocacion;
import tablas.IRangoEtario;
import tablas.IRemuneracion;
import tablas.ITipoDePuesto;
import tablas.Locacion_HomeOffice;
import tablas.Locacion_Indistinto;
import tablas.Locacion_Presencial;
import tablas.RangoEtario_De40A50;
import tablas.RangoEtario_MasDe50;
import tablas.RangoEtario_MenosDe40;
import tablas.Remuneracion_30mil;
import tablas.Remuneracion_60mil;
import tablas.Remuneracion_90mil;
import tablas.TipoDePuesto_Junior;
import tablas.TipoDePuesto_Management;
import tablas.TipoDePuesto_Senior;
import vista.IVentana;
import vista.IVistaFormularioDeBusquedaEmpleadoPretenso;

public class ControladorVistaFormularioDeBusquedaEmpleadoPretenso implements ActionListener 
{
	private IVistaFormularioDeBusquedaEmpleadoPretenso vista=null;
	private IVentana ventana = null;
	private JPanel contentPane = null;
	private final String ACEPTAR = "Aceptar";
	private final String CANCELAR = "Cancelar";
	private final String LOCACION_INDIFERENTE="Indiferente";
	private final String LOCACION_HOME_OFFICE="Home Office";
	private final String LOCACION_PRESENCIAL="Presencial";
	private final String REMUNERACION_30MIL="30 mil";
	private final String REMUNERACION_60MIL="60 mil";
	private final String REMUNERACION_90MIL="90 mil";
	private final String CARGA_HORARIA_COMPLETA="Completa";
	private final String CARGA_HORARIA_EXTENDIDA="Extendida";
	private final String CARGA_HORARIA_MEDIA="Media";
	private final String TIPO_DE_PUESTO_JUNIOR="Junior";
	private final String TIPO_DE_PUESTO_SENIOR="Senior";
	private final String TIPO_DE_PUESTO_MANAGEMENT="Management";
	private final String RANGO_ETARIO_DE_40_A_50="De 40 a 50";
	private final String RANGO_ETARIO_MENOS_DE_40="Menos de 40";
	private final String RANGO_ETARIO_MAS_DE_50="Mas de 50";
	private final String EXPERIENCIA_PREVIA_NADA="Nada";
	private final String EXPERIENCIA_PREVIA_MEDIA="Media";
	private final String EXPERIENCIA_PREVIA_MUCHA="Mucha";
	private final String ESTUDIOS_CURSADOS_PRIMARIO="Primario";
	private final String ESTUDIOS_CURSADOS_SECUNDARIO="Secundario";
	private final String ESTUDIOS_CURSADOS_TERCIARIO="Terciario";
	
	public ControladorVistaFormularioDeBusquedaEmpleadoPretenso(IVentana ventana)
	{
		super();
		this.vista = ventana.getVistaFormularioDeBusquedaEmpleadoPretenso();
		this.ventana = ventana;
		this.contentPane = ventana.getContentPane();
		this.vista.setActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		CardLayout cl = (CardLayout)(contentPane.getLayout());
		String comando = e.getActionCommand();
		
		switch(comando) {
		case ACEPTAR:
			
			ILocacion locacion=null;
			ICargaHoraria cargaHoraria=null;
			IRemuneracion remuneracion=null;
			IExperienciaPrevia experienciaPrevia=null;
			IEstudiosCursados estudiosCursados=null;
			IRangoEtario rangoEtario=null;
			ITipoDePuesto tipoDePuesto=null;
			
			switch(this.vista.getLocacion())
			{case LOCACION_INDIFERENTE:
				locacion=new Locacion_Indistinto();
				break;
			case LOCACION_HOME_OFFICE:
				locacion=new Locacion_HomeOffice();
				break;
			case LOCACION_PRESENCIAL:
				locacion=new Locacion_Presencial();
				break;		
			}
			
			switch(this.vista.getCargaHoraria())
			{case CARGA_HORARIA_COMPLETA:
				cargaHoraria=new CargaHoraria_Completa();
				break;
			case CARGA_HORARIA_MEDIA:
				cargaHoraria=new CargaHoraria_Media();
				break;
			case CARGA_HORARIA_EXTENDIDA:
				cargaHoraria=new CargaHoraria_Extendida();
				break;		
			}
			
			switch(this.vista.getRemuneracion())
			{case REMUNERACION_30MIL:
				remuneracion=new Remuneracion_30mil();
				break;
			case REMUNERACION_60MIL:
				remuneracion=new Remuneracion_60mil();
				break;
			case REMUNERACION_90MIL:
				remuneracion=new Remuneracion_90mil();
				break;		
			}
			
			switch(this.vista.getExperienciaPrevia())
			{case EXPERIENCIA_PREVIA_NADA:
				experienciaPrevia=new ExperienciaPrevia_Nada();
				break;
			case EXPERIENCIA_PREVIA_MEDIA:
				experienciaPrevia=new ExperienciaPrevia_Nada();
				break;
			case EXPERIENCIA_PREVIA_MUCHA:
				experienciaPrevia=new ExperienciaPrevia_Nada();
				break;		
			}
			
			switch(this.vista.getEstudiosCursados())
			{case ESTUDIOS_CURSADOS_PRIMARIO:
				estudiosCursados=new EstudiosCursados_Primario();
				break;
			case ESTUDIOS_CURSADOS_SECUNDARIO:
				estudiosCursados=new EstudiosCursados_Primario();
				break;
			case ESTUDIOS_CURSADOS_TERCIARIO:
				estudiosCursados=new EstudiosCursados_Primario();
				break;		
			}
			
			switch(this.vista.getRangoEtario())
			{case RANGO_ETARIO_DE_40_A_50:
				rangoEtario=new RangoEtario_De40A50();
				break;
			case RANGO_ETARIO_MENOS_DE_40:
				rangoEtario=new RangoEtario_MenosDe40();
				break;
			case RANGO_ETARIO_MAS_DE_50:
				rangoEtario=new RangoEtario_MasDe50();
				break;		
			}
			
			switch(this.vista.getTipoDePuesto())
			{case TIPO_DE_PUESTO_JUNIOR:
				tipoDePuesto=new TipoDePuesto_Junior();
				break;
			case TIPO_DE_PUESTO_SENIOR:
				tipoDePuesto=new TipoDePuesto_Senior();
				break;
			case TIPO_DE_PUESTO_MANAGEMENT:
				tipoDePuesto=new TipoDePuesto_Management();
				break;		
			}
			
			FormularioDeBusqueda form=new FormularioDeBusqueda(locacion,remuneracion,
					cargaHoraria,tipoDePuesto,rangoEtario,experienciaPrevia,estudiosCursados);
			
			Agencia.getInstancia().getFuncEmpleadoPretensoActual().crearTicket(form);
			cl.show(contentPane, ventana.getID_VistaGestionTicketPersona());
			break;
			
		case CANCELAR:	
			cl.show(contentPane, ventana.getID_VistaGestionTicketPersona());
			break;
		}
		
		this.vista.limpiarVista();
		
	}

}
