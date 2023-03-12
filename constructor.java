import java.rmi.server.SkeletonNotFoundException;

public class constructor {
  public static void main(String args[]){
    Student s1=new Student();
    s1.name="JIt";
    s1.roll=17;
    s1.password="jit12345";
    
    s1.marks[0]=45;
    s1.marks[1]=31;
    s1.marks[2]=56;
    s1.marks[1]=76;
    Student s2=new Student(s1);
    s2.password="xys";
    s1.marks[2]=21;

    for (int i = 0; i < 3; i++) {
        System.out.println(s2.marks[i]);
    }
}
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    Student(String name){
        marks=new int[3];
        this.name=name;
        System.out.println(this.name);
    }
    Student(){
        marks=new int[3];
        System.out.println("constructor called....");

    }
    Student(int roll){
        marks=new int[3];
        this.roll=roll;
        System.out.println(this.roll);
    }
    //shallow copy constructor
    // Student (Student s1){
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks=s1.marks;
    // }
    //deep copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i]=s1.marks[i];
        }
    }

}