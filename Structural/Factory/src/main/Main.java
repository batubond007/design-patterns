package main;

import main.dialogs.HTMLDialog;
import main.dialogs.WindowsDialog;

public class Main {
    public static void main(String[] args) {
        var htmlDialog = new HTMLDialog();
        htmlDialog.renderWindow();

        var windowsDialog = new WindowsDialog();
        windowsDialog.renderWindow();
    }
}
