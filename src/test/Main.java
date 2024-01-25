
package test;

import views.MainMenu;

public class Main {
    public static void main(String[] args) {
        String[] choices = {"Calculate Superlative Equation".toUpperCase(), "Calculate Quadratic Equation".toUpperCase(), "EXIT"};
        new MainMenu("===== MAIN MENU =====", choices).run();
    }
}
