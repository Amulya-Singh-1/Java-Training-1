class A{
    protected String asecret="haha no secret";
    public void show(){
        System.out.println(" parent A ");
    }
}
class B extends A{ 
    public void show(){
        System.out.println(" parent B ");
        System.out.println(asecret);
    }
}
class C extends A{
    public void show(){
        System.out.println(" parent C ");
        System.out.println(asecret);
    }
}
class D{
    protected String data="inside D";
    public void show(){
        System.out.println(" parent D ");
        System.out.println();
    }
}
public class Inheritance extends D{
    // multilevel Inheritance
    // hierarchial inheritance
    // hybrid inheritance
    public static void main(String[] args) {
        D obj4=new D();
        System.out.println(obj4.data);
        B obj =new B();
        C obj2= new C();
        D obj3=new D();
        obj.show();
        obj2.show();
        obj3.show();
    }
}
