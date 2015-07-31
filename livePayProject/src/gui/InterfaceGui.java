package gui;

import files.*;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author couim
 */
public class InterfaceGui extends JFrame {
    private JSpinner inputSalaire;
    private JSpinner inputTempsIntervalle;
    private JSpinner inputActu;
    private HashMap<Duree, JRadioButton> durees;
    private Motor moteur;
    
    public InterfaceGui() {
        moteur = new Motor();
        durees = new HashMap<>();
        this.setLayout(new GridLayout(5,5));
        inputSalaire = new JSpinner(new SpinnerNumberModel(1000.0, 1.0, 1000000000000.0, 1.0));
        this.initUiComponant();
    }
    
    /**
     * Use it to init all ui componant to the GUI.
     */
    private void initUiComponant() {
        this.setSize(500, 400);        
        this.setVisible(true);
        this.add(new JLabel("Entrez le salaire : ")); 
        this.add(inputSalaire);
        this.add(new JLabel("par : "));        
        
        //Boucle pour entrer les JRadioButton
        for (Duree d : Duree.values()) {
            durees.put(d, new JRadioButton(d.toString()));
            this.add(durees.get(d));
        }
    }
    
    //GETTERS
    /**
     * use it to permit to the user to keep information from the GUI.
     */
    public void getUi() {
        
    }
    
    //SETTERS
    /**
     * use it to permit to the interface to disp information.
     */
    public void setUi() {
        
    }
}
