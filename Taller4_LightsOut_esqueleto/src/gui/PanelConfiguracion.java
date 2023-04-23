package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class PanelConfiguracion extends JPanel {
    private JLabel lbTam;
    private JLabel lbDif;
    private int tamano;
    
    
    
    public PanelConfiguracion() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        setBackground(new Color(22, 135, 209));

        lbTam = new JLabel("Tamaño:");
        lbTam.setPreferredSize(new Dimension(55, 18));
        lbTam.setForeground(Color.WHITE);
        add(lbTam);

        String[] opciones = {"3x3", "5x5", "7x7"};
        JComboBox<String> listaDesplegable = new JComboBox<String>(opciones);
        listaDesplegable.setPreferredSize(new Dimension(80, listaDesplegable.getPreferredSize().height));
        add(listaDesplegable);

        lbDif = new JLabel("Dificultad:");
        lbDif.setPreferredSize(new Dimension(65, 18));
        lbDif.setForeground(Color.WHITE);
        add(lbDif);

        // creación de los botones de dificultad
        JRadioButton facilBtn = new JRadioButton("Fácil");
        facilBtn.setBackground(new Color(22, 135, 209));
        facilBtn.setForeground(Color.WHITE);
     
        JRadioButton medioBtn = new JRadioButton("Medio");
        medioBtn.setBackground(new Color(22, 135, 209));
        medioBtn.setForeground(Color.WHITE);
        
        JRadioButton dificilBtn = new JRadioButton("Difícil");
        dificilBtn.setBackground(new Color(22, 135, 209));
        dificilBtn.setForeground(Color.WHITE);
        
        // agregamos los botones a un ButtonGroup para permitir solo una selección
        ButtonGroup dificultadGroup = new ButtonGroup();
        dificultadGroup.add(facilBtn);
        dificultadGroup.add(medioBtn);
        dificultadGroup.add(dificilBtn);

        // agregamos los botones al panel
        add(facilBtn);
        add(medioBtn);
        add(dificilBtn);
        
        // agregamos un ActionListener al JComboBox
        listaDesplegable.addActionListener(e -> {
            int selectedIndex = listaDesplegable.getSelectedIndex();
            switch (selectedIndex) {
                case 0:
                    tamano = 3;
                    break;
                case 1:
                    tamano = 5;
                    break;
                case 2:
                    tamano = 7;
                    break;
                default:
                    break;
            }
        });
    }
}

