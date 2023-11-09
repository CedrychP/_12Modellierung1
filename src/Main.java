// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {
  MeinHandy1 Iphone3 = new MeinHandy1(200, 20, 5, 4, 5);
  MeinHandy1 Iphone5 = new MeinHandy1(1000, 50, 10, 10,20);
  Iphone3.zeigeAttribute();
  System.out.println();
  Iphone5.zeigeAttribute();
  System.out.println();

  MeinHandy2 Samsung3 = new MeinHandy2(200, 20, 5, 4, 5);
  MeinHandy2 Samsung5 = new MeinHandy2(1000, 50, 10, 10,20);
  Samsung3.zeigeAttribute();
  System.out.println();
  Samsung5.zeigeAttribute();
  System.out.println();

  Punkt p1 = new Punkt(4,3);
  Punkt p2 = new Punkt(22, 44);
  System.out.println("Punkte Abstand zwischen 1. und 2. :" + Punkt.getAbstand(p1,p2));
  System.out.println("Punkte Abstand von 2. und 1. :" + p2.getAbstand(p1));


  }
}