package controller;

import java.io.*;
import view.FrmManual;

public class ManualController {
	
	public static void readManualFile() {
		File manualFile = new File("manual.txt");
		try {
			BufferedReader fileReader = new BufferedReader(new FileReader(manualFile));
			String manualLine = fileReader.readLine();
			String manualText = "<html>";
			while(manualLine != null) {
				manualText += manualLine + "<br>";
				manualLine = fileReader.readLine();
			}
			fileReader.close();
			manualText += "</html>";
			FrmManual.txtManual.setText(manualText);
		}catch(Exception e) {
			FrmManual.txtManual.setText("Error al abrir el manual");
		}
	}
}
