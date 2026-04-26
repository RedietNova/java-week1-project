
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        Person person = new Person(name);

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Study");
            System.out.println("2. Eat");
            System.out.println("3. Sleep");
            System.out.println("4. Check Status");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    person.study();
                    break;
                case 2:
                    person.eat();
                    break;
                case 3:
                    person.sleep();
                    break;
                case 4:
                    person.showStatus();
                    break;
                case 5:
                    System.out.println("👋 Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        input.close();
    }
}