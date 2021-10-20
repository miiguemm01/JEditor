package view;

import java.awt.BorderLayout;
import controller.ColoresController;
import model.Colores;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JToolBar;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class FrmColores extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public static JLabel testLabel;
	public static Color backgroundColor = null;
	public static Color foregroundColor = null; 
	private Colores colores;

	
	public FrmColores() {
		setResizable(false);
		setTitle("Colores");
		setBounds(100, 100, 190, 215);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Fuente");
			lblNewLabel.setBounds(10, 11, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 36, 46, 46);
		contentPanel.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				foregroundColor = panel_3.getBackground();
				colores = ColoresController.makeColores();
				if(colores != null) {
					ColoresController.setTestColores(colores);
				}
			}
		});
		panel_3.setBackground(new Color(255, 0, 0));
		panel_1.add(panel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				foregroundColor = panel_2.getBackground();
				colores = ColoresController.makeColores();
				if(colores != null) {
					ColoresController.setTestColores(colores);
				}
			}
		});
		panel_2.setBackground(new Color(0, 255, 0));
		panel_1.add(panel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				foregroundColor = panel_4.getBackground();
				colores = ColoresController.makeColores();
				if(colores != null) {
					ColoresController.setTestColores(colores);
				}
			}
		});
		panel_4.setBackground(new Color(0, 0, 255));
		panel_1.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				foregroundColor = panel_5.getBackground();
				colores = ColoresController.makeColores();
				if(colores != null) {
					ColoresController.setTestColores(colores);
				}
			}
		});
		panel_5.setBackground(new Color(255, 0, 255));
		panel_1.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				foregroundColor = panel_6.getBackground();
				colores = ColoresController.makeColores();
				if(colores != null) {
					ColoresController.setTestColores(colores);
				}
			}
		});
		panel_6.setBackground(new Color(255, 255, 0));
		panel_1.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				foregroundColor = panel_7.getBackground();
				colores = ColoresController.makeColores();
				if(colores != null) {
					ColoresController.setTestColores(colores);
				}
			}
		});
		panel_7.setBackground(new Color(0, 255, 204));
		panel_1.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				foregroundColor = panel_8.getBackground();
				colores = ColoresController.makeColores();
				if(colores != null) {
					ColoresController.setTestColores(colores);
				}
			}
		});
		panel_8.setBackground(new Color(0, 0, 0));
		panel_1.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				foregroundColor = panel_9.getBackground();
				colores = ColoresController.makeColores();
				if(colores != null) {
					ColoresController.setTestColores(colores);
				}
			}
		});
		panel_9.setBackground(SystemColor.menu);
		panel_1.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				foregroundColor = panel_10.getBackground();
				colores = ColoresController.makeColores();
				if(colores != null) {
					ColoresController.setTestColores(colores);
				}
			}
		});
		panel_10.setBackground(new Color(51, 51, 51));
		panel_1.add(panel_10);
		
		JLabel lblNewLabel_1 = new JLabel("Fondo");
		lblNewLabel_1.setBounds(106, 11, 46, 14);
		contentPanel.add(lblNewLabel_1);
		
		testLabel = new JLabel("Esto es un texto de prueba");
		testLabel.setBounds(10, 93, 164, 14);
		testLabel.setOpaque(true);
		contentPanel.add(testLabel);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ColoresController.setColores(colores);
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnAceptar.setBounds(44, 118, 89, 23);
		contentPanel.add(btnAceptar);
		
		JButton btnNewButton = new JButton("Por defecto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ColoresController.setDefaultColores(colores);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(44, 142, 89, 23);
		contentPanel.add(btnNewButton);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(106, 36, 46, 46);
		contentPanel.add(panel_11);
		panel_11.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_1_1 = new JPanel();
		panel_11.add(panel_1_1);
		panel_1_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				backgroundColor = panel_3_1.getBackground();
				colores = ColoresController.makeColores();
				if(colores != null) {
					ColoresController.setTestColores(colores);
				}
			}
		});
		panel_3_1.setBackground(Color.RED);
		panel_1_1.add(panel_3_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				backgroundColor = panel_2_1.getBackground();
				colores = ColoresController.makeColores();
				if(colores != null) {
					ColoresController.setTestColores(colores);
				}
			}
		});
		panel_2_1.setBackground(Color.GREEN);
		panel_1_1.add(panel_2_1);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				backgroundColor = panel_4_1.getBackground();
				colores = ColoresController.makeColores();
				if(colores != null) {
					ColoresController.setTestColores(colores);
				}
			}
		});
		panel_4_1.setBackground(Color.BLUE);
		panel_1_1.add(panel_4_1);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				backgroundColor = panel_5_1.getBackground();
				colores = ColoresController.makeColores();
				if(colores != null) {
					ColoresController.setTestColores(colores);
				}
			}
		});
		panel_5_1.setBackground(Color.MAGENTA);
		panel_1_1.add(panel_5_1);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				backgroundColor = panel_6_1.getBackground();
				colores = ColoresController.makeColores();
				if(colores != null) {
					ColoresController.setTestColores(colores);
				}
			}
		});
		panel_6_1.setBackground(Color.YELLOW);
		panel_1_1.add(panel_6_1);
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				backgroundColor = panel_7_1.getBackground();
				colores = ColoresController.makeColores();
				if(colores != null) {
					ColoresController.setTestColores(colores);
				}
			}
		});
		panel_7_1.setBackground(new Color(0, 255, 204));
		panel_1_1.add(panel_7_1);
		
		JPanel panel_8_1 = new JPanel();
		panel_8_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				backgroundColor = panel_8_1.getBackground();
				colores = ColoresController.makeColores();
				if(colores != null) {
					ColoresController.setTestColores(colores);
				}
			}
		});
		panel_8_1.setBackground(Color.BLACK);
		panel_1_1.add(panel_8_1);
		
		JPanel panel_9_1 = new JPanel();
		panel_9_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				backgroundColor = panel_9_1.getBackground();
				colores = ColoresController.makeColores();
				if(colores != null) {
					ColoresController.setTestColores(colores);
				}
			}
		});
		panel_9_1.setBackground(SystemColor.menu);
		panel_1_1.add(panel_9_1);
		
		JPanel panel_10_1 = new JPanel();
		panel_10_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				backgroundColor = panel_10_1.getBackground();
				colores = ColoresController.makeColores();
				if(colores != null) {
					ColoresController.setTestColores(colores);
				}
			}
		});
		panel_10_1.setBackground(new Color(51, 51, 51));
		panel_1_1.add(panel_10_1);
		setVisible(true);
	}
}
