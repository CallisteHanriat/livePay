package files;

import gui.Interface;
import gui.InterfaceGui;
import java.util.Scanner;

public class Motor {

	private InterfaceGui gui;
	private Salaire salaire;
        /**
         * constructor for the construction of Motor.
         */
        public Motor() {
            salaire = new Salaire();
        }
        
        //SETTERS
	public void setGui(InterfaceGui gui) {
            this.gui = gui;
	}

        /**
        * ask to the user to set his pay.
        * and ask to user his entry
        */
        public void InitializationPay() {
            String duree;
//            
//            this.salaire.setPay(gui.askSalaire());
//            gui.saySomethingTo(" par (an, mois, jour, semaine) : ");
//            duree = gui.sc.nextLine();
//            duree = gui.sc.nextLine();
//            this.salaire.setTypeSalaire(Duree.valueOf(duree));
//            this.salaire.calculMontantPerSecond();
//            gui.saySomethingTo("Vous avez choisi : " + this.salaire.getPay() + "€ / " + this.salaire.getTypeSalaire().toString());
        }

        //AUTRE
        /**
         *ask time to user time to update (month by default)
         * ask the number of lines of updates you want.
         */
	public void liveUpdate() throws InterruptedException {
//            double add = 0.;
//            int j;
//            int time;
//            //ask the number of lines of updates you want (y)
//            gui.saySomethingTo("\nCombien d'actualisations ? ");
//            j = gui.sc.nextInt();
//            //ask the time between tow updates (time : int)
//            gui.saySomethingTo("Combien de temps entre chaque actualisation ? (default : 1s) : ");
//            time = gui.sc.nextInt();
//            this.salaire.setUpDateTime(time);
//            
//            for (int i = 1; i<=j ; i++) {
//                Thread.sleep(this.salaire.getUpDateTime()*1000);
//                add = add + this.salaire.getMontantPerSecond()*this.salaire.getUpDateTime();
//                gui.saySomethingTo("au bout de " + i*this.salaire.getUpDateTime() + " secondes vous avez gagné : " + add + "€. \n");
//            }
        }

        //GETTERS
        public Salaire getSalaire() {
            return salaire;
        }

        public InterfaceGui getGui() {
            return gui;
        }
        

        
}