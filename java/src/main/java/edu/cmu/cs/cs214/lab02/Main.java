package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

/** Ажиллуулах класс. */
public class Main {
  /**
   * main метод.
   *
   * @param args Аргументууд
   */
  public static void main(String[] args) {
    Shape rectangle1 = new Rectangle(3, 4);
    Renderer rendererRect1 = new Renderer(rectangle1);
    rendererRect1.draw(); // 12

    Rectangle rectangle2 = new Rectangle(10, 34.5);
    Renderer rendererRect2 = new Renderer(rectangle2);
    rendererRect2.draw(); // 345

    Shape circle1 = new Circle(10);
    Renderer rendererCirc1 = new Renderer(circle1);
    rendererCirc1.draw(); // 314.16

    Shape square1 = new Square(8);
    Renderer rendererSq1 = new Renderer(square1);
    rendererSq1.draw(); // 64
  }
}
