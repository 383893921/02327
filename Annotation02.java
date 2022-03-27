package annotation;


public class Annotation02{
    public static void main(String[] args) {

        m2(
                new MyInterface() {
                    @Override
                    public void m1() {
                        System.out.println("aaas");
                    }
                }
        );
    }
    static void m2(MyInterface myInterface){
        myInterface.m1();
    }
}

@FunctionalInterface
interface MyInterface{
    void m1();
}
class C implements MyInterface{

    @Override
    public void m1() {

    }
}