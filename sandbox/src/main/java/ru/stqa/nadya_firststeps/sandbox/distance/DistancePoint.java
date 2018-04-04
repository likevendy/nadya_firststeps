package ru.stqa.nadya_firststeps.sandbox.distance;

/**
 * Created by nadezhda.guschina on 01.04.2018.
 */
public class DistancePoint {

  public static void main(String[] args) {
    Point p1 = new Point (3.0,4.5);
    Point p2 = new Point (4.0,3.5);
   // Point p1 = new Point();
   // Point p2 = new Point();
   // p1.x=3;
   // p1.y=4.5;
    System.out.println("Координаты точки p1:x = " + p1.x + ", y = " + p1.y );
    System.out.println( "Координаты точ p2: x = " + p2.x + ", y =" + p2.y);
    System.out.println( "Расстояние между точками  p1 и  p2 = " + Point.distance(p1,p2));

  }

}
