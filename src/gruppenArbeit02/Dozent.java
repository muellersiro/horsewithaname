/*
* Gruppenarbeit 02
* Klasse 1o
* Glauser Michel; M�ller Siro; Marco Weber
*
*/
package gruppenArbeit02;

import java.util.Arrays;
import java.util.Date;

public class Dozent extends Person {
	private int dozId; // obligatorisch
	private String[] faecher; // optional

	// Konstruktor f�r komplette Wertangabe
	public Dozent(String name, String vorname, String heimatOrt, Date gebDat, char gender, int dozId, String[] faecher) {
		super(name, vorname, heimatOrt, gebDat, gender, Person.TYP_DOZENT);
		this.checkDozId(dozId);
		this.faecher = faecher;
	}

	// Konstruktor nur f�r obligatorische Attribute
	public Dozent(String name, String vorname, String heimatOrt, Date gebDat, char gender, int dozId) {
		super(name, vorname, heimatOrt, gebDat, gender, Person.TYP_DOZENT);
		this.checkDozId(dozId);
	}

	//Dozent ID �berpr�fen
	private void checkDozId(int dozId) {
		if (dozId != 0) {
			this.dozId = dozId;
		} else {
			throw new RuntimeException("DozentenId ist obligatorisch");
		}
	}

	// Obligatorische Attribute
	public String toString() {
		return super.toString() + "\nDozenten ID: " + dozId;
	}

	// Gesetzte Attribute
	public String getInfo() {
		String infoString = super.getInfo() + "\nDozenten ID: " + dozId;
		if (faecher != null && faecher.length > 0) {
			infoString = infoString + "\nF�cher: " + Arrays.toString(faecher);
		}
		return infoString;
	}

	// Getters and Setters f�r optionale Attribute
	public String[] getFaecher() {
		return faecher;
	}

	public void setFaecher(String[] faecher) {
		this.faecher = faecher;
	}
}
