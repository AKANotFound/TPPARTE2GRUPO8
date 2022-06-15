package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaSistema extends JFrame implements IVista
{

	private JPanel contentPane;
	private ActionListener actionListener;//el controlador

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public VentanaSistema()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
		
		this.setVisible(true);//borre main de ventana y puse esto
	}

	public void setActionListener(ActionListener actionListener)//ACA A LOS BOTONES LES AÑADO EL ACTION LISTENER
	{
		this.actionListener = actionListener;
	}
	
	

}
