package InterfaceOOP.Polymorphism;

public class CompileTime {
    public int addition(int a, int b) {
        return a + b;
    }

    public double addition(int a, double b) {
        return a + b;
    }

    public double addition(double a, double b) {
        return a + b;
    }

    public int addition(int a, int b, int c) {
        return a + b + c;
    }

    public double addition(double a, int b, double c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] arg) {
        CompileTime poly = new CompileTime();
        System.out.println(poly.addition(2, 4));
        System.out.println(poly.addition(3, 6.8));
        System.out.println(poly.addition(2, 6, 8, 10));


    }
}
