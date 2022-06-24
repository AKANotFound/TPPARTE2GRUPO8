package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;

import entidades.ListaDeAsignacion;
import entidades.PersonaElegida;
import excepciones.ListaNoGeneradaException;

public class VistaFuncionalidadesPersona extends JPanel implements IVistaFuncionalidadesPersona {
	private JPanel panel_Centro;
	private JPanel panel_Sur;
	private JPanel panel_Norte_border;
	private JPanel panel_Norte;
	private JPanel panel_GestionDeTicket;
	private JButton btn_GestionDeTicket;
	private JPanel panel_IniciarRondaDeEleccion;
	private JButton btn_IniciarRondaDeEleccion;
	private JPanel panel_VisualizarResultado;
	private JButton btn_VisualizarResultado;
	private JPanel panel_VisualizarPersonasElegidas;
	private JButton btn_VisualizarPersonasElegidas;
	private JButton btn_Logout;
	private JButton btn_BorrarCuenta;
	private JPanel panel_LogOut;
	private JPanel panel_BorrarCuenta;
	private JPanel panel_Eleccion;
	private JPanel panel_Consola_Border;
	private JPanel panel_Eleccion_Este;
	private JButton btn_AceptarEleccion;
	private JScrollPane scrollPane_Eleccion_Centro;
	private JList<PersonaElegida> list_ListaDeAsignacion;
	private DefaultListModel<PersonaElegida>modeloLista=new DefaultListModel<PersonaElegida>();
	private JPanel panel_Eleccion_Border;
	private JScrollPane scrollPane_Consola;
	private JTextArea textArea_Consola;
	private ActionListener actionListener;//controlador
	private JFrame jFrame;
    

	/**
	 * Create the panel.
	 */
	public VistaFuncionalidadesPersona()
	{
		setLayout(new BorderLayout(0, 0));
		
		this.panel_Centro = new JPanel();
		add(this.panel_Centro, BorderLayout.CENTER);
		this.panel_Centro.setLayout(new GridLayout(2, 0, 0, 0));
		
		this.panel_Eleccion_Border = new JPanel();
		this.panel_Eleccion_Border.setBorder(new TitledBorder(null, "Eleccion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panel_Centro.add(this.panel_Eleccion_Border);
		this.panel_Eleccion_Border.setLayout(new BorderLayout(0, 0));
		
		this.panel_Eleccion = new JPanel();
		this.panel_Eleccion_Border.add(this.panel_Eleccion);
		this.panel_Eleccion.setLayout(new BorderLayout(0, 0));
		
		this.panel_Eleccion_Este = new JPanel();
		this.panel_Eleccion.add(this.panel_Eleccion_Este, BorderLayout.EAST);
		
		this.btn_AceptarEleccion = new JButton("Aceptar");
		this.btn_AceptarEleccion.setActionCommand("AceptarEleccion");
		this.panel_Eleccion_Este.add(this.btn_AceptarEleccion);
		
		this.scrollPane_Eleccion_Centro = new JScrollPane();
		this.panel_Eleccion.add(this.scrollPane_Eleccion_Centro, BorderLayout.CENTER);
		
		this.list_ListaDeAsignacion = new JList<PersonaElegida>();
		this.list_ListaDeAsignacion.setModel(modeloLista);
		this.scrollPane_Eleccion_Centro.setViewportView(this.list_ListaDeAsignacion);
		
		this.panel_Consola_Border = new JPanel();
		this.panel_Consola_Border.setBorder(new TitledBorder(null, "Consola", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panel_Centro.add(this.panel_Consola_Border);
		this.panel_Consola_Border.setLayout(new BorderLayout(0, 0));
		
		this.scrollPane_Consola = new JScrollPane();
		this.panel_Consola_Border.add(this.scrollPane_Consola);
		
		this.textArea_Consola = new JTextArea();
		this.textArea_Consola.setEditable(false);
		this.scrollPane_Consola.setViewportView(this.textArea_Consola);
		
		this.panel_Sur = new JPanel();
		add(this.panel_Sur, BorderLayout.SOUTH);
		this.panel_Sur.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_LogOut = new JPanel();
		this.panel_Sur.add(this.panel_LogOut);
		
		this.btn_Logout = new JButton("Cerrar sesi\u00F3n");
		this.btn_Logout.setActionCommand("CerrarSesion");
		this.panel_LogOut.add(this.btn_Logout);
		
		this.panel_BorrarCuenta = new JPanel();
		this.panel_Sur.add(this.panel_BorrarCuenta);
		
		this.btn_BorrarCuenta = new JButton("Borrar cuenta");
		this.btn_BorrarCuenta.setActionCommand("BorrarCuenta");
		this.panel_BorrarCuenta.add(this.btn_BorrarCuenta);
		
		
		this.panel_Norte_border = new JPanel();
		this.panel_Norte_border.setBorder(new TitledBorder(null, "Acciones ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(this.panel_Norte_border, BorderLayout.NORTH);
		
		this.panel_Norte = new JPanel();
		this.panel_Norte_border.add(this.panel_Norte);
		this.panel_Norte.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_GestionDeTicket = new JPanel();
		this.panel_Norte.add(this.panel_GestionDeTicket);
		
		this.btn_GestionDeTicket = new JButton("<html><center>Gesti\u00F3n de<br/>ticket</center></html>");
		this.btn_GestionDeTicket.setActionCommand("GestionDeTicket");
		this.panel_GestionDeTicket.add(this.btn_GestionDeTicket);
		
		this.panel_IniciarRondaDeEleccion = new JPanel();
		this.panel_Norte.add(this.panel_IniciarRondaDeEleccion);
		
		this.btn_IniciarRondaDeEleccion = new JButton("<html><center>Iniciar ronda<br/>de elecci\u00F3n</center></html>");
		this.btn_IniciarRondaDeEleccion.setActionCommand("IniciarRondaDeEleccion");
		this.panel_IniciarRondaDeEleccion.add(this.btn_IniciarRondaDeEleccion);
		
		this.panel_VisualizarResultado = new JPanel();
		this.panel_Norte.add(this.panel_VisualizarResultado);
		
		this.btn_VisualizarResultado = new JButton("<html><center>Visualizar<br/>resultado</center></html>");
		this.btn_VisualizarResultado.setActionCommand("VisualizarResultado");
		this.panel_VisualizarResultado.add(this.btn_VisualizarResultado);
		
		this.panel_VisualizarPersonasElegidas = new JPanel();
		this.panel_Norte.add(this.panel_VisualizarPersonasElegidas);
		
		this.btn_VisualizarPersonasElegidas = new JButton("<html><center>Visualizar<br/>personas elegidas</center></html>");
		this.btn_VisualizarPersonasElegidas.setActionCommand("VisualizarPersonasElegidas");
		this.panel_VisualizarPersonasElegidas.add(this.btn_VisualizarPersonasElegidas);

		
	}

	@Override
	public void setActionListener(ActionListener actionListener) {
		this.btn_BorrarCuenta.addActionListener(actionListener);
		this.btn_Logout.addActionListener(actionListener);
		this.btn_AceptarEleccion.addActionListener(actionListener);
		this.btn_IniciarRondaDeEleccion.addActionListener(actionListener);
		this.btn_VisualizarPersonasElegidas.addActionListener(actionListener);
		this.btn_VisualizarResultado.addActionListener(actionListener);
		this.btn_GestionDeTicket.addActionListener(actionListener);
		this.actionListener=actionListener;
	}
	
	@Override
	public void setTextVista(String texto) {
		this.textArea_Consola.setText(texto);
	}

	@Override
	public int ventanaEmergenteConfirmar(String mensaje)
	{
		return  JOptionPane.showConfirmDialog(jFrame,mensaje);
	}

	@Override
	public void visualizarListaDeAsignacion(ListaDeAsignacion listaDeAsignacion) throws ListaNoGeneradaException
	{
		if (listaDeAsignacion==null)
			throw new ListaNoGeneradaException();
		
		ArrayList<PersonaElegida>lista=listaDeAsignacion.getLista();
		
		for (int i=0;i<lista.size();i++)
		{
			this.modeloLista.addElement(lista.get(i));
			
		}
	}

	@Override
	public ArrayList<PersonaElegida> getPersonasElegidas() throws ListaNoGeneradaException 
	{
		ArrayList<PersonaElegida>personasElegidas=null;
		if (this.list_ListaDeAsignacion.getSelectedValuesList().isEmpty())
			throw new ListaNoGeneradaException();
		personasElegidas=(ArrayList<PersonaElegida>) this.list_ListaDeAsignacion.getSelectedValuesList();
		
		return personasElegidas;
	}

	@Override
	public void ventanaEmergente(String mensaje) {
		JOptionPane.showMessageDialog(null,mensaje);
	}
}
