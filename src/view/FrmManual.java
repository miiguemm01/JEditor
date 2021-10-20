package view;

import controller.ManualController;
import javax.swing.JDialog;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class FrmManual extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8578814583520466954L;
	public static JLabel txtManual;

	
	public FrmManual() {
		setTitle("Manual de la aplicaci\u00F3n");
		setBounds(100, 100, 275, 200);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		txtManual = new JLabel();
		txtManual.setVerticalAlignment(SwingConstants.TOP);
		getContentPane().add(txtManual, BorderLayout.CENTER);
		setVisible(true);
		ManualController.readManualFile();
	}

}
