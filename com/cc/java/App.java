package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(5, 6);
        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(4, 3);
        
        pollObj(rectangle);
        pollObj(circle);
        pollObj(triangle);
    }

    private static void pollObj(Shape area) {
        output(area);
    }


    private static void output(Shape area) {
        System.out.println(area);
    }



}

