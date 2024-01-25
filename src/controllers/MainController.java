
package controllers;

import models.Quadratic_Equation;
import models.Superlative_Equation;

public class MainController {
    private Superlative_Equation e1;
    private Quadratic_Equation e2;
    
    public void creatSuperEqua(float a, float b) {
        e1 = new Superlative_Equation(a, b);
        System.out.println("RESULT");
        System.out.println(e1);
    }
    
    public void creatQuaEqua(float a, float b, float c) {
        e2 = new Quadratic_Equation(a, b, c);
        System.out.println("RESULT");
        System.out.println(e2);
    }
    
    public boolean checkEvenNum(float a) {
        if (a%2 == 0) {
            return true;
        }
        return false;
    }
    
    public boolean checkSquareNum(float a) {
        if (Math.sqrt(a) == (int) Math.sqrt(a)) {
            return true;
        }
        
        return false;
    }
}
