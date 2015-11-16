import java.awt.*;
import java.util.Scanner;
import java.util.Locale;

public interface TriangleArea {
    public static void main(String[] args){
        Locale.setDefault(Locale.ROOT);

        Scanner sc = new Scanner(System.in);
        Point pointA = new Point();
        pointA.setLocation(sc.nextInt(),sc.nextInt());
        Point pointB = new Point();
        pointB.setLocation(sc.nextInt(), sc.nextInt());
        Point pointC = new Point();
        pointC.setLocation(sc.nextInt(), sc.nextInt());

        double area = triangleArea(pointA, pointB, pointC);
        System.out.println(area);
    }

    public static double triangleArea(Point pointA, Point pointB, Point pointC){

        double area = (pointA.getX()* (pointB.getY() - pointC.getY()) + pointB.getX() * (pointC.getY() - pointA.getY())
       + pointC.getX() * (pointA.getY() - pointB.getY())) / 2;

        if (area < 0){
            return - area;
        }
        return area;
    }
}
