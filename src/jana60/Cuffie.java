package jana60;

public class Cuffie extends Prodotto {

	// attributi
	private String colore;
	private boolean wireless;

	// costruttori
	public Cuffie(int codice, String nome, String marca, double prezzo, double iva, String colore, boolean wireless) {
		super(codice, nome, marca, prezzo, iva);
		this.colore = colore;
		this.wireless = wireless;
	}

	// metodi getter e setter
	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}

}
