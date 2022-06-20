package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import vista.IVistaFormularioDeBusquedaEmpleadoPretenso;

public class ControladorVistaFormularioDeBusquedaEmpleadoPretenso implements ActionListener 
{
	private IVistaFormularioDeBusquedaEmpleadoPretenso vista=null;
	private JPanel contentPane = null;
	private final String VOLVER = "Volver";
	private final String REGISTRAR = "Registrar";
	
	
	public ControladorVistaFormularioDeBusquedaEmpleadoPretenso(IVistaFormularioDeBusquedaEmpleadoPretenso vista,
			JPanel contentPane)
	{
		super();
		this.vista = vista;
		this.contentPane = contentPane;
		this.vista.setActionListener(this);
	}







	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		
	}

}
