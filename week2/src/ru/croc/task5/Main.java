package ru.croc.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите координаты");

        Scanner scanner = new Scanner(System.in);
        int in1,in2,in3,in4 = scanner.nextInt();
        String name = scanner.nextLine();
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
