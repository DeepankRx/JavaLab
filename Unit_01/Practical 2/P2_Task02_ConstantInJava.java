package UNIT_1.Practical_2;
public class P2_Task02_ConstantsInJava {
    
    public static final float pi= 3.14f;

    void areaOfCircle(float radius)
    {
        System.out.println("Area of circle is " + pi * radius * radius);
    }
    public static void main(String[] args) {
        System.out.println(pi);

        P2_Task02_ConstantsInJava obj = new P2_Task02_ConstantsInJava();
        obj.areaOfCircle(5);
    }
}