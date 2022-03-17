package InterfacesGraficas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class Act5_Traductor {

	private JFrame frame;
	private JTextField traduccion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Act5_Traductor window = new Act5_Traductor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Act5_Traductor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 516, 468);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTraductorDeGoogle = new JLabel("Traductor de google");
		lblTraductorDeGoogle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTraductorDeGoogle.setBounds(180, 21, 133, 20);
		frame.getContentPane().add(lblTraductorDeGoogle);
		
		JComboBox<?> Palabras = new JComboBox();
		Palabras.setModel(new DefaultComboBoxModel(new String[] {"Cocodrilo", "Elefante", "Leon", "Hiena", "Avestruz"}));
		Palabras.setBounds(59, 110, 133, 20);
		frame.getContentPane().add(Palabras);
		Palabras.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	
	            	String palabra = (String)Palabras.getSelectedItem();
	            	
	            	traduccion.setText(HashMap_traductor.mapa(palabra));
	            }
	        });
		
		
		JLabel lblPalabrasATraducir = new JLabel("Palabras a traducir:");
		lblPalabrasATraducir.setHorizontalAlignment(SwingConstants.CENTER);
		lblPalabrasATraducir.setBounds(59, 85, 133, 14);
		frame.getContentPane().add(lblPalabrasATraducir);
		
		traduccion = new JTextField();
		traduccion.setBounds(302, 110, 133, 20);
		frame.getContentPane().add(traduccion);
		traduccion.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Traducci\u00F3n:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(302, 85, 133, 14);
		frame.getContentPane().add(lblNewLabel);
	}
}
