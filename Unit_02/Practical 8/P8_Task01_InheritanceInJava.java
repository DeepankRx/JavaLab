package unit_02;
/*
 * -extends keyword
 * -subclass
 * -superclass
 * -"Code Re-usability"
 *
 * class derived-class name "extends" base-class
 * {
 *  //methods and fields;
 * }
 * Types of inheritance :
 * -single inheritance
 * -multilevel inheritance
 * -"Multiple inheritance:" Java does not support multiple inheritance with classes
 * -It handles this feature by implementing more than one interface instead of extending
 * more then one class
 *
 * -Hierarchical Inheritance (tree?)?:Yes!
 * -Hybrid Inheritance? NO!
 * -Constructor calls flow in inheritance!
 * -Default constructor
 * -parameterized constructor.
 *
 * */
public class P8_Task01_InheritanceInJava {
    public static void main(String[] args) {
        Three g=new Three();
        g.methodOne();
        g.methodTwo();
        g.methodOne();
        g.methodThree();
        // Two two=new Two(1);
        D obj=new D(2);
        obj.methodFour();

    }
}
class One{
    int a;
    One(int x){
        System.out.println("One Constructor!");
    }
    public void methodOne() {
        System.out.println("FirstMethod!");
    }
}

class Two extends One{
    int b;
    Two(int x){
        super(3);
        b=x;
        System.out.println("Two");
    }
    public void methodTwo() {
        System.out.println("Second Method!");
    }
}

class Three extends Two{
    int c;
    Three(){
        super(1);
        System.out.println("Three Constructor!");
    }
    Three(int x){
        super(1);
        c=x;
        System.out.println("Three");
    }
    public void methodThree() {
        System.out.println("Second Method!");
    }
}

class A{
    int a;
    A(int a1){
        a=a1;
    }
    public void methodOne() {
        System.out.println(a);
    }
}
class B extends A{
    int b;
    B(int x){
        super(10);
        b=x;
    }
    public void methodTwo() {
        System.out.println(b);
    }
}
class C extends A{
    int c;
    C(){
        super(10);
        c=10;
    }
    public void methodThree() {
        System.out.println(c);
    }
}
class D extends A{
    int d;
    D(int d1){
        super(d1);
        d=d1;
    }
    public void methodFour() {
        System.out.println(d);
    }
}