package ru.croc.task4;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(1, 1, 1,"b0b");
        Figure rectangle = new Rectangle(1, 1, 2, 2,"Tree");
        Annotation firstAnnotation = new Annotation("C",circle);
        Annotation secondAnnotation = new Annotation("R",rectangle);
        Annotation[] annotations = new Annotation[] {firstAnnotation, secondAnnotation};

        for (Annotation annotation: annotations) {
            System.out.println(annotation.toString());
        }

    }
}
