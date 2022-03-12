package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x =  x2 - x1;
        double y =  y2 - y1;
        x = Math.pow(x, 2);
        y = Math.pow(y, 2);
        return Math.sqrt(x + y);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(0, 0, 5, 5);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result(0, 0) to (5, 5) " + result2);
    }
}
