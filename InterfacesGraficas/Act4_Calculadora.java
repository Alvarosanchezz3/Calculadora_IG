package InterfacesGraficas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Act4_Calculadora extends Implem_Calculadora{

	private JFrame frame;
	private double num1;
	private double num2;
	private String operador;
//	private Implem_Calculadora result = new Implem_Calculadora(); // También se puede hacer extends Implem_Calculadora //

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Act4_Calculadora window = new Act4_Calculadora();
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
	public Act4_Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 350, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 334, 118);
		panel.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel txtOperacion = new JLabel("");
		txtOperacion.setHorizontalAlignment(SwingConstants.RIGHT);
		txtOperacion.setFont(new Font("Arial", Font.BOLD, 17));
		txtOperacion.setBounds(10, 11, 314, 33);
		panel.add(txtOperacion);
		
		JLabel txtResultado = new JLabel("");
		txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResultado.setFont(new Font("Arial", Font.BOLD, 36));
		txtResultado.setBounds(10, 54, 314, 43);
		panel.add(txtResultado);
		
		// Otros botones //
		
		JButton Boton_C = new JButton("C");
		Boton_C.setBounds(33, 140, 49, 47);
		frame.getContentPane().add(Boton_C);
		Boton_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText("");
			}
		});
		
		JButton Boton_punto = new JButton(".");
		Boton_punto.setBounds(111, 421, 49, 47);
		frame.getContentPane().add(Boton_punto);
		Boton_punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(txtOperacion.getText()+".");
			}
		});
		
		JButton Boton_div = new JButton("/");
		Boton_div.setBounds(111, 140, 49, 47);
		frame.getContentPane().add(Boton_div);
		Boton_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.valueOf(txtOperacion.getText());
				txtOperacion.setText("");
				operador = "/";
			}
		});
		
		JButton Boton_resta = new JButton("-");
		Boton_resta.setBounds(253, 140, 49, 119);
		frame.getContentPane().add(Boton_resta);
		Boton_resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.valueOf(txtOperacion.getText());
				txtOperacion.setText("");
				operador = "-";
			}
		});
		
		JButton Boton_mult = new JButton("X");
		Boton_mult.setBounds(180, 140, 49, 47);
		frame.getContentPane().add(Boton_mult);
		Boton_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.valueOf(txtOperacion.getText());
				txtOperacion.setText("");
				operador = "*";
			}
		});
		
		JButton Boton_suma = new JButton("+");
		Boton_suma.setBounds(253, 281, 49, 116);
		frame.getContentPane().add(Boton_suma);
		Boton_suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.valueOf(txtOperacion.getText());
				txtOperacion.setText("");
				operador = "+";
			}
		});
		
		JButton Boton_igual = new JButton("=");
		Boton_igual.setBounds(180, 421, 122, 47);
		frame.getContentPane().add(Boton_igual);
		Boton_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Double.parseDouble(txtOperacion.getText());
				
				if (operador.equals("+")) {
					txtResultado.setText(String.valueOf(suma(num1, num2)));
					
				} else if (operador.equals("-")) {
					txtResultado.setText(String.valueOf(resta(num1, num2)));
					
				}  else if (operador.equals("*")) {
					txtResultado.setText(String.valueOf(mult(num1, num2)));
					
				} else if (operador.equals("/")) {
					txtResultado.setText(String.valueOf(div(num1, num2)));
				}
			}
		});
		
		// Números //
		
		JButton Boton0 = new JButton("0");
		Boton0.setBounds(33, 421, 49, 47);
		frame.getContentPane().add(Boton0);
		Boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(txtOperacion.getText()+"0");
			}
		});
		
		JButton Boton1 = new JButton("1");
		Boton1.setBounds(33, 350, 49, 47);
		frame.getContentPane().add(Boton1);
		Boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(txtOperacion.getText()+"1");
			}
		});
		
		JButton Boton2 = new JButton("2");
		Boton2.setBounds(111, 350, 49, 47);
		frame.getContentPane().add(Boton2);
		Boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(txtOperacion.getText()+"2");
			}
		});
		
		JButton Boton3 = new JButton("3");
		Boton3.setBounds(180, 350, 49, 47);
		frame.getContentPane().add(Boton3);
		Boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(txtOperacion.getText()+"3");
			}
		});
		
		JButton Boton4 = new JButton("4");
		Boton4.setBounds(33, 281, 49, 47);
		frame.getContentPane().add(Boton4);
		Boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(txtOperacion.getText()+"4");
			}
		});
		
		JButton Boton5 = new JButton("5");
		Boton5.setBounds(111, 281, 49, 47);
		frame.getContentPane().add(Boton5);
		Boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(txtOperacion.getText()+"5");
			}
		});
		
		JButton Boton6 = new JButton("6");
		Boton6.setBounds(180, 281, 49, 47);
		frame.getContentPane().add(Boton6);
		Boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(txtOperacion.getText()+"6");
			}
		});
		
		JButton Boton7 = new JButton("7");
		Boton7.setBounds(33, 209, 49, 47);
		frame.getContentPane().add(Boton7);
		Boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(txtOperacion.getText()+"7");
			}
		});
		
		JButton Boton8 = new JButton("8");
		Boton8.setBounds(111, 209, 49, 47);
		frame.getContentPane().add(Boton8);
		Boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(txtOperacion.getText()+"8");
			}
		});
		
		JButton Boton9 = new JButton("9");
		Boton9.setBounds(180, 209, 49, 47);
		frame.getContentPane().add(Boton9);
		Boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperacion.setText(txtOperacion.getText()+"9");
			}
		});
		
	}
}
