/*
* Gruppenarbeit 02
* Klasse 1o
* Glauser Michel; Müller Siro; Marco Weber
*
*/
package gruppenArbeit02;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person {
	public static String TYP_STUDENT = "Student";
	public static String TYP_DOZENT = "Dozent";

	private String name;
	private String vorname;
	private String heimatOrt; // optional
	private Date gebDat; // optional
	private char gender; // optional
	private Anschrift anschrift; // optional
	private String genderTxt;
	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy"); // Date Format

	private String personTyp; // wird von der konkreten Klasse gesetzt

	// Konstruktor Person
	public Person(String name, String vorname, String heimatOrt, Date gebDat, char gender, String personTyp) {
		if (name == null || name.length() == 0) {
			throw new RuntimeException("Name darf nicht leer oder Leerstring sein.");
		}
		if (vorname == null || vorname.length() == 0) {
			throw new RuntimeException("Vorname darf nicht leer oder Leerstring sein.");
		}
		this.name = name;
		this.vorname = vorname; // name überprüfen, obligatorisch
		this.heimatOrt = heimatOrt;
		this.gebDat = gebDat;
		this.gender = gender;
		if (gender == 'm') {
			genderTxt = "Männlich";
		} else if (gender == 'w') {
			genderTxt = "Weiblich";
		} else {
			genderTxt = "Neutral"; // Geschlecht Defaultwert Neutral
		}
		this.personTyp = personTyp;
	}

	// Obligatorische Attribute
	public String toString() {
		return "Name: " + name + "\nVorname: " + vorname;
	}

	// Gesetzte Attribute
	public String getInfo() {
		// Obligatorische Attribute lesen
		String infoString = toString();
		if (heimatOrt != null && heimatOrt.length() > 0) {
			infoString = infoString + "\nHeimatort: " + heimatOrt;
		}
		if (gebDat != null) {
			infoString = infoString + "\nGeburtsdatum: " + simpleDateFormat.format(gebDat);
		}
		infoString = infoString + "\nGeschlecht: " + genderTxt;
		if (anschrift != null) {
			infoString = infoString + "\nAnschrift: " + anschrift.toString();
		}
		return infoString;
	}

	// Typ
	public String getPersonTyp() {
		return personTyp;
	}

	// gibt älteste Person aus pA zurück
	public static Person getOldest(Person[] pA) {
		// Erstes Element in Array selektieren
		Person personToCompare = pA[0];
		for (Person p : pA) {
			// überprüfen ob Person nicht null ist und ob ein Geburtsdatum angegeben ist
			if (p != null && p.gebDat != null) {
				// überprüfen ob Referenz-Geburtsdatum gefüllt ist
				if (personToCompare.gebDat != null) {
					// das "ältere" Datum bestimmen
					if (p.gebDat.before(personToCompare.gebDat)) {
						// Das Referenz-Objekt setzen wenn das aktuelle Datum "älter" ist
						personToCompare = p;
					}
				} else {
					// nächster Eintrag des Arrays
					personToCompare = p;
				}
			}
		}
		return personToCompare;
	}

	// gibt jüngste Person aus pA zurück
	public static Person getYoungest(Person[] pA) {
		Person personToCompare = pA[0];
		for (Person p : pA) {
			// überprüfen ob Person nicht null ist und ob ein Geburtsdatum angegeben ist
			if (p != null && p.gebDat != null) {
				// überprüfen ob Referenz-Geburtsdatum gefüllt ist
				if (personToCompare.gebDat != null) {
					// das "ältere" Datum bestimmen
					if (personToCompare.gebDat.before(p.gebDat)) {
						// Das Referenz-Objekt setzen wenn das aktuelle Datum "jünger" ist
						personToCompare = p;
					}
				} else {
					// nächster Eintrag des Arrays
					personToCompare = p;
				}
			}
		}
		return personToCompare;
	}

	// Getters and Setters für optionale Attribute
	public String getHeimatOrt() {
		return heimatOrt;
	}

	public void setHeimatOrt(String heimatOrt) {
		this.heimatOrt = heimatOrt;
	}

	public String getGebDat() {
		return simpleDateFormat.format(gebDat);
	}

	public void setGebDat(Date gebDat) {
		this.gebDat = gebDat;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Anschrift getAnschrift() {
		return anschrift;
	}

	public void setAnschrift(Anschrift anschrift) {
		this.anschrift = anschrift;
	}
}
