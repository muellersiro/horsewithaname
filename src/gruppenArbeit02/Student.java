package gruppenArbeit02;
import java.util.Date;
public class Student extends Person {
	   private int matNr;             //obligatorisch
	   private String studiengang;    //optional
	   
	   //Konstruktor nur für obligatorsche Attribute
	   
	   //Kontruktor für alle Attribute
	   public Student(String name, String vorname, String heimatOrt, Date gebDat, char gender, int matNr, String studiengang) {
	      super(name, vorname, heimatOrt, gebDat, gender, Person.TYP_STUDENT);
	      this.matNr = matNr;
	      this.studiengang = studiengang;
	   }

	   public String getInfo() {
	      return null;
	   }

	}
