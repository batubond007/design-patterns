package main;

import main.button.Button;
import main.button.MacOSButton;
import main.checkbox.Checkbox;
import main.checkbox.MacOSCheckbox;

public class MacOSGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
