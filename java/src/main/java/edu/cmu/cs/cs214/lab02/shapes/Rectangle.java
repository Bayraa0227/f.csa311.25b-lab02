package edu.cmu.cs.cs214.lab02.shapes;

/** Shape интерфейсийг хэрэгжүүлсэн Rectangle класс. */
public class Rectangle implements Shape {
  private double height;
  private double width;

  public Rectangle(double height, double width) {
    this.height = height;
    this.width = width;
  }

  @Override
  public double getArea() {
    return height * width;
  }

  @Override
  public void draw() {
    // зурах функцууд

    System.out.println("Rectangle зурсан.\nТалбай: " + getArea());
  }
}
