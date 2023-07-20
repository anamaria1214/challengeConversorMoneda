package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logic.Logica;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CantConvertirDistancia extends JFrame {

	private JPanel contentPane;
	private JTextField cantMedida;
	private JComboBox comboBoxConversor;

	public CantConvertirDistancia() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 249);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese la cantidad a convertir:");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(24, 11, 285, 24);
		contentPane.add(lblNewLabel);
		
		cantMedida = new JTextField();
		cantMedida.setBounds(24, 49, 367, 20);
		contentPane.add(cantMedida);
		cantMedida.setColumns(10);
		
		JLabel lblIngreseElTipo = new JLabel("Ingrese el tipo de conversión que desee:");
		lblIngreseElTipo.setForeground(Color.BLACK);
		lblIngreseElTipo.setFont(new Font("Arial", Font.PLAIN, 20));
		lblIngreseElTipo.setBounds(24, 80, 367, 24);
		contentPane.add(lblIngreseElTipo);
		
		comboBoxConversor = new JComboBox();
		comboBoxConversor.setModel(new DefaultComboBoxModel(new String[] {"", 
				"De metros a kilometros", 
				"De metros a centimetros", 
				"De kilómetros a metros", 
				"De kilómetros a centimetros", 
				"De centímetros a metros", 
				"De centímetros a kilometros"}));
		comboBoxConversor.setBounds(24, 115, 367, 22);
		contentPane.add(comboBoxConversor);
		
		JButton btnNewButton = new JButton("Anterior");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuInicio menu= new MenuInicio();
				menu.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.setBounds(24, 163, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setForeground(Color.BLACK);
		btnConvertir.setBackground(Color.WHITE);
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double total=0.0;
				if(Logica.isNumeric(cantMedida.getText())) {
					double valor= Double.valueOf(cantMedida.getText());
					if(comboBoxConversor.getSelectedItem().toString().equals("De metros a kilometros")) {
						total= Logica.conversionLongitud(valor,"m", "km");
						JOptionPane.showMessageDialog(null, ""+valor+" m equivalen a "+total+" km");
						setVisible(false);
						int confirmado=JOptionPane.showConfirmDialog(null,
								   "¿Deseas continuar?");
								if (JOptionPane.OK_OPTION==confirmado) {
									 setVisible(true);
								}
								else {
									JOptionPane.showMessageDialog(null, "Programa finalizado");
								}
					}else if(comboBoxConversor.getSelectedItem().toString().equals("De metros a centimetros")) {
						total= Logica.conversionLongitud(valor,"m", "cm");
						JOptionPane.showMessageDialog(null, ""+valor+" m equivalen a "+total+" cm");
						setVisible(false);
						int confirmado=JOptionPane.showConfirmDialog(null,
								   "¿Deseas continuar?");
								if (JOptionPane.OK_OPTION==confirmado) {
									 setVisible(true);
								}
								else {
									JOptionPane.showMessageDialog(null, "Programa finalizado");
								}
					}else if(comboBoxConversor.getSelectedItem().toString().equals("De kilómetros a metros")) {
						total= Logica.conversionLongitud(valor,"km", "m");
						JOptionPane.showMessageDialog(null, ""+valor+" km equivalen a "+total+" m");
						setVisible(false);
						int confirmado=JOptionPane.showConfirmDialog(null,
								   "¿Deseas continuar?");
								if (JOptionPane.OK_OPTION==confirmado) {
									 setVisible(true);
								}
								else {
									JOptionPane.showMessageDialog(null, "Programa finalizado");
								}
					}else if(comboBoxConversor.getSelectedItem().toString().equals("De kilómetros a centimetros")) {
						total= Logica.conversionLongitud(valor,"km", "cm");
						JOptionPane.showMessageDialog(null, ""+valor+" km equivalen a "+total+" cm");
						setVisible(false);
						int confirmado=JOptionPane.showConfirmDialog(null,
								   "¿Deseas continuar?");
								if (JOptionPane.OK_OPTION==confirmado) {
									 setVisible(true);
								}
								else {
									JOptionPane.showMessageDialog(null, "Programa finalizado");
								}
					}else if(comboBoxConversor.getSelectedItem().toString().equals("De centímetros a metros")) {
						total= Logica.conversionLongitud(valor,"cm", "m");
						JOptionPane.showMessageDialog(null, ""+valor+" cm equivalen a "+total+" m");
						setVisible(false);
						int confirmado=JOptionPane.showConfirmDialog(null,
								   "¿Deseas continuar?");
								if (JOptionPane.OK_OPTION==confirmado) {
									 setVisible(true);
								}
								else {
									JOptionPane.showMessageDialog(null, "Programa finalizado");
								}
					}else if(comboBoxConversor.getSelectedItem().toString().equals("De centímetros a kilometros")) {
						total= Logica.conversionLongitud(valor,"cm", "km");
						JOptionPane.showMessageDialog(null, ""+valor+" cm equivalen a "+total+" km");
						setVisible(false);
						int confirmado=JOptionPane.showConfirmDialog(null,
								   "¿Deseas continuar?");
								if (JOptionPane.OK_OPTION==confirmado) {
									 setVisible(true);
								}
								else {
									JOptionPane.showMessageDialog(null, "Programa finalizado");
								}
					}else {
						JOptionPane.showMessageDialog(null,"No seleccionó ninguna opción");
					}
				}else {
					JOptionPane.showMessageDialog(null,"El valor que ingreso no es válido");
				}
				
				
			}
		});
		btnConvertir.setFont(new Font("Arial", Font.PLAIN, 12));
		btnConvertir.setBounds(302, 163, 89, 23);
		contentPane.add(btnConvertir);
		setLocationRelativeTo(null);
	}

}
