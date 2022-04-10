public class Multiple implements Operation {
    @Override
    public double operation(double a, double b) {
        System.out.println(" " + a + " * " + b + " = " + (a * b));
        return a * b;
    }
}
