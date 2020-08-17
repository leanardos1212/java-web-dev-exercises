package exercises;
import java.util.Scanner;

public class Numeric {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is the length of the rectangle:");
        int length = input.nextInt();
        System.out.println("width:");
        int width = input.nextInt();
        System.out.println(length*width);
    }
}
