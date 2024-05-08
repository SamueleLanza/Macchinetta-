package morracinese;

import java.util.Random;
import java.util.Scanner;

public class morracinese {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int segnoAvv, segnoUser, puntiUser, puntiAvv;
		String outcome, segno, segnoAvvTrad;
		puntiUser = 0;
		puntiAvv = 0;
		segnoUser = 0;

		do {
			System.out.println("Decidi: Sasso, Carta, Forbici");
			segno = sc.nextLine(); // otteniamo l'input dell'utente
			segnoAvv = r.nextInt(3); // 3 casuali per il turno del pc

			if (segno.toLowerCase().equals("carta")) {
				segnoUser = 0;
			} else if (segno.toLowerCase().equals("sasso"))
				segnoUser = 1;
			else if (segno.toLowerCase().equals("forbice"))
				segnoUser = 2;

			if (segnoAvv == 0) // trasforma il numero generato in stringa: carta/sasso/forbice
				segnoAvvTrad = "carta";

			else if (segnoAvv == 1)

				segnoAvvTrad = "sasso";

			else
				segnoAvvTrad = "forbice";

			if (segnoUser == segnoAvv) {
				outcome = "pareggiato";
			} else if (segnoUser == 0 && segnoAvv == 1 || segnoUser == 1 && segnoAvv == 2
					|| segnoUser == 2 && segnoAvv == 0) {
				outcome = "Hai vinto";
				puntiUser++; // aggiunge un punto all'utente
			} else {
				outcome = "Hai perso";
				puntiAvv++; // aggiunge un punto all'avversario
			}
			System.out.println("Il tuo avversario ha lanciato " + segnoAvvTrad + "! " + outcome + "!");
			System.out.println("Il punteggio è di " + puntiUser + " a " + puntiAvv + "");

		} while (puntiAvv < 5 && puntiUser < 5);
		sc.close();
		
		if (puntiUser == 5)
			System.out.println("Hai vinto la partita!, Complimenti :D ");
		else
			System.out.println("Hai perso la partita! :c");
	}
}
