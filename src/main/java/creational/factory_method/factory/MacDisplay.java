package creational.factory_method.factory;

import creational.factory_method.product.Button;
import creational.factory_method.product.MacButton;

public class MacDisplay extends Display {
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
