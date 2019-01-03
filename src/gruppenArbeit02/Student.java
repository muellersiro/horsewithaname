/*
* Gruppenarbeit 02
* Klasse 1o
* Glauser Michel; Müller Siro; Marco Weber
*
*/
package gruppenArbeit02;

import java.util.Date;

public class Student extends Person {
	private int matNr; // obligatorisch
	private String studiengang; // optional

	// Kontruktor für alle Attribute
	public Student(String name, String vorname, String heimatOrt, Date gebDat, char gender, int matNr, String studiengang) {
		super(name, vorname, heimatOrt, gebDat, gender, Person.TYP_STUDENT);
		if (matNr != 0) {
			this.matNr = matNr;
		} else {
			throw new RuntimeException("MatNr ist obligatorisch");
		}
		this.studiengang = studiengang;
	}

	// Konstruktor nur für obligatorsche Attribute
	public Student(String name, String vorname, String heimatOrt, Date gebDat, char gender, int matNr) {
		super(name, vorname, heimatOrt, gebDat, gender, Person.TYP_STUDENT);
		if (matNr != 0) {
			this.matNr = matNr;
		} else {
			throw new RuntimeException("MatNr ist obligatorisch");
		}
	}

	public String toString() {
		return super.toString() + "\nMat Nummer: " + matNr;
	}

	public String getInfo() {
		String infoString = super.getInfo() + "\nMat Nummer: " + matNr;
		if(studiengang != null && studiengang.length() > 0) {
			infoString = infoString + "\nStudiengang: " + studiengang;
		}
		return infoString;
	}
	
	// Getters and Setters für optionale Attribute
	public String getStudiengang() {
		return studiengang;
	}

	public void setStudiengang(String studiengang) {
		this.studiengang = studiengang;
	}

}
