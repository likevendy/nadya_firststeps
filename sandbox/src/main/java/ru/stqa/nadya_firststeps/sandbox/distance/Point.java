package ru.stqa.nadya_firststeps.sandbox.distance;

/**
 * Created by nadezhda.guschina on 01.04.2018.
 */
public class Point
{

 public double x;
 public double y;

  public Point(double x1,double y1)
  {
    x=x1;
    y=y1;
  }
  public static double distance(Point p1, Point p2){
   double distance = Math.sqrt((Math.pow((p2.x-p1.x),2)+ Math.pow((p2.y-p1.y),2)));
    return distance;
  }
}

