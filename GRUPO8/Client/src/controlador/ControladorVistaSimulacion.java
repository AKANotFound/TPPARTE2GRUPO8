package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import vista.IVistaSimulacion;
import vista.Ventana;

public class ControladorVistaSimulacion implements ActionListener
{
	IVistaSimulacion vista=null;
	private JPanel contentPane = null;
	private final String VOLVER = "Volver";
	private final String INICIAR = "Iniciar";
	private final String DETENER = "Detener";
	
	
	public ControladorVistaSimulacion(IVistaSimulacion vistaSimulacion,JPanel contentPane)
	{
		this.vista = vistaSimulacion;
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
			if (comando.equals(INICIAR))
			{
				
			}
			else
				if (comando.equals(DETENER))
				{
					
				}
		
	}
}
