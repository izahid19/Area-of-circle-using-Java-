import java.util.*;
public class Areaofcircle {
    public static void main ( String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Radius of Circle : ");
        float r = sc.nextFloat();
        
        float area = 3.14f * r * r ;
        System.out.println("Area of Circle = " + area);

    }
}