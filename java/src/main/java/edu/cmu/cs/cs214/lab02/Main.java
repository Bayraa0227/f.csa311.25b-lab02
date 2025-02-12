package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;

/** Ажиллуулах класс. */
public class Main {
  /**
   * main метод.
   *
   * @param args Аргументууд
   */
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(2, 3);

    Renderer renderer = new Renderer(rectangle);

    renderer.draw();
  }
}
