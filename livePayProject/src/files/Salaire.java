package files;

public class Salaire {

	private double montant = 0;
	private Duree typeSalaire;
	private double montantPerSecond;
        private int upDateTime;
        
        //CONSTRUCTORS
	public Salaire() {
            this.montant = 0.0;
            setUpDateTime(1);
            //Automatic for the begening of the project : it's a prototype
            typeSalaire = Duree.An;
        }

	/**
	 * @param payForAMonth
	 */
	public Salaire(double payForAMonth) {
            this.montant = payForAMonth;
        }

        /**
         * the goal of this method is to calcul what the pay is per one second
         */
        public void calculMontantPerSecond() {
            switch(this.getTypeSalaire()) {
                case An :
                    this.setMontantPerSecond(this.montant/(365*3600*24));
                    break;
                case Mois : 
                    this.setMontantPerSecond(montant/(24*3600*7*4));
                    break;
                case Semaine : 
                    this.setMontantPerSecond(this.montant/(24*3600*7));
                    break;
                case Jour : 
                    this.setMontantPerSecond(this.montant/(24*3600));
                    break;
                default : 
                    break;
            }
        }
        
        //SETTERS
	/**
	 * 
	 * @param pay
	 */
	public void setPay(double pay) {
            this.montant = pay;
	}

        public void setUpDateTime(int upDateTime) {
            this.upDateTime = upDateTime;
        }

        public void setTypeSalaire(Duree typeSalaire) {
            this.typeSalaire = typeSalaire;
        }
        
       
	/**
	 * to cr
	 * @param arg
	 */
	private void setMontantPerSecond(double arg) {
		this.montantPerSecond = arg;
	}
    
        //GETTERS
        /**
         * 
         * @return the value of the montant
         */
	public double getPay() {
            return this.montant;
	}

        public Duree getTypeSalaire() {
            return typeSalaire;
        }

        public int getUpDateTime() {
            return upDateTime;
        }

        public double getMontantPerSecond() {
            return montantPerSecond;
        }

        
        
}