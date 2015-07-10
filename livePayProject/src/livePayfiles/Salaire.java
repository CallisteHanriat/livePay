package livePayfiles;

public class Salaire {

	private double salaire = 0;
	private Duree typeSalaire;
	private double payPerSecond;

	public Salaire() {
            salaire = 0.0;
        }

	/**
	 * 
	 * @param payForAMonth
	 */
	public Salaire(double payForAMonth) {
            salaire = payForAMonth;
        }

	/**
	 * 
	 * @param pay
	 * @param typePaye
	 */
	public void entryPay(double pay, Duree typePaye) {
		// TODO - implement Salaire.entryPay
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pay
	 */
	public void setPay(double pay) {
		// TODO - implement Salaire.setPay
		throw new UnsupportedOperationException();
	}

	public double getPay() {
		// TODO - implement Salaire.getPay
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pay
	 */
	public void setPayPerSecond(double pay) {
		this.payPerSecond = pay;
	}

}