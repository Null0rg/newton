package de.gcsc.newton;

public class Newton {


    public double findRoot(Function f, Function df, double x, double tol) {
        double h = tol +1;

        int iter = 0;

        while(Math.abs(h) > tol) {
            h = f.eval(x)/df.eval(x);
            x -= h;

            iter++;

            if(iter > 100) {
                throw new RuntimeException("Cannot find root. Max Iter reached.");
            }
        }

        return x;
    }


    public static interface Function {
        public double eval(double x);
    }
}