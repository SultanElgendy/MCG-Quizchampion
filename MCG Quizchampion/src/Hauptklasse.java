
public class Hauptklasse {

		private static int spielerZahl = 0;
		public static Fragenkatalog fragenkatalog = new Fragenkatalog();
		private static String spielerName1, spielerName2, spielerName3;
		private static int punkteS1 = 0, punkteS2 = 0, punkteS3 = 3;
		private static GUI_Fragen guiFragen;
		private final static int anzahlSchwierigkeitsgrad = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static Fragenkatalog getFragenkatalog() {
		return fragenkatalog;
	}


	public static void setFragenkatalog(Fragenkatalog fragenkatalog) {
		Hauptklasse.fragenkatalog = fragenkatalog;
	}


	public static String getSpielerName1() {
		return spielerName1;
	}


	public static void setSpielerName1(String spielerName1) {
		Hauptklasse.spielerName1 = spielerName1;
	}


	public static String getSpielerName2() {
		return spielerName2;
	}


	public static void setSpielerName2(String spielerName2) {
		Hauptklasse.spielerName2 = spielerName2;
	}


	public static String getSpielerName3() {
		return spielerName3;
	}


	public static void setSpielerName3(String spielerName3) {
		Hauptklasse.spielerName3 = spielerName3;
	}


	public static int getPunkteS1() {
		return punkteS1;
	}


	public static void setPunkteS1(int punkteS1) {
		Hauptklasse.punkteS1 = punkteS1;
	}


	public static int getPunkteS2() {
		return punkteS2;
	}


	public static void setPunkteS2(int punkteS2) {
		Hauptklasse.punkteS2 = punkteS2;
	}


	public static int getPunkteS3() {
		return punkteS3;
	}


	public static void setPunkteS3(int punkteS3) {
		Hauptklasse.punkteS3 = punkteS3;
	}


	public static GUI_Fragen getGuiFragen() {
		return guiFragen;
	}


	public static void setGuiFragen(GUI_Fragen guiFragen) {
		Hauptklasse.guiFragen = guiFragen;
	}


	public static int getAnzahlschwierigkeitsgrad() {
		return anzahlSchwierigkeitsgrad;
	}


	public static int getSpielerZahl() {
		return spielerZahl;
	}

	public static void setSpielerZahl(int spielerZahl) {
		Hauptklasse.spielerZahl = spielerZahl;
	}

}

