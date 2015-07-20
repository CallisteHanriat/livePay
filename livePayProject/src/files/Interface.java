package files;

import java.util.Scanner;

public class Interface {

	private Motor moteur;
        private Scanner sc;
        private double pay;
        
	public Interface() {
            sc = new Scanner(System.in);
	}
        
        //SETTER
        public void setMoteur(Motor moteur) {
            this.moteur = moteur;
        }

   	/**
     	* just used to dialog something to user
     	* @param contenu is what the application wants to say
     	*/
    	public void saySomethingTo(String contenu) {
        	System.out.println(contenu);
    	}

	/**
         * frontEnd : ask to the user for the input.
         * and set the pay of the moteur
         */
        public double askSalaire() {
            System.out.println("Entrez votre salaire annuel : ");
            pay = sc.nextDouble();
            return pay;
        }

}
