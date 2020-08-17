package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius");
        double Radius = input.nextDouble();
        System.out.println(Circle.getArea(Radius));
    }


}
