package gui;

import files.*;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.BorderUIResource;
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
    private JButton boutonGo;
    
    public InterfaceGui() {
        choixDurees = new ButtonGroup();
        moteur = new Motor();
        durees = new HashMap<>();
        panelCheckBox = new JPanel(new GridBagLayout());
        contrainteGrille = new GridBagConstraints();
        this.setLayout(new GridBagLayout());
        boutonGo = new JButton("Go!");
        inputSalaire = new JSpinner(new SpinnerNumberModel(1000.0, 1.0, 1000000000000.0, 1.0));
        this.initUiComponant();
    }
    
    /**
     * Use it to init all ui componant to the GUI.
     */
    private void initUiComponant() {
        contrainteGrille.gridx = 0;
        contrainteGrille.gridy = 0;
        contrainteGrille.weightx = 1.;
        contrainteGrille.weighty = 1.;
        contrainteGrille.fill = GridBagConstraints.HORIZONTAL;
        this.add(new JLabel("Entrez le salaire : ", JLabel.RIGHT), contrainteGrille);
        
        contrainteGrille.gridx = 1;
        this.add(inputSalaire, contrainteGrille);
        contrainteGrille.anchor = GridBagConstraints.CENTER;
        
        contrainteGrille.gridx = 2;
        contrainteGrille.anchor = GridBagConstraints.WEST;
        this.add(new JLabel("€"), contrainteGrille);
        contrainteGrille.anchor = GridBagConstraints.CENTER;
        
        contrainteGrille.gridx = 0;
        contrainteGrille.gridy = 1;
        this.add(new JLabel("par : ", JLabel.RIGHT), contrainteGrille);        
        
        //Boucle pour entrer les JRadioButton
        for (Duree d : Duree.values()) {
            durees.put(d, new JRadioButton(d.toString()));
            choixDurees.add(durees.get(d));
        }                
        contrainteGrille.gridx = 1;        
        contrainteGrille.insets = new Insets(30, 15, WIDTH, WIDTH);
//        this.panelCheckBox.setBorder(BorderFactory.createLineBorder(Color.black));
        this.add(this.panelCheckBox, contrainteGrille);
        contrainteGrille.insets = new Insets(0, 0, 0, 0);

        this.contrainteGrille.gridx = 0;
        this.contrainteGrille.gridy = 0;
        this.panelCheckBox.add(this.durees.get(Duree.An), contrainteGrille);
        
        this.contrainteGrille.gridx = 1;
        this.panelCheckBox.add(this.durees.get(Duree.Mois), contrainteGrille);
        
        this.contrainteGrille.gridx = 0;
        this.contrainteGrille.gridy = 1;
        this.panelCheckBox.add(this.durees.get(Duree.Semaine), contrainteGrille);
        
        this.contrainteGrille.gridx = 1;
        this.panelCheckBox.add(this.durees.get(Duree.Jour), contrainteGrille);

        contrainteGrille.anchor = GridBagConstraints.CENTER;
        this.panelCheckBox.setPreferredSize(new Dimension(this.inputSalaire.getPreferredSize().width, 55));
        contrainteGrille.gridx = 0;
        contrainteGrille.gridy = 2;
        contrainteGrille.fill = GridBagConstraints.NONE;
        contrainteGrille.gridwidth = 3;
        contrainteGrille.anchor = GridBagConstraints.CENTER;
        this.add(this.boutonGo, contrainteGrille);
        
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
        this.boutonGo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                InterfaceGui.this.getUi();
                System.out.println("Salaire :  " + InterfaceGui.this.moteur.getSalaire().getPay() + " par " + InterfaceGui.this.moteur.getSalaire().getTypeSalaire().toString());
            }
        });
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
        moteur.getSalaire().setPay((double) this.inputSalaire.getValue());
}
    
    //SETTERS
    /**
     * use it to permit to the interface to disp information.
     */
    public void setUi() {
        this.durees.get(Duree.An).setSelected(true);
    }
}
