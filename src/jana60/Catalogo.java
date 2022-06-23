package jana60;

import java.util.Scanner;

/*
 * BONUS: create una classe Catalogo con metodo main, in cui chiedete all’utente di valorizzare un catalogo di prodotti 
 * con i dati inseriti tramite scanner. 
 * Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone o un Televisore o Cuffie 
 * e in base alla scelta dell’utente utilizzate il costruttore opportuno. 
 * Al termine dell’inserimento stampate il catalogo 
 * (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe).
 */

public class Catalogo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Prodotto[] prodotti = new Prodotto[3];

		boolean finito = false;

		while (!finito) {
			System.out
					.println("Digita 1 per inserire uno Smartphone, 2 per un Televisore, 3 per Cuffie e 4 per uscire");
			String scelta = scan.nextLine();
			String risposta;

			System.out.println("Inserisci il codice: ");
			int inputCodice = Integer.parseInt(scan.nextLine());
			System.out.println("Inserisci il nome: ");
			String inputNome = scan.nextLine();
			System.out.println("Inserisci la marca: ");
			String inputMarca = scan.nextLine();
			System.out.println("Inserisci il prezzo: ");
			double inputPrezzo = Double.parseDouble(scan.nextLine());
			System.out.println("Inserisci l'iva: ");
			double inputIva = Double.parseDouble(scan.nextLine());

			switch (scelta) {
			case "1":
				System.out.println("Inserisci l'IMEI: ");
				String inputImei = scan.nextLine();
				System.out.println("Inserisci la quantità di memoria: ");
				int inputQuantitaMemoria = Integer.parseInt(scan.nextLine());
				Smartphone nuovoSmartphone = new Smartphone(inputCodice, inputNome, inputMarca, inputPrezzo, inputIva,
						inputImei, inputQuantitaMemoria);
				System.out.println(nuovoSmartphone.toString());
				break;
			case "2":
				System.out.println("Inserisci le dimensioni: ");
				int inputDimensioni = Integer.parseInt(scan.nextLine());
				System.out.println("Scegli o meno la funzionalità smart");
				risposta = scan.nextLine();
				boolean inputESmart;
				if (risposta.equalsIgnoreCase("si")) {
					inputESmart = true;
				} else {
					inputESmart = false;
				}
				Televisori nuovoTelevisore = new Televisori(inputCodice, inputNome, inputMarca, inputPrezzo, inputIva,
						inputDimensioni, inputESmart);
				System.out.println(nuovoTelevisore.toString());
				break;
			case "3":
				System.out.println("Inserisci il colore: ");
				String inputColore = scan.nextLine();
				System.out.println("Scegli o meno la funzionalità wireless");
				risposta = scan.nextLine();
				boolean inputEWireless;
				if (risposta.equalsIgnoreCase("si")) {
					inputEWireless = true;
				} else {
					inputEWireless = false;
				}
				Cuffie nuoveCuffie = new Cuffie(inputCodice, inputNome, inputMarca, inputPrezzo, inputIva, inputColore,
						inputEWireless);
				System.out.println(nuoveCuffie.toString());
				break;
			case "4":
				finito = true;
				break;
			default:
				System.out.println("Scelta non valida");
				break;
			}
		}

		scan.close();
	}

}
