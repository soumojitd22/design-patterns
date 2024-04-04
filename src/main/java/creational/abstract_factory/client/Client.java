package creational.abstract_factory.client;

import creational.abstract_factory.factory.Display;
import creational.abstract_factory.product.Button;
import creational.abstract_factory.product.Checkbox;

public class Client {
    private final Display display;
    public Client(Display display) {
        this.display = display;
    }

    public void showUI() {
        Button button = display.createButton();
        Checkbox checkbox = display.createCheckbox();

        System.out.println(button.displayButton());
        System.out.println(checkbox.displayCheckbox());
    }
}
