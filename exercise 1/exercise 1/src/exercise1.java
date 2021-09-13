import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("Hello, "+name+", nice to meet you!" );
    }
}
