package dsa.test;

public class Test {
    public static void main(String[] args) {

    }
}


class Student{
    String name;
    int rollNo;
    Student(int n){
        rollNo = n;
    }
    void print(){
        System.out.print(rollNo +" " + name+" ");
    }
}

class Use {
    public static void main(String[] args) {
        Student s = new Student(56);
        s.print();
    }
}

class A{
    A(){
        System.out.print("first ");
    }
}
class B extends A{
    B(){
        System.out.print("second ");
    }
}
class C extends B{
    C(){
        System.out.print("third ");
    }
}
class Main{
    public static void main (String[] args) {
        C c=new C();
    }
}


