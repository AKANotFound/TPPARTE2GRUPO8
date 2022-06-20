package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import vista.IVistaRegistrarEmpleador;
import vista.Ventana;

public class ControladorVistaRegistrarEmpleador implements ActionListener
{
	IVistaRegistrarEmpleador vista=null;
	private JPanel contentPane = null;
	private final String VOLVER = "Volver";
	private final String REGISTRAR = "Registrar";
	
	public ControladorVistaRegistrarEmpleador(IVistaRegistrarEmpleador vistaRegistrarEmpleador,JPanel contentPane)
	{
		this.vista = vistaRegistrarEmpleador;
		this.vista.setActionListener(this);
		this.contentPane=contentPane;
	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
		CardLayout cl = (CardLayout)(contentPane.getLayout());
		String comando = e.getActionCommand();
		if (comando.equals(VOLVER))
		{
			cl.show(contentPane, Ventana.VISTA_INICIAL);
		}
		else
			if (comando.equals(REGISTRAR)) //CREAR EMPLEADOR Y AÑADIRLO A LOS ARRAY CORRESPONDIENTES
			{
				cl.show(contentPane, Ventana.VISTA_INICIAL);
			}
		
	}

	
}
