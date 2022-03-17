package InterfacesGraficas; 

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Act3_IMC {


    private JFrame frame;
    double altura;
    double peso;
    ImplemIMC_3 persona = new ImplemIMC_3(peso, altura);
    private JTextField Fpeso;
    private JTextField Faltura;
    private JButton calcular;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Act3_IMC window = new Act3_IMC();
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
    public Act3_IMC() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel Limc = new JLabel("IMC:");
        Limc.setHorizontalAlignment(SwingConstants.LEFT);
        Limc.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Limc.setBounds(26, 154, 398, 45);
        frame.getContentPane().add(Limc);
        
        Fpeso = new JTextField();
        Fpeso.setBounds(36, 47, 106, 20);
        frame.getContentPane().add(Fpeso);
        Fpeso.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Introduzca su peso:");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(36, 22, 106, 14);
        frame.getContentPane().add(lblNewLabel);
        
        Faltura = new JTextField();
        Faltura.setBounds(282, 47, 106, 20);
        frame.getContentPane().add(Faltura);
        Faltura.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("Introduzca su altura:");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(282, 22, 106, 14);
        frame.getContentPane().add(lblNewLabel_1);
        
        calcular = new JButton("CALCULAR");
        calcular.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                persona.setPeso(Double.valueOf(Fpeso.getText()));
                persona.setAltura(Double.valueOf(Faltura.getText()));
                Limc.setText("IMC:" + persona.calcularimc());
            }
            
        });
        calcular.setBounds(140, 96, 146, 31);
        frame.getContentPane().add(calcular);
        
        
    }
}