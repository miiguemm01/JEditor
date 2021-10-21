package view;

import java.awt.Font;
import controller.ColoresController;
import controller.Controller;
import controller.FuenteController;
import model.Colores;

import java.awt.BorderLayout;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class FrmPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2563077659361509195L;
	private JPanel contentPane;
	private File editorFile;
	public static JTextArea editorArea;
	private JMenuItem archivoGuardar;
	private JMenuItem archivoGuardarComo;
	public static Colores colores;
	public static Font appFont;
	
	
	public FrmPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\eclipse-workspace\\Editor de Texto\\notepad.png"));
		setTitle("JEditor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuArchivo = new JMenu("Archivo");
		menuBar.add(menuArchivo);
		
		JMenuItem archivoNuevo = new JMenuItem("Nuevo");
		archivoNuevo.addActionListener(new ActionListener() { //NUEVO
			public void actionPerformed(ActionEvent e) {
				editorFile = Controller.newFile();
				archivoGuardar.setEnabled(false);
				archivoGuardarComo.setEnabled(true);
			}
		});
		menuArchivo.add(archivoNuevo);
		
		JMenuItem archivoAbrir = new JMenuItem("Abrir");
		archivoAbrir.addActionListener(new ActionListener() { //ABRIR
			public void actionPerformed(ActionEvent e) {
				editorFile = Controller.getFile();
				if(Controller.openFile(editorFile)) {
					archivoGuardar.setEnabled(true);
					archivoGuardarComo.setEnabled(true);
				}
			}
		});
		menuArchivo.add(archivoAbrir);
		
		archivoGuardar = new JMenuItem("Guardar");
		archivoGuardar.setEnabled(false);
		archivoGuardar.addActionListener(new ActionListener() { //GUARDAR
			public void actionPerformed(ActionEvent e) {
				Controller.saveFile(editorFile);
			}
		});
		menuArchivo.add(archivoGuardar);
		
		archivoGuardarComo = new JMenuItem("Guardar como...");
		archivoGuardarComo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editorFile = Controller.saveFileAs();
				if(editorFile != null) archivoGuardar.setEnabled(true);
			}
		});
		archivoGuardarComo.setEnabled(false);
		menuArchivo.add(archivoGuardarComo);
		
		JSeparator separator = new JSeparator();
		menuArchivo.add(separator);
		
		JMenuItem archivoSalir = new JMenuItem("Salir");
		archivoSalir.addActionListener(new ActionListener() { //SALIR
			public void actionPerformed(ActionEvent e) {
				new FrmClose();
			}
		});
		menuArchivo.add(archivoSalir);
		
		JMenu mnNewMenu = new JMenu("Formato");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Fuente");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FrmFuente();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Colores");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FrmColores();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu menuAyuda = new JMenu("Ayuda");
		menuBar.add(menuAyuda);
		
		JMenuItem archivoManual = new JMenuItem("Manual");
		archivoManual.addActionListener(new ActionListener() { //Manual
			public void actionPerformed(ActionEvent e) {
				new FrmManual();
			}
		});
		menuAyuda.add(archivoManual);
		
		JMenuItem archivoAcerca = new JMenuItem("Acerca de...");
		archivoAcerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FrmAcerca();
			}
		});
		menuAyuda.add(archivoAcerca);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		editorArea = new JTextArea();
		JScrollPane scrollArea = new JScrollPane(editorArea);
		contentPane.add(scrollArea, BorderLayout.CENTER);
		editorFile = Controller.newFile();
		archivoGuardar.setEnabled(false);
		archivoGuardarComo.setEnabled(true);
		colores = ColoresController.getDefaultColores();
		appFont = FuenteController.getDefaultAppFont();
		ColoresController.setColores(colores);
		FuenteController.setAppFont(appFont);
		
	}

}
