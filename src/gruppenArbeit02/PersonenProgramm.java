/*
* Gruppenarbeit 02
* Klasse 1o
* Glauser Michel; Müller Siro; Marco Weber
*
*/
package gruppenArbeit02;

import java.util.Date;

public class PersonenProgramm {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Person[] pA = new Person[10];
		
		pA[0] = new Dozent("Meier", "Luca", "Langnau", new Date(1970-1900, 11, 31), 'm', 1001, new String[] { "Mathematik", "Programmieren" });
		pA[0].setAnschrift(new Anschrift("CH", "3608", "Thun", "Hagacherweg", "13b"));

		pA[1] = new Student("Berber", "Ina", "Visp", new Date(1980-1900, 4, 5), 'w', 1, "Wirtschaftsinformatik");
		pA[1].setAnschrift(new Anschrift("3008", "Bern", "Effingerstrasse", "33"));

		pA[2] = new Dozent("Albrecht", "Floride", "Bern", new Date(1997-1900, 5, 4), 'w', 1002, new String[] { "Englisch", "Projektmanagement" });
		pA[2].setAnschrift(new Anschrift("3027", "Bern", "Stöckackerstrasse", "50"));

		pA[3] = new Student("Berger", "Lars", "Langnau", new Date(1981-1900, 2, 15), 'm', 2);
		pA[3].setAnschrift(new Anschrift("3008", "Bern", "Murtenstrasse", "98"));

		pA[4] = new Student("Meyer", "Martin", "Burgdorf", new Date(1990-1900, 11, 16), 'm', 3, null);
		pA[4].setAnschrift(new Anschrift("3011", "Bern", "Predigergasse", "10"));

		pA[5] = new Student("Stalder", "Lea", "Rümlang", new Date(1993-1900, 10, 3), 'w', 4, "Wirtschaftsinformatik");
		pA[5].setAnschrift(new Anschrift("CH", "3001", "Bern", "Zieglerstrasse", "62"));

		pA[6] = new Student("Äschbacher", "Adrian", "Rapperswil", null, 'm', 5, "Wirtschaftsinformatik");
		pA[6].setGebDat(new Date(1997-1900,0,5));

		pA[7] = new Dozent("Aemmer", "Karin", null, new Date(1999-1900, 2, 26), 'w', 1003);
		pA[7].setAnschrift(new Anschrift("3001", "Bern", "Waisenhausplatz", "30"));
		pA[7].setHeimatOrt("Höfen");

		pA[8] = new Dozent("Aebersold", "Michael", "Spiez", null, 'm', 1004,  new String[] { "Mathematik", "Java" });
		pA[8].setAnschrift(new Anschrift("3008", "Bern", "Rathausgasse", "1"));
		
		pA[9] = new Dozent("Kunz", "Lara", "Olten", new Date(1970-1900, 7, 9), 'm', 1005,  new String[] { "Statistik" });
		pA[9].setAnschrift(new Anschrift("3008", "Bern", "Rathausgasse", "1"));

		//Ausgabe der obligatorischen Attribute mittels toString
		System.out.println("-------------------------------------------");
		System.out.println("Obligatorische Attribute");
		System.out.println("-------------------------------------------");
		for (Person p : pA) {
			if (p != null) {
				System.out.println(p + "\n");
			}
		}

		//Ausgabe der gesetzten Attribute mittels getInfo
		System.out.println("-------------------------------------------");
		System.out.println("Gesetzte Attribute");
		System.out.println("-------------------------------------------");
		for (Person p : pA) {
			if (p != null) {
				System.out.println(p.getInfo() + "\n");
			}
		}

		//Ausgabe der ältesten Person
		Person p = Person.getOldest(pA);
		System.out.println("-------------------------------------------\nÄlteste Person\n-------------------------------------------\n" + p );
		System.out.println("Geburtsdatum: " + p.getGebDat());

		//Ausgabe der jünsten Person
		p = Person.getYoungest(pA);
		System.out.println("-------------------------------------------\nJüngste Person\n-------------------------------------------\n" + p);
		System.out.println("Geburtsdatum: " + p.getGebDat());

	}
}
