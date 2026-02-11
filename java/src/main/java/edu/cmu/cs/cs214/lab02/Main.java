package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;
import edu.cmu.cs.cs214.lab02.shapes.Circle;


public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(5);
        shape = new Rectangle(4, 6);
        shape = new Square(3);
        Renderer renderer = new Renderer(shape);

        renderer.draw();
    }
}
