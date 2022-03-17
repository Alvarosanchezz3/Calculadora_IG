package InterfacesGraficas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Act1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Act1 window = new Act1();
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
	public Act1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel texto = new JLabel("Escribe texto aquí:");
		texto.setHorizontalAlignment(SwingConstants.CENTER);
		texto.setBounds(98, 54, 225, 14);
		frame.getContentPane().add(texto);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(98, 79, 225, 76);
		frame.getContentPane().add(textArea);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(407, 104, 17, 48);
		frame.getContentPane().add(scrollBar);
		
		JButton Boton = new JButton("1ºBotón");
		Boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText(Boton.getText());
			}
			
		});
		Boton.setBounds(118, 166, 82, 23);
		frame.getContentPane().add(Boton);
		
		JButton Boton2 = new JButton("2ºBotón");
		Boton2.setBounds(227, 166, 82, 23);
		Boton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { // Cuando clickas en la función del "ActionListener", q es "Siguiente te pondra el mensaje del método //
				texto.setText(Boton2.getText());
				
				
			}
		});
		frame.getContentPane().add(Boton2);
	}
}
