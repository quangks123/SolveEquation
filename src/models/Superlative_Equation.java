
package models;

public class Superlative_Equation {
    private float a, b;

    public Superlative_Equation() {
        a = b = 0;
    }

    public Superlative_Equation(float a, float b) {
        this.a = a;
        this.b = b;
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

    public float getSolution() {
        try {
            return -b/a;
        } catch (Exception e) {
            return Float.MIN_VALUE;
        }
    }   

    @Override
    public String toString() {
        if (a == 0 && b == 0) {
            return "Equation has infinity solution";
        } else if (a == 0 && b != 0) {
            return "Equation has no solution";
        } else {
            return "Solution is: " + getSolution();
        }
    }
}
