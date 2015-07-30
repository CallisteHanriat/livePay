package gui;

import files.*;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
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
    
    public InterfaceGui() {
        this.initUiComponant();
    }
    
    /**
     * Use it to init all ui componant to the GUI.
     */
    private void initUiComponant() {
        this.add(new JLabel("Salaire : "));
        
        this.add(new JLabel("par : "));
        this.setPreferredSize(new Dimension(500,400));
        this.setVisible(true);
    }
    
    //GETTERS
    public void getUi() {
        
    }
    
    //SETTERS
    public void setUi() {
        
    }
}
