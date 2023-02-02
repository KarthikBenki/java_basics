package oops.fraction;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) denominator = 1;
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) denominator = 1;
        this.denominator = denominator;
        simplify();
    }

    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for (int i = 2; i <= smaller; i++) {
            if (numerator % i == 0 && denominator % i == 0) gcd = i;
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public void print() {
        if (denominator != 1)
            System.out.println(numerator + "/" + denominator);
        System.out.println(numerator);
    }

    public void increment() {
        numerator = numerator + denominator;
        simplify();
    }

    public void add(Fraction f) {
        numerator = this.numerator * f.denominator + f.numerator * this.denominator;
        denominator = this.denominator * f.denominator;
        simplify();
    }

    public static Fraction add(Fraction f1,Fraction f2){
        int newNumerator = f1.numerator * f2.denominator
                + f2.numerator * f1.denominator;
        int newDenominator = f1.denominator * f2.denominator;
        return new Fraction(newNumerator,newDenominator);
    }
}
