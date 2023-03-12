public class oops{
    public static void main(String args[]){
    Pen p1=new Pen();//created a pen object called p1
    p1.setcolour("white");
    System.out.println(p1.colour);
   p1.settip(5);
    System.out.println(p1.tip);
    p1.colour="green";
    System.out.println(p1.colour);
    BankAcc jit=new BankAcc();
    jit.setusername("jitchak");
    System.out.println(jit.getusername());
    jit.setpassword("jit123");
    System.out.println(jit.getpassword());
    
    }
}
 class Pen{
   String colour;
    int tip;
    void setcolour(String newcolour){
      this.  colour=newcolour;

    }
    void settip(int newtip){
       this. tip=newtip;
    }
}
class BankAcc{
    private String username;
    
    private String password;
    String getusername(){
        return this.username;

    }
    String getpassword(){
        return this.password; 
    }
    void setusername(String username){
        this.username=username;
    }
    void setpassword(String pwd){
        password=pwd;
    }
}