package unit_02;
/*An interface is a completely (100%) "abstract class",
 * -that is used to group related methods with empty bodies
 *
 * -Need of interface?
 * -multiple interface can be implemented at the same time in on eclass?
 *
 * -Can an interface extends another inteface?
 *
 * */

public class P12_Task01_InterfaceInJava {
    public static void main(String[] args) {
        C1 obj=new C1();
        obj.funcA();
        obj.funcB();
    }
    public void animalSound() {

    }
    public void run() {

    }
}
//interface (100% Abstract Class)
interface Animal{
    public void animalsound();//interface method(does not have a body)
    public void run();//interface method (does not have a body)
}
//interface
interface Human{
    public void humansound();

    public void run1();
}
//Multiple interfaces can be implemented at the same time!
class Species implements Animal,Human{
    public void animalSound() {
        System.out.println("we are inside run method");
    }

    public void humanSound() {
        System.out.println("We are inside humanSound");
    }

    public void run1() {
        System.out.println("We are inside run method");
    }

    @Override
    public void humansound() {
        // TODO Auto-generated method stub

    }

    @Override
    public void animalsound() {
        // TODO Auto-generated method stub

    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

    }
}

interface A1{
    void funcA();
}
interface B1 extends A1{
    void funcB();
}
class C1 implements B1{
    public void funcA() {
        System.out.println("This is funcA from A1");
    }
    public void funcB() {
        System.out.println("This is funcB from A2");
    }
}