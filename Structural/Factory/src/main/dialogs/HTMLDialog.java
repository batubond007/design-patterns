package main.dialogs;

import main.buttons.Button;
import main.buttons.HTMLButton;

public class HTMLDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
