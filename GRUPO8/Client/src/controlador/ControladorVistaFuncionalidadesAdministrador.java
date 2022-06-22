package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import entidades.Agencia;
import vista.IVentana;
import vista.IVistaFuncionalidadesAdministrador;
import vista.Ventana;



public class ControladorVistaFuncionalidadesAdministrador implements ActionListener
{
	IVistaFuncionalidadesAdministrador vista=null;
	private IVentana ventana = null;
	private JPanel contentPane = null;
	
	private final String INICIAR_RONDA_DE_ENCUENTROS_LABORALES = "IniciarRondaDeEncuentrosLaborales";
	private final String INICIAR_RONDA_DE_CONTRATACION = "IniciarRondaDeContratacion";
	private final String EMPLEADOS_PRETENSOS = "EmpleadosPretensos";
	private final String TICKETS_EMPLEADOS_PRETENSOS = "TicketsEmpleadosPretensos";
	private final String EMPLEADORES = "Empleadores";
	private final String TICKETS_EMPLEADORES= "TicketsEmpleadores";
	private final String CUENTAS = "Cuentas";
	private final String LOGINS = "Logins";
	private final String CONTRATOS = "Contratos";
	private final String CERRAR_SESION = "CerrarSesion";
	private final String BORRAR_CUENTA = "BorrarCuenta";
	
	public ControladorVistaFuncionalidadesAdministrador(IVentana ventana,IVistaFuncionalidadesAdministrador vista)
	{
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
		if (comando.equals(CERRAR_SESION))
		{
			cl.show(contentPane, ventana.getVistaInicial());
		}
		else
			if (comando.equals(BORRAR_CUENTA)) //HACER POP UP DE SI ESTA SEGURO
			{
				JFrame jFrame = new JFrame();
				int result = JOptionPane.showConfirmDialog(jFrame, "¿Estás seguro de que deseas eliminar tu cuenta?");
		        if (result == 0) 
		        {
		        	Agencia.getInstancia().getUsuarios().remove(Agencia.getInstancia().getUsuarioActual());
		        	cl.show(contentPane, ventana.getVistaInicial());
		        }
			}
			else
				if (comando.equals(INICIAR_RONDA_DE_ENCUENTROS_LABORALES))
				{
					
				}
				else
					if (comando.equals(INICIAR_RONDA_DE_CONTRATACION))
					{
						
					}
					else
						if (comando.equals(EMPLEADOS_PRETENSOS))
						{
							
						}
						else
							if (comando.equals(TICKETS_EMPLEADOS_PRETENSOS))
							{
								
							}
							else
								if (comando.equals(EMPLEADORES))
								{
									
								}
								else
									if (comando.equals(TICKETS_EMPLEADORES))
									{
										
									}
									else
										if (comando.equals(CUENTAS))
										{
											
										}
										else
											if (comando.equals(LOGINS))
											{
												
											}
											else
												if (comando.equals(CONTRATOS))
												{
													
												}
	}

}
