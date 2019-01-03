/*
* Gruppenarbeit 02
* Klasse 1o
* Glauser Michel; Müller Siro; Marco Weber
*
*/
package gruppenArbeit02;

import java.util.Arrays;
import java.util.Date;

public class Dozent extends Person {
	private int dozId; // obligatorisch
	private String[] faecher; // optional

	public Dozent(String name, String vorname, String heimatOrt, Date gebDat, char gender, int dozId, String[] faecher) {
		super(name, vorname, heimatOrt, gebDat, gender, Person.TYP_DOZENT);
		if (dozId != 0) {
			this.dozId = dozId;
		} else {
			throw new RuntimeException("DozentenId ist obligatorisch");
		}
		this.faecher = faecher;
	}

	public Dozent(String name, String vorname, String heimatOrt, Date gebDat, char gender, int dozId) {
		super(name, vorname, heimatOrt, gebDat, gender, Person.TYP_DOZENT);
		if (dozId != 0) {
			this.dozId = dozId;
		} else {
			throw new RuntimeException("DozentenId ist obligatorisch");
		}
	}

	public String toString() {
		return super.toString() + "\nDozenten ID: " + dozId;
	}

	public String getInfo() {
		String infoString = super.getInfo() + "\nDozenten ID: " + dozId;
		if (faecher != null && faecher.length > 0) {
			infoString = infoString + "\nFächer: " + Arrays.toString(faecher);
		}
		return infoString;
	}
	
	// Getters and Setters für optionale Attribute
	public String[] getFaecher() {
		return faecher;
	}

	public void setFaecher(String[] faecher) {
		this.faecher = faecher;
	}
}
