package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(10.0, 10.0);
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(10.0, 10.0);
        
        // pollObj(rectangle);
        // pollObj(circle);
        // pollObj(triangle);
        output("------ Flächen ------");
        output("Fläche Rechteck: " + rectangle.area());
        output("Fläche Dreieck: " + triangle.area());
        output("Fläche Kreis: " + circle.area());
    }

    // private static void pollObj(Shape area) {
    //     output(area);
    // }


    private static void output(String string) {
        System.out.println(string);
    }



}

