package gui;

import files.*;
import java.awt.CheckboxGroup;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
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
    private ButtonGroup choixDurees;
    private GridBagConstraints contrainteGrille;
    private JPanel panelCheckBox;
    
    public InterfaceGui() {
        choixDurees = new ButtonGroup();
        moteur = new Motor();
        durees = new HashMap<>();
        this.setLayout(new GridBagLayout());
        inputSalaire = new JSpinner(new SpinnerNumberModel(1000.0, 1.0, 1000000000000.0, 1.0));
        this.initUiComponant();
    }
    
    /**
     * Use it to init all ui componant to the GUI.
     */
    private void initUiComponant() {
        this.add(new JLabel("Entrez le salaire : ")); 
        this.add(inputSalaire);
        this.add(new JLabel("par : "));        
        
        //Boucle pour entrer les JRadioButton
        for (Duree d : Duree.values()) {
            durees.put(d, new JRadioButton(d.toString()));
            choixDurees.add(durees.get(d));
            this.add(durees.get(d));
        }                
        
        this.setSize(500, 400);        
        this.setVisible(true);
        
        this.setUi();
        this.getUi();
        this.initActionListener();
    }
    
    
    /**
     * Use it to put all componant's listeners.
     */
    public void initActionListener() {
    }
    
    //GETTERS
    /**
     * use it to permit to the user to keep information from the GUI.
     */
    public void getUi() {
        //to give to the moteur informations choose by the user thanks to the GUI
        for (Duree d : durees.keySet()) {
            if(durees.get(d).isSelected()) {
                moteur.getSalaire().setTypeSalaire(d);
            }
        }
    }
    
    //SETTERS
    /**
     * use it to permit to the interface to disp information.
     */
    public void setUi() {
        this.durees.get(Duree.An).setSelected(true);
    }
}
