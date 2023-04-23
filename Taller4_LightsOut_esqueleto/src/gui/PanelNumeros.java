package gui;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PanelNumeros extends JPanel{
	
	private JLabel lbJugadas;
	private JLabel lbJugador;
	
	private JTextField txtJugadas;
	private JTextField txtJugador;
	
	public PanelNumeros() {

		lbJugadas = new JLabel("Jugadas:");
		lbJugadas.setPreferredSize(new Dimension(75, 20));
	
		txtJugadas = new JTextField();
		txtJugadas.setPreferredSize(new Dimension(75, 20));
		txtJugadas.setEditable(false);
		
		
		lbJugador = new JLabel("Jugador:");
		lbJugador.setPreferredSize(new Dimension(75, 20));
		
		txtJugador = new JTextField();
		txtJugador.setPreferredSize(new Dimension(75, 20));
		txtJugador.setEditable(false);
		
		add(lbJugadas);
		add(txtJugadas);
		add(lbJugador);
		add(txtJugador);
	
	}
	
}
