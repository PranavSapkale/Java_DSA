import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the side of Square :");
        float square=a.nextFloat();
        float t =area(square);
        System.out.println(t);

        System.out.println("Enter the length and breadth of rectangle :");
        float length=a.nextFloat();
        float breadth=a.nextFloat();
        float g = area(length,breadth);
        System.out.println(g);

        System.out.println("Enter the radius of the circle");
        double radius=a.nextDouble();
        double y=area(radius);
        System.out.println(y);



    }
    static float area(float  s){
        return s*s;
    }
    static float area(float l,float b){
        return l*b;
    }
    static double area(double r){
        double pie= 3.14F;
        return pie*r*r;
    }
}
