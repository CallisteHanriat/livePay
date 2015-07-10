package livePayfiles;

public class Motor {

	Interface gui;
	Salaire pay;
	Duree duree;

        /**
         * constructor for the construction of Motor.
         */
        public Motor() {
            gui = new Interface();
            pay = new Salaire();
        }
        
        /**
         * ask to the user to set his pay.
         */
	public void InitializationPay() {
            gui.askSalaire();
	}

	public void liveUpdate() {
		// TODO - implement Motor.liveUpdate
		throw new UnsupportedOperationException();
	}

}