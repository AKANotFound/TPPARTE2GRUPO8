package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

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
			if (comando.equals(REGISTRAR)) //CREAR EMPLEADOR Y AÑADIRLO A LOS ARRAY CORRESPONDIENTES
			{
				cl.show(contentPane, ventana.getVistaInicial());
			}
		
		this.vista.actualizarComboBox();
	}

	
}
