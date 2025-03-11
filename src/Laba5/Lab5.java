package Laba5;

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите координаты первой точки: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double z1 = sc.nextDouble();

        System.out.println("Введите координаты второй точки: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double z2 = sc.nextDouble();

        System.out.println("Введите координаты третьей точки: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double z3 = sc.nextDouble();

        Point3d p1 = new Point3d(x1, y1, z1);
        Point3d p2 = new Point3d(x2, y2, z2);
        Point3d p3 = new Point3d(x3, y3, z3);

        if(p1.equals(p2) || p1.equals(p3) || p2.equals(p3)) {
            System.out.println("Ошибка. Точки совпадают");
        } else {
            double area = computeArea(p1, p2, p3);
            System.out.println("Площадь треугольника: " + area);
        }
    }

    public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
        double dx = p1.distanceTo(p2);
        double dy = p2.distanceTo(p3);
        double dz = p3.distanceTo(p1);

        double g = (dx + dy + dz) / 2;

        return Math.round(Math.sqrt(g * (g - dx) * (g - dy) * (g - dz)) * 100.0) / 100.0;




    }
}
