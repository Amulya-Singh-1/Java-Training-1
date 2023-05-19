abstract class Exm{
    // abstract void greet();
    abstract void shape();
}
class Rectangle extends Exm{
    void shape(){
        System.out.println("drawing a rectangle");
    }
}
interface Circle extends Exm{ 
    public void shape2();
}

class Abstraction extends Rectangle implements Circle {
    // void greet(){ System.out.println("welcome to abstraction");}
    public static void main(String[] args) {
        // Exm obj=new Abstraction();
        // obj.greet();
        Object obj2=new Object();
        System.out.println(obj2.getClass());
        // obj2.shape();
        // Exm obj3=new Circle();
        // obj3.shape();
    }

    public void shape2() {

    }
}
