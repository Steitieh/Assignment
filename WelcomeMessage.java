import java.util.Scanner;

public class WelcomeMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name please :) : ");
        String name = scanner.nextLine();
        System.out.print("Enter your age please: ");
        String age = scanner.nextLine();
        System.out.println("Welcome, " + name + "! \n Hope you have a great day!!");
        System.out.println("You are " + age " years old!!");
        scanner.close();
    }
}
