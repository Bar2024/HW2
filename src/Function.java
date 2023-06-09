public abstract class Function {

    public abstract double valueAt(double x);

    public abstract String toString();

    public abstract String derivative();

    public abstract double bisectionMethod(double a, double b, double epsilon);

    public abstract double newtonRaphsonMethod(double a, double epsilon);

    public abstract double newtonRaphsonMethod(double a);

    public abstract String taylorPolynomial(int n);
}
