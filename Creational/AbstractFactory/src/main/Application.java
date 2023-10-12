package main;

import main.button.Button;
import main.checkbox.Checkbox;

public class Application {
    private GUIFactory guiFactory;
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }

    public void render(){
        button.render();
        checkbox.render();
    }
}
