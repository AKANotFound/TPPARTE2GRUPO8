package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import vista.IVentana;
import vista.IVistaFormularioDeBusquedaEmpleador;
import vista.Ventana;



public class ControladorVistaFormularioDeBusquedaEmpleador implements ActionListener
{
	private IVistaFormularioDeBusquedaEmpleador vista=null;
	private IVentana ventana = null;
	private JPanel contentPane = null;
	private final String ACEPTAR = "Aceptar";
	private final String CANCELAR = "Cancelar";
	
	
	
	
	public ControladorVistaFormularioDeBusquedaEmpleador(IVentana ventana,IVistaFormularioDeBusquedaEmpleador vista)
	{
		super();
		this.vista = vista;
		this.ventana = ventana;
		this.contentPane = ventana.getContentPane();
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
