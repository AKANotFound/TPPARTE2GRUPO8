package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import vista.IVentana;
import vista.IVistaFormularioDeBusquedaEmpleadoPretenso;
import vista.Ventana;

public class ControladorVistaFormularioDeBusquedaEmpleadoPretenso implements ActionListener 
{
	private IVistaFormularioDeBusquedaEmpleadoPretenso vista=null;
	private IVentana ventana = null;
	private JPanel contentPane = null;
	private final String ACEPTAR = "Aceptar";
	private final String CANCELAR = "Cancelar";
	
	
	
	public ControladorVistaFormularioDeBusquedaEmpleadoPretenso(IVentana ventana,IVistaFormularioDeBusquedaEmpleadoPretenso vista,
			JPanel contentPane)
	{
		super();
		this.vista = vista;
		this.ventana = ventana;
		this.contentPane = contentPane;
		this.vista.setActionListener(this);
	}




	@Override
	public void actionPerformed(ActionEvent e)
	{
		CardLayout cl = (CardLayout)(contentPane.getLayout());
		String comando = e.getActionCommand();
		
		if(comando.equals(ACEPTAR)) 
		{
			cl.show(contentPane, ventana.getVistaGestionTicketPersona());
		}
		else
			if(comando.equals(CANCELAR)) 
			{
				cl.show(contentPane, ventana.getVistaGestionTicketPersona());
			}
		
		this.vista.actualizarComboBox();
		
	}

}
