public class static_s1 {
   public static void main(String[] args) {
    Student s1=new Student();
    s1.Setname("Jit");
    System.out.println(s1.name);
    s1.Schoolname="KCHS";
    Student s2=new Student();
    System.out.println(s2.Schoolname);
   } 
}
class Student{
    String name;
    int roll;
    static String Schoolname;
    void Setname(String name){
        this.name=name;
    }
    String getname(){
        return this.name;
    }

}
