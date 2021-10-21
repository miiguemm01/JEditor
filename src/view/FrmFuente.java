package view;

import controller.FuenteController;
import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.List;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.SwingConstants;

public class FrmFuente extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	public static JLabel testLabel;
	public static Font appFont;
	public static List listaFuente;
	public static List listaSize;
	private ButtonGroup radioGroup;
	public static String fontStyle = "Normal";
	public static Font testFont;
	
	public FrmFuente() {
		setTitle("Fuente");
		setBounds(100, 100, 310, 220);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Fuente");
			lblNewLabel.setBounds(10, 11, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Tama\u00F1o");
			lblNewLabel_1.setBounds(136, 11, 46, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Estilo");
			lblNewLabel_2.setBounds(210, 11, 46, 14);
			contentPanel.add(lblNewLabel_2);
		}
		
		listaFuente = new List();
		listaFuente.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				FuenteController.setTestFont();
			}
		});
		listaFuente.setBounds(10, 31, 100, 71);
		contentPanel.add(listaFuente);
		//FIXME
		listaFuente.add("Arial");
		listaFuente.add("Verdana");
		listaFuente.add("Tahoma");
		listaFuente.add("Impact");
		listaFuente.add("Sylfaen");
		
		listaSize = new List();
		listaSize.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				FuenteController.setTestFont();
			}
		});
		listaSize.setBounds(136, 31, 46, 71);
		contentPanel.add(listaSize);
		for(int i = 9; i < 16; i++) {
			listaSize.add(i + "");
		}
		
		radioGroup = new ButtonGroup();
		
		JRadioButton radioNormal = new JRadioButton("Normal");
		radioNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fontStyle = "Normal";
				FuenteController.setTestFont();
			}
		});
		radioNormal.setSelected(true);
		radioNormal.setBounds(210, 32, 78, 23);
		contentPanel.add(radioNormal);
		radioGroup.add(radioNormal);
		
		JRadioButton radioNegrita = new JRadioButton("Negrita");
		radioNegrita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fontStyle = "Negrita";
				FuenteController.setTestFont();
			}
		});
		radioNegrita.setBounds(210, 58, 78, 23);
		contentPanel.add(radioNegrita);
		radioGroup.add(radioNegrita);
		
		JRadioButton radioCursiva = new JRadioButton("Cursiva");
		radioCursiva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fontStyle = "Cursiva";
				FuenteController.setTestFont();
			}
		});
		radioCursiva.setBounds(210, 84, 78, 23);
		contentPanel.add(radioCursiva);
		radioGroup.add(radioCursiva);
		
		testLabel = new JLabel("Esto es un texto de prueba");
		testLabel.setHorizontalAlignment(SwingConstants.CENTER);
		testLabel.setBounds(10, 119, 274, 22);
		contentPanel.add(testLabel);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String sizeString = listaSize.getSelectedItem();
					int fontSize = Integer.parseInt(sizeString);
					String fontName = listaFuente.getSelectedItem();
					appFont = FuenteController.makeFont(fontName, fontSize, fontStyle);
					FuenteController.setAppFont(appFont);
				}catch(Exception ex) {
					System.out.println("err");
				}
			}
		});
		btnNewButton.setBounds(10, 147, 100, 23);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Por defecto");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String sizeString = listaSize.getSelectedItem();
					int fontSize = Integer.parseInt(sizeString);
					String fontName = listaFuente.getSelectedItem();
					appFont = FuenteController.makeFont(fontName, fontSize, fontStyle);
					FuenteController.setDefaultAppFont(appFont);
				}catch(Exception ex) {
					System.out.println("err");
				}
			}
		});
		btnNewButton_1.setBounds(184, 147, 100, 23);
		contentPanel.add(btnNewButton_1);
		setVisible(true);
	}
}
