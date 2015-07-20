package files;

public class Motor {

	private Interface gui;
	private Salaire salaire;

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
        * and ask to user his entry
        */
        public void InitializationPay() {
            gui.askSalaire();
            gui.saySomethingTo("Vous avez choisi : " + this.salaire.getPay() + "€ / " + this.salaire.getTypeSalaire().toString());
        }

        //AUTRE
        /**
         *ask time to user time to update (month by default)
         * 
         */
	public void liveUpdate() {
            
        }

        //GETTERS
        public Salaire getSalaire() {
            return salaire;
        }

        public Interface getGui() {
            return gui;
        }
        

        
}