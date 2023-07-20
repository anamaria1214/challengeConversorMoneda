package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logic.Logica;
import logic.Moneda;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CantConvertirMoneda extends JFrame {

	private JPanel contentPane;
	private JTextField cantDinero;
	private JComboBox comboBoxOpciones;

	public CantConvertirMoneda() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 253);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese la cantidad de dinero a convertir:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(25, 11, 388, 24);
		contentPane.add(lblNewLabel);
		
		cantDinero = new JTextField();
		cantDinero.setBounds(25, 57, 424, 20);
		contentPane.add(cantDinero);
		cantDinero.setColumns(10);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double total=0.0;
				if(Logica.isNumeric(cantDinero.getText())) {
					if(comboBoxOpciones.getSelectedItem().toString().equals("Convertir de peso Colombiano a Dólar")) {
						Moneda dolar= new Moneda(3978.17);
						total=Logica.dePesoColAMoneda(Double.valueOf(cantDinero.getText()), dolar, 1);
						JOptionPane.showMessageDialog(null, "La cantidad de "+cantDinero.getText()+" pesos colombianos corresponde"
								+ " a "+total+" dolares");
						setVisible(false);
						int confirmado=JOptionPane.showConfirmDialog(null,
								   "¿Deseas continuar?");
								if (JOptionPane.OK_OPTION==confirmado) {
									 setVisible(true);
								}
								else {
									JOptionPane.showMessageDialog(null, "Programa finalizado");
								}
					}else if(comboBoxOpciones.getSelectedItem().toString().equals("Convertir de peso Colombiano  a Euros")) {
						Moneda euro= new Moneda(4427.90);
						total=Logica.dePesoColAMoneda(Double.valueOf(cantDinero.getText()), euro, 1);
						JOptionPane.showMessageDialog(null, "La cantidad de "+cantDinero.getText()+" pesos colombianos corresponde"
								+ " a "+total+" euros");
						setVisible(false);
						int confirmado=JOptionPane.showConfirmDialog(null,
								   "¿Deseas continuar?");
								if (JOptionPane.OK_OPTION==confirmado) {
									 setVisible(true);
								}
								else {
									JOptionPane.showMessageDialog(null, "Programa finalizado");
								}
					}else if(comboBoxOpciones.getSelectedItem().toString().equals("Convertir de peso Colombiano  a Libras Esterlinas")) {
						Moneda libra= new Moneda(5117.18);
						total=Logica.dePesoColAMoneda(Double.valueOf(cantDinero.getText()), libra, 1);
						JOptionPane.showMessageDialog(null, "La cantidad de "+cantDinero.getText()+" pesos colombianos corresponde"
								+ " a "+total+" libras esterlinas");
						setVisible(false);
						int confirmado=JOptionPane.showConfirmDialog(null,
								   "¿Deseas continuar?");
								if (JOptionPane.OK_OPTION==confirmado) {
									 setVisible(true);
								}
								else {
									JOptionPane.showMessageDialog(null, "Programa finalizado");
								}
					}else if(comboBoxOpciones.getSelectedItem().toString().equals("Convertir de peso Colombiano  a Yen Japonés")) {
						Moneda yen = new Moneda(28.37);
						total=Logica.dePesoColAMoneda(Double.valueOf(cantDinero.getText()),yen, 1);
						JOptionPane.showMessageDialog(null, "La cantidad de "+cantDinero.getText()+" pesos colombianos corresponde"
								+ " a "+total+" yenes japoneses");
						setVisible(false);
						int confirmado=JOptionPane.showConfirmDialog(null,
								   "¿Deseas continuar?");
								if (JOptionPane.OK_OPTION==confirmado) {
									 setVisible(true);
								}
								else {
									JOptionPane.showMessageDialog(null, "Programa finalizado");
								}
					}else if(comboBoxOpciones.getSelectedItem().toString().equals("Convertir de peso Colombiano  a Won sul-coreano")) {
						Moneda won = new Moneda(3.12);
						total=Logica.dePesoColAMoneda(Double.valueOf(cantDinero.getText()),won, 1);
						JOptionPane.showMessageDialog(null, "La cantidad de "+cantDinero.getText()+" pesos colombianos corresponde"
								+ " a "+total+" wones surcoreanos");
						setVisible(false);
						int confirmado=JOptionPane.showConfirmDialog(null,
								   "¿Deseas continuar?");
								if (JOptionPane.OK_OPTION==confirmado) {
									 setVisible(true);
								}
								else {
									JOptionPane.showMessageDialog(null, "Programa finalizado");
								}
					}else if(comboBoxOpciones.getSelectedItem().toString().equals("Convertir de Dólar a peso Colombiano")) {
						Moneda dolar= new Moneda(3978.17);
						total=Logica.dePesoColAMoneda(Double.valueOf(cantDinero.getText()), dolar, 2);
						JOptionPane.showMessageDialog(null, "La cantidad de "+cantDinero.getText()+" dolares corresponde"
								+ " a "+total+" pesos colombianos");
						setVisible(false);
						int confirmado=JOptionPane.showConfirmDialog(null,
								   "¿Deseas continuar?");
								if (JOptionPane.OK_OPTION==confirmado) {
									 setVisible(true);
								}
								else {
									JOptionPane.showMessageDialog(null, "Programa finalizado");
								}
					}else if(comboBoxOpciones.getSelectedItem().toString().equals("Convertir de Euros a peso Colombiano")) {
						Moneda euro= new Moneda(4427.90);
						total=Logica.dePesoColAMoneda(Double.valueOf(cantDinero.getText()), euro, 2);
						JOptionPane.showMessageDialog(null, "La cantidad de "+cantDinero.getText()+" euros corresponde"
								+ " a "+total+" pesos colombianos");
						setVisible(false);
						int confirmado=JOptionPane.showConfirmDialog(null,
								   "¿Deseas continuar?");
								if (JOptionPane.OK_OPTION==confirmado) {
									 setVisible(true);
								}
								else {
									JOptionPane.showMessageDialog(null, "Programa finalizado");
								}
					}else if(comboBoxOpciones.getSelectedItem().toString().equals("Convertir de Libras Esterlinas a peso Colombiano")) {
						Moneda libra= new Moneda(5117.18);
						total=Logica.dePesoColAMoneda(Double.valueOf(cantDinero.getText()),libra, 2);
						JOptionPane.showMessageDialog(null, "La cantidad de "+cantDinero.getText()+" libras esterlinas corresponde"
								+ " a "+total+" pesos colombianos");
						setVisible(false);
						int confirmado=JOptionPane.showConfirmDialog(null,
								   "¿Deseas continuar?");
								if (JOptionPane.OK_OPTION==confirmado) {
									 setVisible(true);
								}
								else {
									JOptionPane.showMessageDialog(null, "Programa finalizado");
								}
					}else if(comboBoxOpciones.getSelectedItem().toString().equals("Convertir de Yen Japonés a peso Colombiano")) {
						Moneda yen = new Moneda(28.37);
						total=Logica.dePesoColAMoneda(Double.valueOf(cantDinero.getText()),yen, 2);
						JOptionPane.showMessageDialog(null, "La cantidad de "+cantDinero.getText()+" yenes japoneses corresponde"
								+ " a "+total+" pesos colombianos");
						setVisible(false);
						int confirmado=JOptionPane.showConfirmDialog(null,
								   "¿Deseas continuar?");
								if (JOptionPane.OK_OPTION==confirmado) {
									 setVisible(true);
								}
								else {
									JOptionPane.showMessageDialog(null, "Programa finalizado");
								}
					}else if(comboBoxOpciones.getSelectedItem().toString().equals("Convertir de Won sul-coreano a peso Colombiano")) {
						Moneda won = new Moneda(3.12);
						total=Logica.dePesoColAMoneda(Double.valueOf(cantDinero.getText()),won, 2);
						JOptionPane.showMessageDialog(null, "La cantidad de "+cantDinero.getText()+" wones surcoreanos corresponde"
								+ " a "+total+" pesos colombianos");
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
		btnSiguiente.setFont(new Font("Arial", Font.PLAIN, 12));
		btnSiguiente.setBounds(360, 175, 89, 23);
		contentPane.add(btnSiguiente);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuInicio menu= new MenuInicio();
				menu.setVisible(true);
				setVisible(false);
			}
		});
		btnAnterior.setFont(new Font("Arial", Font.PLAIN, 12));
		btnAnterior.setBounds(25, 175, 89, 23);
		contentPane.add(btnAnterior);
		
		JLabel lblIngreseDesdeQue = new JLabel("Ingrese que tipo de conversión desea hacer:");
		lblIngreseDesdeQue.setFont(new Font("Arial", Font.PLAIN, 20));
		lblIngreseDesdeQue.setBounds(25, 88, 469, 33);
		contentPane.add(lblIngreseDesdeQue);
		
		comboBoxOpciones = new JComboBox();
		comboBoxOpciones.setModel(new DefaultComboBoxModel(new String[] {"", 
				"Convertir de peso Colombiano a Dólar", 
				"Convertir de peso Colombiano  a Euros", 
				"Convertir de peso Colombiano  a Libras Esterlinas", 
				"Convertir de peso Colombiano  a Yen Japonés", 
				"Convertir de peso Colombiano  a Won sul-coreano", 
				"Convertir de Dólar a peso Colombiano", 
				"Convertir de Euros a peso Colombiano", 
				"Convertir de Libras Esterlinas a peso Colombiano", 
				"Convertir de Yen Japonés a peso Colombiano", 
				"Convertir de Won sul-coreano a peso Colombiano"}));
		comboBoxOpciones.setBounds(25, 132, 424, 22);
		contentPane.add(comboBoxOpciones);
		
	}
}
