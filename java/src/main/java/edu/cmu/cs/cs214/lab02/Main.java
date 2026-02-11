package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;


public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(2);
        Renderer renderer = new Renderer(shape);

        renderer.draw();
    }
}
