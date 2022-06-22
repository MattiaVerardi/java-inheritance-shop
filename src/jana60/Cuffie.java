package jana60;

public class Cuffie extends Prodotto {

	// attributi
	private String colore;
	private boolean eWireless;

	// costruttori
	public Cuffie(int codice, String nome, String marca, double prezzo, double iva, String colore, boolean wireless) {
		super(codice, nome, marca, prezzo, iva);
		this.colore = colore;
		this.eWireless = wireless;
	}

	// metodi getter e setter
	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return eWireless;
	}

	public void setWireless(boolean wireless) {
		this.eWireless = wireless;
	}

	// metodi
	public String stampaWireless() {
		if (eWireless) {
			return " e sono abilitate al wireless";
		} else {
			return " e non sono abilitate al wireless";
		}
	}

	public String toString() {
		return super.toString() + "Presenta un colore " + colore + stampaWireless();
	}
}
