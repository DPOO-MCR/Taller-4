package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOpciones extends JPanel implements ActionListener {

    private JButton btnRaza;
    private JButton btnPuntos;
    private JButton btnEdad;
    private JButton btnBusqueda;

    private VentanaJuego padre;

    public PanelOpciones(VentanaJuego papa) {
        padre = papa;

        // Cambiar el ancho del panel a 180
        setPreferredSize(new Dimension(180, getHeight()));
        
        btnRaza = new JButton("NUEVO");
        btnRaza.setPreferredSize(new Dimension(160, 30));
        btnRaza.addActionListener(this);

        btnPuntos = new JButton("REINICIAR");
        btnPuntos.setPreferredSize(new Dimension(160, 30));
        btnPuntos.addActionListener(this);

        btnEdad = new JButton("TOP-10");
        btnEdad.setPreferredSize(new Dimension(160, 30));
        btnEdad.addActionListener(this);

        btnBusqueda = new JButton("CAMBIAR JUGADOR");
        btnBusqueda.setPreferredSize(new Dimension(160, 30));
        btnBusqueda.addActionListener(this);

        setLayout(new FlowLayout());

        add(btnRaza);
        add(btnPuntos);
        add(btnEdad);
        add(btnBusqueda);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
