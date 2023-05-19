import java.util.*;
public class Rough {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Object obj =new Object();
        System.out.println(obj.getClass().getTypeName());
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
        System.gc();
        
    }   
    @Override
    public void finalize(){
        System.out.println(" finalize method called .... garbage collection done ");
    }
}
