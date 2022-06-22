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
			switch (scelta) {
			case "1":
				System.out.println("Inserisci il codice: ");
				int codiceS = Integer.parseInt(scan.nextLine());
				System.out.println("Inserisci il nome: ");
				String nomeS = scan.nextLine();
				System.out.println("Inserisci la marca: ");
				String marcaS = scan.nextLine();
				System.out.println("Inserisci il prezzo: ");
				double prezzoS = Double.parseDouble(scan.nextLine());
				System.out.println("Inserisci l'iva: ");
				double ivaS = Double.parseDouble(scan.nextLine());
				System.out.println("Inserisci l'IMEI: ");
				String imeiS = scan.nextLine();
				System.out.println("Inserisci la quntità di memoria: ");
				int quantitaMemoriaS = Integer.parseInt(scan.nextLine());
				Smartphone nuovoSmartphone = new Smartphone(codiceS, nomeS, marcaS, prezzoS, ivaS, imeiS,
						quantitaMemoriaS);
				System.out.println(nuovoSmartphone.toString());
				break;
			case "2":
				System.out.println("Inserisci il codice: ");
				int codiceT = Integer.parseInt(scan.nextLine());
				System.out.println("Inserisci il nome: ");
				String nomeT = scan.nextLine();
				System.out.println("Inserisci la marca: ");
				String marcaT = scan.nextLine();
				System.out.println("Inserisci il prezzo: ");
				double prezzoT = Double.parseDouble(scan.nextLine());
				System.out.println("Inserisci l'iva: ");
				double ivaT = Double.parseDouble(scan.nextLine());
				System.out.println("Inserisci le dimensioni: ");
				int dimensioniT = Integer.parseInt(scan.nextLine());
				System.out.println("Scegli o meno la funzionalità smart");
				risposta = scan.nextLine();
				boolean eSmartT;
				if (risposta.equalsIgnoreCase("si")) {
					eSmartT = true;
				} else {
					eSmartT = false;
				}
				Televisori nuovoTelevisore = new Televisori(codiceT, nomeT, marcaT, prezzoT, ivaT, dimensioniT,
						eSmartT);
				System.out.println(nuovoTelevisore.toString());
				break;
			case "3":
				System.out.println("Inserisci il codice: ");
				int codiceC = Integer.parseInt(scan.nextLine());
				System.out.println("Inserisci il nome: ");
				String nomeC = scan.nextLine();
				System.out.println("Inserisci la marca: ");
				String marcaC = scan.nextLine();
				System.out.println("Inserisci il prezzo: ");
				double prezzoC = Double.parseDouble(scan.nextLine());
				System.out.println("Inserisci l'iva: ");
				double ivaC = Double.parseDouble(scan.nextLine());
				System.out.println("Inserisci il colore: ");
				String coloreC = scan.nextLine();
				System.out.println("Scegli o meno la funzionalità wireless");
				risposta = scan.nextLine();
				boolean eWirelessC;
				if (risposta.equalsIgnoreCase("si")) {
					eWirelessC = true;
				} else {
					eWirelessC = false;
				}
				Cuffie nuoveCuffie = new Cuffie(codiceC, nomeC, marcaC, prezzoC, ivaC, coloreC, eWirelessC);
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
