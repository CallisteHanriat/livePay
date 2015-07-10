package livePayfiles;

import java.util.Scanner;

public class Interface {

	private Motor moteur;
        private Scanner sc;
        private double pay;
        
	public Interface() {
            sc = new Scanner(System.in);
            moteur = new Motor();
	}

	public void saySomethingTo() {
		// TODO - implement Interface.saySomethingTo
		throw new UnsupportedOperationException();
	}

	/**
         * frontEnd : ask to the user for the input.
         * and set the pay of the moteur
         */
        public void askSalaire() {
            System.out.println("Entrez votre salaire annuel : ");
            pay = sc.nextDouble();
            moteur.pay.setPay(pay);
        }

}