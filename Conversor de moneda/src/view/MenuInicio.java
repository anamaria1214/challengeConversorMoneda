package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuInicio extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBoxConversores;
	private JButton btnSiguiente;

	public MenuInicio() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 242);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenidos");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(125, 11, 116, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccione el conversor que desee utilizar:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(33, 62, 315, 24);
		contentPane.add(lblNewLabel_1);
		
		comboBoxConversores = new JComboBox();
		comboBoxConversores.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBoxConversores.setModel(new DefaultComboBoxModel(new String[] {"Conversor de moneda", "Conversor de medidas de distancia"}));
		comboBoxConversores.setBounds(33, 112, 294, 22);
		contentPane.add(comboBoxConversores);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxConversores.getSelectedItem().toString().equals("Conversor de moneda")) {
					CantConvertirMoneda cantConvertirMoneda= new CantConvertirMoneda();
					cantConvertirMoneda.setVisible(true);
					setVisible(false);
				}else {
					CantConvertirDistancia cantDistancia= new CantConvertirDistancia();
					cantDistancia.setVisible(true);
					setVisible(false);
				}
			}
		});
		btnSiguiente.setFont(new Font("Arial", Font.PLAIN, 12));
		btnSiguiente.setBounds(238, 161, 89, 23);
		contentPane.add(btnSiguiente);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnCerrar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnCerrar.setBounds(33, 161, 89, 23);
		contentPane.add(btnCerrar);
	}
}
