package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.List;
import javax.swing.JRadioButton;

public class FrmFuente extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	
	public FrmFuente() {
		setBounds(100, 100, 310, 300);
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
			lblNewLabel_1.setBounds(110, 11, 46, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Estilo");
			lblNewLabel_2.setBounds(210, 11, 46, 14);
			contentPanel.add(lblNewLabel_2);
		}
		
		List list = new List();
		list.setBounds(10, 31, 46, 71);
		contentPanel.add(list);
		
		List list_1 = new List();
		list_1.setBounds(110, 31, 46, 71);
		contentPanel.add(list_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Normal");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(210, 32, 78, 23);
		contentPanel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Negrita");
		rdbtnNewRadioButton_1.setBounds(210, 58, 78, 23);
		contentPanel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Cursiva");
		rdbtnNewRadioButton_2.setBounds(210, 84, 78, 23);
		contentPanel.add(rdbtnNewRadioButton_2);
		setVisible(true);
	}
}
