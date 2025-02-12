package edu.cmu.cs.cs214.lab02.shapes;

/** Shape интерфейсийг хэрэгжүүлсэн Sqaure класс. */
public class Square implements Shape {
  private double sideLen;

  public Square(double sideLen) {
    this.sideLen = sideLen;
  }

  public double getArea() {
    return sideLen * sideLen;
  }
}
