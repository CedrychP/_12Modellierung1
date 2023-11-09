public class Punkt {
  // Membervariablen
  private int x;
  private int y;

  // Konstruktor
  public Punkt(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // Getter und Setter
  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  // Methode zur Berechnung des Abstands zu einem anderen Punkt
  public double getAbstand(Punkt p) {
    return Math.sqrt(Math.pow(p.getX() - this.x, 2) + Math.pow(p.getY() - this.y, 2));
  }

  // Klassenmethode zur Berechnung des Abstands zwischen zwei Punkten
  public static double getAbstand(Punkt p1, Punkt p2) {
    return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
  }
}