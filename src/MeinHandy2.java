public class MeinHandy2 {
  // Membervariablen
  private int speicher;
  private int sprechzeit;
  private int standbyzeit;
  private int bildschirmAufloesungX;
  private int bildschirmAufloesungY;

  // Konstruktor
  public MeinHandy2(int speicher, int sprechzeit, int standbyzeit, int x, int y) {
    this.speicher = speicher;
    this.sprechzeit = sprechzeit;
    this.standbyzeit = standbyzeit;
    this.bildschirmAufloesungX = x;
    this.bildschirmAufloesungY = y;
  }

  // Getter und Setter
  public int getSpeicher() {
    return speicher;
  }

  public void setSpeicher(int speicher) {
    this.speicher = speicher;
  }

  // Weitere Getter und Setter für die anderen Attribute

  // Methode zur Anzeige der Attribute auf der Konsole
  public void zeigeAttribute() {
    System.out.println("Speicher: " + speicher + "GB");
    System.out.println("Sprechzeit: " + sprechzeit + " Stunden");
    System.out.println("Standbyzeit: " + standbyzeit + " Stunden");
    System.out.println("Bildschirmaufloesung: " + bildschirmAufloesungX + "x" + bildschirmAufloesungY);
  }
}