package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.border.TitledBorder;

public class VistaGestionTicketPersona extends JPanel implements IVistaGestionTicketPersona {
	private JPanel panel_Sur;
	private JButton btn_Volver;
	private JPanel panel_Centro_Border;
	private JPanel panel_Centro;
	private JButton btn_CrearTicket;
	private JButton btn_ActivarTicket;
	private JButton btn_SuspenderTicket;
	private JButton btn_CancelarTicket;
	private JButton btn_ModificarTicket;
	private JPanel panel_CrearTicket;
	private JPanel panel_ActivarTicket;
	private JPanel panel_SuspenderTicket;
	private JPanel panel_CancelarTicket;
	private JPanel panel_ModificarTicket;
	private ActionListener actionListener;//controlador

	/**
	 * Create the panel.
	 */
	public VistaGestionTicketPersona() {
		setLayout(new BorderLayout(0, 0));
		
		this.panel_Sur = new JPanel();
		add(this.panel_Sur, BorderLayout.SOUTH);
		
		this.btn_Volver = new JButton("Volver");
		this.panel_Sur.add(this.btn_Volver);
		
		this.panel_Centro_Border = new JPanel();
		add(this.panel_Centro_Border, BorderLayout.CENTER);
		this.panel_Centro_Border.setLayout(new BorderLayout(0, 0));
		
		this.panel_Centro = new JPanel();
		this.panel_Centro.setBorder(new TitledBorder(null, "Gesti\u00F3n de ticket", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panel_Centro_Border.add(this.panel_Centro);
		this.panel_Centro.setLayout(new GridLayout(5, 1, 0, 0));
		
		this.panel_CrearTicket = new JPanel();
		this.panel_Centro.add(this.panel_CrearTicket);
		
		this.btn_CrearTicket = new JButton("Crear");
		this.panel_CrearTicket.add(this.btn_CrearTicket);
		
		this.panel_ActivarTicket = new JPanel();
		this.panel_Centro.add(this.panel_ActivarTicket);
		
		this.btn_ActivarTicket = new JButton("Activar");
		this.panel_ActivarTicket.add(this.btn_ActivarTicket);
		
		this.panel_SuspenderTicket = new JPanel();
		this.panel_Centro.add(this.panel_SuspenderTicket);
		
		this.btn_SuspenderTicket = new JButton("Suspender");
		this.panel_SuspenderTicket.add(this.btn_SuspenderTicket);
		
		this.panel_CancelarTicket = new JPanel();
		this.panel_Centro.add(this.panel_CancelarTicket);
		
		this.btn_CancelarTicket = new JButton("Cancelar");
		this.panel_CancelarTicket.add(this.btn_CancelarTicket);
		
		this.panel_ModificarTicket = new JPanel();
		this.panel_Centro.add(this.panel_ModificarTicket);
		
		this.btn_ModificarTicket = new JButton("Modificar");
		this.panel_ModificarTicket.add(this.btn_ModificarTicket);

	}

	@Override
	public void setActionListener(ActionListener actionListener) {
		this.btn_ActivarTicket.addActionListener(actionListener);
		this.btn_CancelarTicket.addActionListener(actionListener);
		this.btn_CrearTicket.addActionListener(actionListener);
		this.btn_ModificarTicket.addActionListener(actionListener);
		this.btn_SuspenderTicket.addActionListener(actionListener);
		this.btn_Volver.addActionListener(actionListener);
		this.actionListener=actionListener;
	}

}
