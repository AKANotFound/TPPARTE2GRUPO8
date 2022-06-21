package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import entidades.Agencia;
import entidades.IRubro;
import entidades.Rubro_ComercioInternacional;
import entidades.Rubro_ComercioLocal;
import entidades.Rubro_Salud;
import excepciones.TipoPersonaInvalidoException;
import sistema.Sistema;
import vista.IVentana;
import vista.IVistaRegistrarEmpleador;
import vista.Ventana;

public class ControladorVistaRegistrarEmpleador implements ActionListener
{
	IVistaRegistrarEmpleador vista=null;
	private IVentana ventana = null;
	private JPanel contentPane = null;
	
	private final String VOLVER = "Volver";
	private final String REGISTRAR = "Registrar";
	
	public ControladorVistaRegistrarEmpleador(IVentana ventana,IVistaRegistrarEmpleador vista)
	{
		this.vista = vista;
		this.ventana = ventana;
		this.vista.setActionListener(this);
		this.contentPane=ventana.getContentPane();
		
	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
		CardLayout cl = (CardLayout)(contentPane.getLayout());
		String comando = e.getActionCommand();
		if (comando.equals(VOLVER))
		{
			
			cl.show(contentPane, ventana.getVistaInicial());
		}
		else
			if (comando.equals(REGISTRAR)) //CREAR EMPLEADOR 
			{
				try
				{
					double puntajeAspectos[]= {vista.getPuntajeCargaHoraria(),vista.getPuntajeEstudiosCursados(),
							vista.getPuntajeExperienciaPrevia(),
							vista.getPuntajeLocacion(),vista.getPuntajeRangoEtario(),vista.getPuntajeRemuneracion()
							,vista.getPuntajeTipoDePuesto()};
					IRubro rubro=null;
					switch(vista.getRubro())
					{
					 case"Salud":rubro = new Rubro_Salud();
					  break;
					 case"Comercio local":rubro = new Rubro_ComercioLocal();
					  break;
					 case"Comercio internacional":rubro = new Rubro_ComercioInternacional();
					  break;
					}
					
					Sistema.registrarEmpleador(vista.getUsuario(),vista.getContrasena()
							,vista.getRazonSocial(),vista.getTipoPersona(), rubro, puntajeAspectos);
				} catch (TipoPersonaInvalidoException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				cl.show(contentPane, ventana.getVistaInicial());
			}
		
		this.vista.limpiarVista();
		
	}

	
}
