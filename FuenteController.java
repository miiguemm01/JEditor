package controller;

import java.awt.*;
import view.FrmPrincipal;
import view.FrmFuente;
import java.io.*;

public class FuenteController {
	
	public static Font makeFont(String fontName, int fontSize, String fontStyle) {
		Font font = null;
		if(fontStyle.equals("Negrita")) {
			font = new Font(fontName, Font.BOLD, fontSize);
		}else if(fontStyle.equals("Cursiva")) {
			font = new Font(fontName, Font.ITALIC, fontSize);
		}else {
			font = new Font(fontName, Font.PLAIN, fontSize);
		}
		return font;
	}
	
	public static void setAppFont(Font font) {
		FrmPrincipal.editorArea.setFont(font);
	}
	
	public static void setDefaultAppFont(Font font) {
		setAppFont(font);
		try {
			ObjectOutputStream fileBuffer = new ObjectOutputStream(new FileOutputStream(new File("font.dat")));
			fileBuffer.writeObject(font);
			fileBuffer.flush();
			fileBuffer.close();
		}catch(Exception e) {
			//No se establece
		}
	}
	
	public static Font getDefaultAppFont() {
		Font appFont = null;
		try {
			ObjectInputStream fileBuffer = new ObjectInputStream(new FileInputStream(new File("font.dat")));
			appFont = (Font) fileBuffer.readObject();
		}catch(Exception e) {
			//No se puede recuperar
		}
		return appFont;
	}
	
	public static void setTestFont() {
		try {
			String sizeString = FrmFuente.listaSize.getSelectedItem();
			int fontSize = Integer.parseInt(sizeString);
			String fontName = FrmFuente.listaFuente.getSelectedItem();
			Font testFont = makeFont(fontName, fontSize, FrmFuente.fontStyle);
			FrmFuente.testLabel.setFont(testFont);
		}catch(Exception e) {
			
		}
	}
	
	public static String[] getAvailableFonts() {
		String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		return fonts;
	}
}
