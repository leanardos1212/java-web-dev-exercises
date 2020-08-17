package exercises;
import java.util.Scanner;

public class Mpg {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("miles?");
        int Miles=input.nextInt();
        System.out.println("gallons?");
        int Gallons=input.nextInt();
        System.out.println(Miles/Gallons+"Mpg");
    }
}
