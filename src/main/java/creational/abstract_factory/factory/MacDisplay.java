package creational.abstract_factory.factory;

import creational.abstract_factory.product.Button;
import creational.abstract_factory.product.Checkbox;
import creational.abstract_factory.product.MacButton;
import creational.abstract_factory.product.MacCheckbox;

public class MacDisplay implements Display {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
