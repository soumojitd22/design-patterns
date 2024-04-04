package creational.abstract_factory.client;

import creational.abstract_factory.factory.Display;
import creational.abstract_factory.factory.MacDisplay;
import creational.abstract_factory.factory.WindowsDisplay;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Enter 1 for Windows or 2 for Mac: ");
        try (Scanner sc = new Scanner(System.in)) {
            int input = sc.nextInt();
            Display display = switch (input) {
                case 1 -> new WindowsDisplay();
                case 2 -> new MacDisplay();
                default -> throw new RuntimeException("Invalid input");
            };

            var client = new Client(display);
            client.showUI();
        }
    }
}
