package files;

public class Motor {

	private Interface gui;
	private Salaire salaire;
	private Duree duree;

        /**
         * constructor for the construction of Motor.
         */
        public Motor() {
            salaire = new Salaire();
        }
        
        //SETTERS
	public void setGui(Interface gui) {
            this.gui = gui;
	}

        /**
        * ask to the user to set his pay.
        */
        public void InitializationPay() {
            gui.askSalaire();
            gui.saySomethingTo("Vous avez choisi : " + this.salaire.getPay() + "€");
        }

        //AUTRE
	public void liveUpdate() {
		// TODO - implement Motor.liveUpdate
		throw new UnsupportedOperationException();
	}

        //GETTERS
        public Salaire getSalaire() {
            return salaire;
        }

        public Interface getGui() {
            return gui;
        }
        

        
}