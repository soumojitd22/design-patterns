package creational.abstract_factory.factory;

import creational.abstract_factory.product.Button;
import creational.abstract_factory.product.Checkbox;

public interface Display {

    // Factory methods (creation logic method)
    Button createButton();
    Checkbox createCheckbox();
}
