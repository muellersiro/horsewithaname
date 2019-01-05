/*
* Gruppenarbeit 02
* Klasse 1o
* Glauser Michel; Müller Siro; Marco Weber
*
*/
package gruppenArbeit02;

public class Anschrift {
	private String land;
	private String plz;
	private String ort;
	private String strasse;
	private String nr; // 22c ist auch erlaubt

	// Konstruktor für komplette Wertangabe
	public Anschrift(String land, String plz, String ort, String strasse, String nr) {
		this.land = land;
		this.checkPLZ(plz);
		this.ort = ort;
		this.strasse = strasse;
		this.nr = nr;
	}

	// ergänze um einen Konstruktor, so dass bei nicht vorhandener Angabe von "land"
	// der Wert "CH" gesetzt wird
	// in diesem Fall prüfen, ob "plz" 4-stellig ist, sonst RuntimeException
	// auslösen (vgl. class Person)
	// ...

	// Konstruktor mit Defaultwert für das Land
	public Anschrift(String plz, String ort, String strasse, String nr) {
		this.land = "CH";
		this.checkPLZ(plz);
		this.ort = ort;
		this.strasse = strasse;
		this.nr = nr;
	}

	// Postleitzahl Check auf 4 Zeichen
	private void checkPLZ(String plz) {
		if (plz == null || plz.length() != 4) {
			throw new RuntimeException("Postleitzahl entspricht nicht den Vorschriften");
		} else {
			this.plz = plz;
		}
	}
	
	//Obligatorische Attribute
	public String toString() {
		String s = strasse + " " + nr + ", ";
		if (land != null && !land.equals("CH"))
			s = s + land + "-";
		s = s + plz + " " + ort;
		return s;
	}

}
