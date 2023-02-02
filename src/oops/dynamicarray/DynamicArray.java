package oops.dynamicarray;

public class DynamicArray {
    private int data[];
    private int nextElementIndex;

    public DynamicArray() {
        this.data = new int[5];
        nextElementIndex = 0;
    }

    public void add(int value) {
        if (nextElementIndex == data.length) {
            doubleTheCapacity();
        }
        data[nextElementIndex++] = value;
    }

    private void doubleTheCapacity() {
        int temp[] = data;
        data = new int[temp.length * 2];

        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }

    public int size() {
        return nextElementIndex;
    }

    public int get(int index) {
        if (index >= nextElementIndex) throw new IllegalArgumentException("Index out of bound");
        return data[index];
    }

    public void set(int index, int value) {
        if (index>=nextElementIndex) throw new  IllegalArgumentException("Index out of bound");
        data[index] = value;
    }

    public boolean isEmpty() {
        return nextElementIndex == 0;
    }

    public void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public int removeLast() {
        int temp = data[nextElementIndex - 1];
        nextElementIndex--;
        return temp;
    }
}
