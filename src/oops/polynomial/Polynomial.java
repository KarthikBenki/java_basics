package oops.polynomial;


import oops.dynamicarray.DynamicArray;

public class Polynomial {

    private DynamicArray dynamicArray;

    public Polynomial() {
        dynamicArray = new DynamicArray();
    }

    public int size() {
        return dynamicArray.size();
    }

    public void setCoefficient(int degree, int coeff) {
        dynamicArray.set(degree, coeff);
    }

    public int getCoefficient(int degree) {
        return dynamicArray.get(degree);
    }

    public void print() {
        for (int i = 0; i < dynamicArray.size(); i++) {
            if (dynamicArray.get(i) != 0) {
                System.out.print(dynamicArray.get(i) + "x" + i + " ");
            }
        }
    }


    public Polynomial add(Polynomial p) {

        for (int i = 0; i < Math.min(this.size(), p.size()); i++) {
            dynamicArray.set(i, this.getCoefficient(i) + p.getCoefficient(i));
        }
        return this;
    }

    public Polynomial subtract(Polynomial p) {

        for (int i = 0; i < Math.min(this.size(), p.size()); i++) {
            dynamicArray.set(i, this.getCoefficient(i) - p.getCoefficient(i));
        }
        return this;
    }

    public Polynomial multiply(Polynomial p) {
        Polynomial ans = new Polynomial();
        for (int i = 0; i < p.size(); i++) {
            for (int j = 0; j < this.size(); j++) {
                int deg = i + j;
                int coEff = p.getCoefficient(i) * this.getCoefficient(j);
                int oldCoEff = ans.getCoefficient(deg);
                ans.setCoefficient(deg, coEff + oldCoEff);
            }
        }
        return ans;
    }
}
