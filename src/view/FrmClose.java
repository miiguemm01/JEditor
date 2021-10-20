package view;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class FrmClose extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6510473498577178685L;
	private final JPanel contentPanel = new JPanel();

	
	public FrmClose() {
		setModal(true);
		setTitle("Cerrar");
		setResizable(false);
		setAlwaysOnTop(true);
		setBounds(100, 100, 238, 178);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("S\u00ED");
		btnNewButton.addActionListener(new ActionListener() { //Cerrar
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(10, 105, 89, 23);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("No");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //No cerrar
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(123, 105, 89, 23);
		contentPanel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("<html>\u00BFEst\u00E1s seguro de que quieres cerrar la aplicaci\u00F3n?</html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 202, 83);
		contentPanel.add(lblNewLabel);
		setVisible(true);
	}
}
