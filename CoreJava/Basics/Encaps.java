public class Encaps {
    private String name="Amulya";
    // public String getname(){
    //     return name;
    // }
    public void setname(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        Encaps myobj=new Encaps();
        // System.out.println(myobj.getname());
        myobj.setname("Idonno");
        // System.out.println(myobj.getname());
    }
}
