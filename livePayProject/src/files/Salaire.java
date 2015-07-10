package files;

public class Salaire {

	private double montant = 0;
	private Duree typeSalaire;
	private double montantPerSecond;

        //CONSTRUCTORS
	public Salaire() {
            this.montant = 0.0;
            
            //Automatic for the begening of the project : it's a prototype
            typeSalaire = Duree.An;
        }

	/**
	 * 
	 * @param payForAMonth
	 */
	public Salaire(double payForAMonth) {
            this.montant = payForAMonth;
        }


        
        //SETTERS
	/**
	 * 
	 * @param pay
	 */
	public void setPay(double pay) {
            this.montant = pay;
	}

    
        //GETTERS
        /**
         * 
         * @return the value of the montant
         */
	public double getPay() {
            return this.montant;
	}

	/**
	 * to cr
	 * @param pay
	 */
	public void setPayPerSecond(double pay) {
		this.montant = pay;
	}

}