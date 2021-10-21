package view;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class FrmAcerca extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5416997833025549595L;

	
	public FrmAcerca() {
		setBounds(100, 100, 180, 150);
		
		JLabel lblNewLabel = new JLabel("<html>Editor de texto <br> Versi\u00F3n 1.0 <br> Autor: Miguel \u00C1ngel Moreno</html>");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel, BorderLayout.CENTER);
		setVisible(true);
		
	}

}
