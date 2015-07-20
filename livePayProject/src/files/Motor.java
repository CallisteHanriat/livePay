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
            this.salaire.setPay(gui.askSalaire());
            this.salaire.calculMontantPerSecond();
            gui.saySomethingTo("Vous avez choisi : " + this.salaire.getPay() + "€ / " + this.salaire.getTypeSalaire().toString());
        }

        //AUTRE
        /**
         *ask time to user time to update (month by default)
         * 
         */
	public void liveUpdate() throws InterruptedException {
            //print 60 evolutions of the calcul
            double add = 0.;
            for (int i = 1; i<=30 ; i++) {
                Thread.sleep(this.salaire.getUpDateTime()*1000);
                add = add + this.salaire.getMontantPerSecond()*this.salaire.getUpDateTime();
                gui.saySomethingTo("au bout de " + i*this.salaire.getUpDateTime() + " secondes vous avez gagné : " + add + "€.");
            }
        }

        //GETTERS
        public Salaire getSalaire() {
            return salaire;
        }

        public Interface getGui() {
            return gui;
        }
        

        
}