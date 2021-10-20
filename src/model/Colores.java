package model;

import java.awt.Color;
import java.io.Serializable;

public class Colores implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Color fontColor;
	private Color backgroundColor;
	
	public Colores() {
		
	}
	
	public Colores(Color fontColor, Color backgroundColor) {
		this.setBackgroundColor(backgroundColor);
		this.setFontColor(fontColor);
	}
	
	public void setFontColor(Color fontColor) {
		this.fontColor = fontColor;
	}
	
	public Color getFontColor() {
		return this.fontColor;
	}
	
	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	
	public Color getBackgroundColor() {
		return this.backgroundColor;
	}
}
