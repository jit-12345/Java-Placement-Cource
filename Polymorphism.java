public class Polymorphism {
    public static void main(String[] args) {
        
        // Calculator calc=new Calculator();
        // System.out.println(calc.sum(3,4));
        // System.out.println(calc.sum((float)1.5,(float)6.3));
        // System.out.println(calc.sum(3,4,1));
        Dog d=new Dog();
        d.eat();
    }
}
   class Animal{
    void eat(){
        System.out.println("It eats!");
    }
   } 
   class Dog extends Animal{
    void eat(){
        System.out.println("It eats guuu!");
    }
   }

class Calculator{
    int sum(int a,int b){
      return a+b;  
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
