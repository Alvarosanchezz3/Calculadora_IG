package InterfacesGraficas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Act2 {

	private JFrame frame;
	int cont1;
	int cont2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Act2 window = new Act2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	//  Create the application. //
	 
	public Act2() {
		initialize();
	}

	
	// Initialize the contents of the frame. //
	 
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 552, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Botón 1 //
		
		JLabel Numveces1 = new JLabel("N\u00BA de clicks: "+cont1);
		Numveces1.setHorizontalAlignment(SwingConstants.CENTER);
		Numveces1.setBounds(70, 122, 121, 14);
		frame.getContentPane().add(Numveces1);
	
		
		JButton boton1 = new JButton("Botón 1");
		boton1.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				Numveces1.setText("N\u00BA de clicks: "+cont1++ +" ");
			}
		});
		boton1.setBounds(70, 186, 121, 23);
		frame.getContentPane().add(boton1);
		
		// Botón 2 //
		
		JLabel Numveces2 = new JLabel("N\u00BA de clicks: "+cont2);
		Numveces2.setHorizontalAlignment(SwingConstants.CENTER);
		Numveces2.setBounds(303, 122, 121, 14);
		frame.getContentPane().add(Numveces2);
		
		
		JButton boton2 = new JButton("Botón 2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Numveces2.setText("N\u00BA de clicks: "+cont2++ +" ");	
			}
		});
		boton2.setBounds(303, 186, 121, 23);
		frame.getContentPane().add(boton2);
		                                                                                                                                                                                                                                                                                                                                                                                                                   
	}
}
