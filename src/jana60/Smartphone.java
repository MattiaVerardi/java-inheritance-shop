package jana60;

import java.text.DecimalFormat;

public class Smartphone extends Prodotto {

	// attributi
	private String imei;
	private int quantitaMemoria;
	private DecimalFormat df = new DecimalFormat("0 GB");

	// costruttori
	public Smartphone(int codice, String nome, String marca, double prezzo, double iva, String imei,
			int quantitaMemoria) {
		super(codice, nome, marca, prezzo, iva);
		this.imei = imei;
		this.quantitaMemoria = quantitaMemoria;
	}

	// metodi getter e setter
	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public int getQuantitaMemoria() {
		return quantitaMemoria;
	}

	public void setQuantitaMemoria(int quantitaMemoria) {
		this.quantitaMemoria = quantitaMemoria;
	}

	// metodi
	public String memoriaDF() {
		return df.format(quantitaMemoria);
	}

	public String toString() {
		return super.toString() + "Presenta una quantità di memoria di " + memoriaDF() + " e il suo codice IMEI è "
				+ imei;
	}
}
