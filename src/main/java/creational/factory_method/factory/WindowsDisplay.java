package creational.factory_method.factory;

import creational.factory_method.product.Button;
import creational.factory_method.product.WindowsButton;

public class WindowsDisplay extends Display {
    @Override
    public Button initializeButton() {
        return new WindowsButton();
    }
}
