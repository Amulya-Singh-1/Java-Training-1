class A{
    // public void something(){
    //     System.out.println("parent A");
    // }
    public double area(double r){
        return ( (double)3.14 * (double)Math.pow(r,2));
    }
    public float area(int a){
        return (float)Math.pow(a,2);
    }
    public float area(int l , int b){
        return (float)(l*b);
    }
}
public class Polymorphism extends  A{
    // @Override
    // public void something(){
    //     System.out.println(" child ");
    // }
    public static void main(String[] args){
        A obj=new Polymorphism();
        // obj.something();
        // System.out.println("main");
        System.out.println( obj.area(2.5));
        System.out.println( obj.area(2));
        System.out.println( obj.area(2,3));

    }
}
