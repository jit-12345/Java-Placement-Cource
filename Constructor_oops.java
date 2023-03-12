public class Constructor_oops {
    public static void main(String[] args){
    //   Student s1=new Student("JIT");
    //   System.out.println(s1.name); 
    // Student s1=new Student();
    // Student s2=new Student("Jit");
    // Student s3=new Student(11);
    // System.out.println(s3.getroll());
    Student s1=new Student();
    s1.name="Jit";
    s1.roll=11;
    s1.password="jit123";//dhore nao s1 password vule gache
    Student s2=new Student(s1);
    s1.password="XYZ";
    s1.marks[0]=100;
    s1.marks[1]=79;
    s1.marks[2]=95;
    s1.marks[1]=89;
    // for (int i = 0; i < 3; i++) {
    //     System.out.println(s2.marks[i]);
    // } 
}
 }

class Student
{
     String name;
     int roll;
     String password;
     int marks[];
    // Student(String name){
    //     this.name=name;
    // }
    //copy constructor
    //swallow copy constructor
    // Student(Student s1){
    //     marks= new int[3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     //this.marks=s1.marks;
       
    // }
    Student(){
       // marks= new int[3];
        System.out.println("Constructor is called.....");
    }
    Student (Student s1){
        marks= new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i]=s1.marks[i];
        }
    }
   
    Student(String name){
        marks= new int[3];
        this.name=name;
    }
    Student(int roll){
        marks= new int[3];
        this.roll=roll;
    }
    
    //this concept is called condtructor overloading
    int getroll(){
        return roll;
    }
}
