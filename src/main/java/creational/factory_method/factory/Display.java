package creational.factory_method.factory;

import creational.factory_method.product.Button;
import creational.factory_method.product.WebButton;

public class Display {

    // Factory method (creation logic method)
    public Button initializeButton() {
        return new WebButton();
    }

    // Factory helper method (business logic method)
    public void show() {
        var button = initializeButton();
        System.out.println(button.displayButton());
    }
}
