/* Write a java program to find Simple interest using parameterize constructor*/

package practice;

public class Paracon {
    double amt, r, n, si;

    Paracon(double amt, double n, double r) {
        this.amt = amt;
        this.n = n;
        this.r = r;
    }

    void cal() {
        si = (amt * n * r) / 100;
        System.out.println("Simple interest is: " + si);
    }

    public static void main(String[] args) {
        Paracon ob = new Paracon(1000.0, 10.0, 10.5);
        ob.cal();
    }
}
