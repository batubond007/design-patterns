package main;

import main.button.Button;
import main.button.WindowsButton;
import main.checkbox.Checkbox;
import main.checkbox.WindowsCheckbox;

public class WindowsGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
