package creational.factory_method.client;

import creational.factory_method.factory.Display;
import creational.factory_method.factory.MacDisplay;
import creational.factory_method.factory.WindowsDisplay;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Enter 1 for Windows or 2 for Mac: ");
        try (Scanner sc = new Scanner(System.in)) {
            int input = sc.nextInt();
            Display display = switch (input) {
                case 1 -> new WindowsDisplay();
                case 2 -> new MacDisplay();
                default -> new Display();
            };

            display.show();
        }
    }
}
