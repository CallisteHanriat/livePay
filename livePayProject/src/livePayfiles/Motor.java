package livePayfiles;

public class Motor {

	Interface gui;
	Salaire salaire;
	Duree duree;

        /**
         * constructor for the construction of Motor.
         */
        public Motor() {
            gui = new Interface();
            salaire = new Salaire();
        }
        
        /**
         * ask to the user to set his pay.
         */
	public void InitializationPay() {
            gui.askSalaire();
            gui.saySomethingTo("Vous avez choisi : " + this.salaire.getPay() + "€");
	}

	public void liveUpdate() {
		// TODO - implement Motor.liveUpdate
		throw new UnsupportedOperationException();
	}

}