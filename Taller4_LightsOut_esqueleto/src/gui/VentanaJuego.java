package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import uniandes.dpoo.taller4.modelo.Tablero;

public class VentanaJuego extends JFrame {

	private PanelConfiguracion panelConfiguracion;
	private PanelOpciones panelOpciones;
	private Tablero tablero;
	private PanelNumeros panelNumeros;
	private PanelTablero panelTablero;
	private PanelConfiguracion tamano;

	public VentanaJuego() {
		System.out.println(tamano);

		panelConfiguracion = new PanelConfiguracion();
		setPreferredSize(new Dimension(getWidth(), 100));

		panelOpciones = new PanelOpciones(this);

		Tablero tablero = new Tablero(7); // Crear un objeto de la clase Tablero con tamaño 5x5
		PanelTablero panelTablero = new PanelTablero(7, 50, tablero); // Crear un objeto de la clase PanelTablero con tamaño de celda 50 y el objeto Tablero creado anteriormente

		panelNumeros = new PanelNumeros();

		setLayout(new BorderLayout());

		add(panelConfiguracion, BorderLayout.NORTH);
		add(panelOpciones, BorderLayout.EAST);
		add(panelTablero, BorderLayout.CENTER); 
		add(panelNumeros, BorderLayout.SOUTH);

		setSize(new Dimension(580, 500));
		setResizable(true);
		setTitle("LightsOut");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		VentanaJuego vc = new VentanaJuego();
	}
}
