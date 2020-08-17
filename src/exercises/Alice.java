package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String Al = "Alice was beginning to get very tired of sitting by her sister on the" +" "+
                "bank, and of having nothing to do: once or twice she had peeped into the" +" "+
                "book her sister was reading, but it had no pictures or conversations in" +" "+
                "it, 'and what is the use of a book,' thought Alice 'without pictures or" +" "+
                "conversation?'";

        String Al2= Al.toLowerCase();

        System.out.println("what word?");

        String word = input.nextLine();

        String word2 = word.toLowerCase();

        System.out.println(Al2.contains(word2));

        System.out.println(Al2.indexOf(word2));

        System.out.println(word2.length());

        String AL3=Al2.replaceAll(word2,"");

        System.out.println(AL3);

    }

}
