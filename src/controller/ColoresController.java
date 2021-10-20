package controller;

import java.io.*;

import model.Colores;
import view.FrmColores;
import view.FrmPrincipal;

public class ColoresController {
	
	public static void setTestColores(Colores colores) {
		if(!sameColor(colores) && colores != null) {
			FrmColores.testLabel.setForeground(colores.getFontColor());
			FrmColores.testLabel.setBackground(colores.getBackgroundColor());
		}
	}
	
	private static boolean sameColor(Colores colores) {
		boolean isSameColor = true;
		if(colores != null) {
			if(!colores.getBackgroundColor().equals(colores.getFontColor())) {
				isSameColor = false;
			}
		}
		return isSameColor;
	}
	
	public static Colores makeColores() {
		Colores colores = null;
		if(FrmColores.foregroundColor != null && FrmColores.backgroundColor != null) {
			colores = new Colores(FrmColores.foregroundColor, FrmColores.backgroundColor);
		}
		return colores;
	}
	
	public static void setColores(Colores colores) {
		if(!sameColor(colores) && colores != null) {
			FrmPrincipal.editorArea.setForeground(colores.getFontColor());
			FrmPrincipal.editorArea.setBackground(colores.getBackgroundColor());
		}
	}
	
	public static void setDefaultColores(Colores colores) {
		setColores(colores);
		if(!sameColor(colores) && colores != null) {
			try {
				FileOutputStream fileOutput = new FileOutputStream(new File("colors.dat"));
				ObjectOutputStream colorBuffer = new ObjectOutputStream(fileOutput);
				colorBuffer.writeObject(colores);
				colorBuffer.close();
				fileOutput.close();
			}catch(Exception e) {
				//Cannot write colors
			}
		}
	}
	
	public static Colores getDefaultColores() {
		Colores colores = null;
		try {
			FileInputStream fileInput = new FileInputStream(new File("colors.dat"));
			ObjectInputStream colorBuffer = new ObjectInputStream(fileInput);
			colores = (Colores) colorBuffer.readObject();
			colorBuffer.close();
			fileInput.close();
		}catch(Exception e) {
			//Cannot read colors
		}
		return colores;
	}
}
