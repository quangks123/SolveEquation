
package models;

public class Quadratic_Equation {
    private float a, b, c;

    public Quadratic_Equation() {
        a = b = c = 0;
    }

    public Quadratic_Equation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    
    public float getDelta() {
        return b*b - 4*a*c;
    }
    
    public float[] getSolution() {
        float[] s = new float[0];
        if (getDelta() > 0) {
            s = new float[2];
            s[0] = (float) (-b + Math.sqrt(getDelta())/(2*a));
            s[1] = (float) (-b - Math.sqrt(getDelta())/(2*a));
            return s;
        } else if (getDelta() == 0) {
            s = new float[1];
            s[0] = -b/(2*a);
            return s;
        } else {
            return s;
        }
    }

    @Override
    public String toString() {
        float[] s = getSolution();
        if (s.length == 0) {
            return "Equation has no solution!!";
        } 
        if (s.length == 1) {
            return "Solution: x = " + s[0];
        }
        
        return "Solution\nx1 = " + s[0] + "\nx2 = " + s[1];
        
    }
    
    
}
