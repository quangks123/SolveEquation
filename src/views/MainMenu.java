
package views;

import controllers.MainController;
import controllers.Validation;

public class MainMenu extends Menu{
    Validation val = new Validation();
    MainController mc = new MainController();

    public MainMenu(String title, String[] choices) {
        super(title, choices);
    }

    @Override
    public void execute(int ch) {
        float a, b, c;
        switch (ch) {
            case 1:
                System.out.println("SOLVING : ax + b = 0");
                while (true) {                    
                    System.out.print("a = ");
                    a = val.inputFloat();
                    if (a == Float.MIN_VALUE) {
                        System.out.println("Re-enter");
                    } else {
                        break;
                    }
                }
                
                while (true) {                    
                    System.out.print("b = ");
                    b = val.inputFloat();
                    if (b == Float.MIN_VALUE) {
                        System.out.println("Re-enter");
                    } else {
                        break;
                    }
                }
                
                mc.creatSuperEqua(a, b);
                
                if (mc.checkEvenNum(a)) {
                    System.out.println("a is even number");
                } else {
                    System.out.println("a is odd number");
                }
                
                if (mc.checkSquareNum(a)) {
                    System.out.println("a is square number");
                } else {
                    System.out.println("a is not square number");
                }

                
                if (mc.checkEvenNum(b)) {
                    System.out.println("b is even number");
                } else {
                    System.out.println("b is odd number");
                }
                
                
                if (mc.checkSquareNum(b)) {
                    System.out.println("b is square number");
                } else {
                    System.out.println("b is not square number");
                }
                
                break;
            case 2: 
                System.out.println("SOLVING : ax^2 + bx + c = 0");
                while (true) {                    
                    System.out.print("a = ");
                    a = val.inputFloat();
                    if (a == Float.MIN_VALUE) {
                        System.out.println("Re-enter");
                    } else {
                        break;
                    }
                }
                
                while (true) {                    
                    System.out.print("b = ");
                    b = val.inputFloat();
                    if (b == Float.MIN_VALUE) {
                        System.out.println("Re-enter");
                    } else {
                        break;
                    }
                }
                
                while (true) {                    
                    System.out.print("c = ");
                    c = val.inputFloat();
                    if (c == Float.MIN_VALUE) {
                        System.out.println("Re-enter");
                    } else {
                        break;
                    }
                }
                
                mc.creatQuaEqua(a, b, c);
                
                if (mc.checkEvenNum(a)) {
                    System.out.println("a is even number");
                } else {
                    System.out.println("a is odd number");
                }
                
                if (mc.checkSquareNum(a)) {
                    System.out.println("a is square number");
                } else {
                    System.out.println("a is not square number");
                }
                
                if (mc.checkEvenNum(b)) {
                    System.out.println("b is even number");
                } else {
                    System.out.println("b is odd number");
                }
                
                if (mc.checkSquareNum(b)) {
                    System.out.println("b is square number");
                } else {
                    System.out.println("b is not square number");
                }
                
                if (mc.checkEvenNum(c)) {
                    System.out.println("c is even number");
                } else {
                    System.out.println("c is odd number");
                }
                
                if (mc.checkSquareNum(c)) {
                    System.out.println("c is square number");
                } else {
                    System.out.println("c is not square number");
                }
                
                break;
        }
    }    
}
