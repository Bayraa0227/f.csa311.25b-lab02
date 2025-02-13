package edu.cmu.cs.cs214.lab02.shapes;

/** Shape интерфейсийг хэрэгжүүлсэн Circle класс. */
public class Circle implements Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public void draw() {
    // зурах функцууд

    System.out.println("Circle зурсан.\nТалбай: " + getArea());
  }
}
