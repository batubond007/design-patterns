package main;

import main.checkbox.Checkbox;
import main.button.Button;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
