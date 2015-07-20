/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livepayproject;

import files.Interface;
import files.Motor;

/**
 *
 * @author couim
 */
public class LivePayProject {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Motor moteur = new Motor();
        moteur.setGui(new Interface());
        moteur.getGui().setMoteur(moteur);
        moteur.InitializationPay();
        moteur.liveUpdate();
    }

}
