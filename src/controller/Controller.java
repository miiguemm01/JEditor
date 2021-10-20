package controller;

import java.io.*;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import view.FrmPrincipal;


public class Controller {
	
	public static File getFile() {
		File selectedFile = null;
		JFileChooser jChooser = new JFileChooser();
		jChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("*.txt", "txt");
		jChooser.setFileFilter(fileFilter);
		int fileSelectButton = jChooser.showOpenDialog(null);
		if(fileSelectButton != JFileChooser.CANCEL_OPTION) {
			selectedFile = jChooser.getSelectedFile();
		}
		return selectedFile;
	}
	
	public static File newFile() {
		File selectedFile = null;
		FrmPrincipal.editorArea.setText("");
		return selectedFile;
	}
	
	public static boolean openFile(File file) {
		boolean success = false;
		try {
			BufferedReader fileReader = new BufferedReader(new FileReader(file));
			String readedLine = fileReader.readLine();
			String allText = "";
			while(readedLine != null) {
				allText += readedLine + "\n";
				readedLine = fileReader.readLine();
			}
			FrmPrincipal.editorArea.setText(allText);
			fileReader.close();
			success = true;
		}catch(Exception e) {
			success = false;
		}
		return success;
	}
	
	public static boolean saveFile(File file) {
		boolean success = false;
		try {
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file));
			fileWriter.write(FrmPrincipal.editorArea.getText());
			fileWriter.flush();
			fileWriter.close();
			success = true;
		}catch(Exception e) {
			//No guarda nada
		}
		return success;
	}
	
	public static File saveFileAs() {
		File newFile = null;
		String filePath;
		String fileExtension;
		JFileChooser jChooser = new JFileChooser();
		jChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("*.txt", "txt");
		jChooser.setFileFilter(fileFilter);
		int fileSaveButton = jChooser.showSaveDialog(null);
		
		if(fileSaveButton != JFileChooser.CANCEL_OPTION) {
			newFile = jChooser.getSelectedFile();
			filePath = newFile.getAbsolutePath();
			if (filePath.contains(".")) {
			     fileExtension = filePath.substring(filePath.lastIndexOf(".")+1);
			     if(!fileExtension.equals("txt")) {
			    	 filePath += "txt";
			     }
			}else {
				filePath += ".txt";
			}
			newFile = new File(filePath);
			try {
				newFile.createNewFile();
			} catch (IOException e) {
				//Ya existe
			}
			if(!saveFile(newFile)) {
				newFile = null;
			}
		}
		return newFile;
	}
	
	
	
	
	
	
	
	
}
