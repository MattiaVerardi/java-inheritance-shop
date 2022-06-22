package jana60;

import java.text.DecimalFormat;

public class Televisori extends Prodotto {

	// attributi
	private int dimensioni;
	private boolean eSmart;
	private DecimalFormat df = new DecimalFormat("0 pollici");

	// costruttori
	public Televisori(int codice, String nome, String marca, double prezzo, double iva, int dimensioni,
			boolean eSmart) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensioni = dimensioni;
		this.eSmart = eSmart;
	}

	// metodi getter e setter
	public int getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}

	public boolean iseSmart() {
		return eSmart;
	}

	public void seteSmart(boolean eSmart) {
		this.eSmart = eSmart;
	}

	// metodi
	public String dimensioniDF() {
		return df.format(dimensioni);
	}

	public String stampaSmart() {
		if (eSmart) {
			return " e presenta funzionalità smart";
		} else {
			return " e non presenta funzionalità smart";
		}
	}

	public String toString() {
		return super.toString() + "Presenta delle dimensioni di " + dimensioniDF() + stampaSmart();
	}
}
