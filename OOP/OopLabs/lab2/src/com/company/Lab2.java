package com.company;

public class Lab2 {
    public static double computeArea(Point3D first, Point3D second, Point3D third){
        double a = first.distanceTo(second);
        double b = first.distanceTo(third);
        double c = second.distanceTo(third);
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public static void main(String[] args) {

        Point3D myPoint = new Point3D();
        Point3D myPoint1 = new Point3D();
        Point3D myPoint2 = new Point3D();

        //координаты 1 точки
        myPoint.setX(6);
        myPoint.setY(3);
        myPoint.setZ(1);

        //координаты 2 точки
        myPoint1.setX(3);
        myPoint1.setY(1);
        myPoint1.setZ(1);

        //координаты 3 точки
        myPoint2.setX(1);
        myPoint2.setY(4);
        myPoint2.setZ(1);

        // Вывод метода рассчета расстояния между двумя точками
        System.out.print("Расстояние между точками: ");
        System.out.printf("%.2f", myPoint.distanceTo(myPoint1));
        System.out.println("");

        // Проверка на равенство координат трех точек и вывод площади треугольника в случае, если точки не равны
        if ((myPoint.equalCoords1(myPoint1)) | (myPoint.equalCoords1(myPoint2)) | (myPoint1.equalCoords1(myPoint2))){
            System.out.print("Невозможно посчитать площадь по заданным точкам");
        }
        else{
            System.out.print("Площадь треугольника: " + computeArea(myPoint, myPoint1, myPoint2));
        }
    }
}
