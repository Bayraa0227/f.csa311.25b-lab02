package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

/** Renderer класс. */
public class Renderer {
  private Shape shape;

  Renderer(Shape shape) {
    this.shape = shape;
  }

  /** draw метод. (Дүрсийн талбайг хэвлэнэ) */
  public void draw() {
    double area = shape.getArea();

    // assume implementation

    System.out.println("Shape printed\n" + "Its area is " + area);
  }
}
