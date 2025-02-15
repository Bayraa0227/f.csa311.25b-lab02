package edu.cmu.cs.cs214.lab02.shapes;

/** Shape интерфейсийг хэрэгжүүлсэн Sqaure класс. */
public class Square implements Shape {
  private double sideLen;

  public Square(double sideLen) {
    this.sideLen = sideLen;
  }

  @Override
  public double getArea() {
    return sideLen * sideLen;
  }

  @Override
  public void draw() {
    // зурах функцууд

    System.out.println("Sqaure зурсан.\nТалбай: " + getArea());
  }
}
