package creational.abstract_factory.factory;

import creational.abstract_factory.product.Button;
import creational.abstract_factory.product.Checkbox;
import creational.abstract_factory.product.WindowsButton;
import creational.abstract_factory.product.WindowsCheckbox;

public class WindowsDisplay implements Display {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
