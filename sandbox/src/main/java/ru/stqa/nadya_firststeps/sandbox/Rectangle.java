package ru.stqa.nadya_firststeps.sandbox;

/**
 * Created by nadezhda.guschina on 31.03.2018.
 */
public class Rectangle {

  public double a;
  public double b;

  public Rectangle (double a, double b){

    this.a=a;
    this.b=b;
  }

  public double area (){
    return this.a*this.b;
  }
}
