public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(){

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta;
        return delta = (Math.pow(this.b, 2) - (4 * this.a * this.c));
    }

    public double getRoot1() {
        double r1 = (- this.b + (Math.sqrt(Math.pow(this.b , 2)) - (4 * this.a * this.c))) / (2 * this.a);
        return r1;
    }

    public double getRoot2() {
        double r2 = (- this.b - (Math.sqrt(Math.pow(this.b , 2)) - (4 * this.a * this.c))) / (2 * this.a);
        return r2;
    }
}
