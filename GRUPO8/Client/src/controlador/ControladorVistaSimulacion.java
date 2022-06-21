package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import vista.IVentana;
import vista.IVistaSimulacion;
import vista.Ventana;

public class ControladorVistaSimulacion implements ActionListener
{
	IVistaSimulacion vista=null;
	private IVentana ventana = null;
	private JPanel contentPane = null;
	private final String VOLVER = "Volver";
	private final String INICIAR = "Iniciar";
	private final String DETENER = "Detener";
	
	
	public ControladorVistaSimulacion(IVentana ventana,IVistaSimulacion vistaSimulacion)
	{
		this.vista = vistaSimulacion;
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
			if (comando.equals(INICIAR))
			{
				vista.setIniciarDisabled();
			}
			else
				if (comando.equals(DETENER))
				{
					vista.setDetenerDisabled();
				}
		
	}
}
